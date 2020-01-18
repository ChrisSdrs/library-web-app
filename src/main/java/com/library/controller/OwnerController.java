package com.library.controller;

import com.library.model.BookModel;
import com.library.model.BorrowModel;
import com.library.model.MemberModel;
import com.library.service.BookService;
import com.library.service.BorrowService;
import com.library.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class OwnerController {

    private static final String USER_DETAILS = "memberDetails";
    private static final String MEMBER_BORROWS = "memberBorrows";
    private static final String MEMBER_BOOKS = "memberBooks";
    private static final String REPORT_MODEL = "reportModel";

    @Autowired
    private MemberService memberService;

    @Autowired
    private BookService bookService;

    @Autowired
    private BorrowService borrowService;

    @GetMapping(value = "/member")
    public String borrowsToday(Model model) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();

        MemberModel userDetails = memberService.findByUsername(username).get();
        String member = userDetails.getMembNumber();
        List<BookModel> memberBooks = bookService.findByMember(member);


        List<BorrowModel> memberBorrows = borrowService.findByMember(member);

//        int pendingRepairs = getStatusResult(userRepairs, "Pending");
        int inProgressBorrows = getStatusResult(memberBorrows, "In Progress");
        int completedBorrows = getStatusResult(memberBorrows, "Completed");
        int totalBorrows = inProgressBorrows + completedBorrows;

//        if (totalBorrows != 0) {
//            double inProgress =  ((double) inProgressBorrows / (double) totalBorrows) * 100;
//            double completed = ( (double) completedBorrows / (double)  totalBorrows) * 100;
//
//            ReportModel reportModel = new ReportModel();
//            reportModel.setPendingRepairs(pending);
//            reportModel.setInProgressRepairs(inProgress);
//            reportModel.setCompletedRepairs(completed);
//            model.addAttribute(REPORT_MODEL, reportModel);
//        }



        model.addAttribute(USER_DETAILS, userDetails);
        model.addAttribute(MEMBER_BORROWS, memberBorrows);
        model.addAttribute(MEMBER_BOOKS, memberBooks);

        return "pages/owner";
    }

    private int getStatusResult(List<BorrowModel> userRepairs, String statusGiven){
        int result = 0;
        String status;
        BorrowModel currentRepairModel;
        for( int i=0; i<userRepairs.size(); i++ ) {
            currentRepairModel = (userRepairs.get(i));
            status = currentRepairModel.getStatus();
            if (status.matches(statusGiven)) {
                result += 1;
            }
        }
        return result;
    }

}
