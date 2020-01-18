//package com.library.controller;
//
//import com.library.model.BookModel;
//import com.library.model.BorrowModel;
//import com.library.model.ReportModel;
//import com.library.model.MemberModel;
//import com.library.service.BookService;
//import com.library.service.RepairService;
//import com.library.service.MemberService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.util.List;
//
//@Controller
//public class OwnerController {
//
//    private static final String USER_DETAILS = "userDetails";
//    private static final String USER_PROPERTIES = "userProperties";
//    private static final String USER_REPAIRS = "userRepairs";
//    private static final String REPORT_MODEL = "reportModel";
//
//    @Autowired
//    private MemberService userService;
//
//    @Autowired
//    private BookService bookService;
//
//    @Autowired
//    private RepairService repairService;
//
//    @GetMapping(value = "/user")
//    public String repairsToday(Model model) {
//        String username = SecurityContextHolder.getContext().getAuthentication().getName();
//
//        MemberModel userDetails = userService.findByUsername(username).get();
//        String ssn = userDetails.getSsn();
//        List<BookModel> userProperties = bookService.findByOwner(ssn);
//
//
//        List<BorrowModel> userRepairs = repairService.findByOwner(ssn);
//
//        int pendingRepairs = getStatusResult(userRepairs, "Pending");
//        int inProgressRepairs = getStatusResult(userRepairs, "In Progress");
//        int completedRepairs = getStatusResult(userRepairs, "Completed");
//        int totalRepairs = pendingRepairs + inProgressRepairs + completedRepairs;
//
//        if (totalRepairs != 0) {
//            double pending = ((double) pendingRepairs / (double)  totalRepairs) * 100;
//            double inProgress =  ((double) inProgressRepairs / (double) totalRepairs) * 100;
//            double completed = ( (double) completedRepairs / (double)  totalRepairs) * 100;
//
//            ReportModel reportModel = new ReportModel();
//            reportModel.setPendingRepairs(pending);
//            reportModel.setInProgressRepairs(inProgress);
//            reportModel.setCompletedRepairs(completed);
//            model.addAttribute(REPORT_MODEL, reportModel);
//        }
//
//
//
//        model.addAttribute(USER_DETAILS, userDetails);
//        model.addAttribute(USER_PROPERTIES, userProperties);
//        model.addAttribute(USER_REPAIRS, userRepairs);
//
//        return "pages/owner";
//    }
//
//    private int getStatusResult(List<BorrowModel> userRepairs, String statusGiven){
//        int result = 0;
//        String status;
//        BorrowModel currentRepairModel;
//        for( int i=0; i<userRepairs.size(); i++ ) {
//            currentRepairModel = (userRepairs.get(i));
//            status = currentRepairModel.getStatus();
//            if (status.matches(statusGiven)) {
//                result += 1;
//            }
//        }
//        return result;
//    }
//
//}
