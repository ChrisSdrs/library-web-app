package com.library.controller;

import com.library.model.MemberModel;
import com.library.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private MemberService memberService;

    @GetMapping(value = "/home")
    public String login() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        MemberModel userDetails = memberService.findByUsername(username).get();
        String role = userDetails.getRole();
        if (role.matches("Admin")){
            return "redirect:/admin";
        }
        else if(role.matches("Owner")){
            return "redirect:/user";
        }
        return "redirect:/login";
    }

}
