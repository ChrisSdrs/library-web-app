package com.library.controller;

import com.library.model.BorrowModel;
import com.library.model.UserModel;
import com.library.service.BorrowService;
import com.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MemberController {

    private static final String USER_DETAILS = "userDetails";
    private static final String USER_BORROWS = "userBorrows";

    @Autowired
    private UserService userService;

    @Autowired
    private BorrowService borrowService;


    @GetMapping(value = "/user")
    public String getUserDetails(Model model) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();

        UserModel userDetails = userService.findByUsername(username).get();
        String membNumber = userDetails.getMembNumber();
        List<BorrowModel> userBorrows = borrowService.findByMembNumber(membNumber);



        model.addAttribute(USER_DETAILS, userDetails);
        model.addAttribute(USER_BORROWS, userBorrows);



        return "pages/member";
    }


}