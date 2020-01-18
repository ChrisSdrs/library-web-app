package com.library.controller;

import com.library.model.MemberModel;
import com.library.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;

import static com.library.utils.GlobalAttributes.USERNAME;
import static com.library.utils.GlobalAttributes.USER_ROLE;

@ControllerAdvice
public class GlobalAdviceController {

    @Autowired
    private MemberService memberService;

    @ModelAttribute
    public void globalAttributes(Model model, HttpServletRequest request) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        model.addAttribute(USERNAME, username);

        MemberModel userDetails = memberService.findByUsername(username).orElse(null);
        if(userDetails != null) {
            String userRole = userDetails.getRole();
            model.addAttribute(USER_ROLE, userRole);
        }
    }


}
