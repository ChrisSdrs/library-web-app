package com.library.controller.member;


import com.library.forms.MemberEditForm;
import com.library.model.MemberModel;
import com.library.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import static com.library.utils.GlobalAttributes.ALERT_MESSAGE;
import static com.library.utils.GlobalAttributes.ALERT_TYPE;

@Controller
    public class MemberEditController {
        private static final String MEMBER_FORM = "memberEditForm";
        private static final String MEMBER = "member";

        @Autowired
        private MemberService memberService;


        @PostMapping(value = "/admin/users/{id}/delete")
        public String deleteUser(@PathVariable Long id, RedirectAttributes redirectAttrs) {
            memberService.deleteById(id);
            redirectAttrs.addFlashAttribute(ALERT_TYPE, "info");
            redirectAttrs.addFlashAttribute(ALERT_MESSAGE, "Member Deleted successfully!");
            return "redirect:/admin/users";
        }

        @PostMapping(value = "/admin/users/{id}/edit")
        public String editMember(@PathVariable Long id, Model model) {
            MemberModel memberModel = memberService.findById(id).get();
            model.addAttribute(MEMBER_FORM, new MemberEditForm());
            model.addAttribute(MEMBER, memberModel);
            return "pages/user_edit";
        }

        @PostMapping(value = "/admin/users/edit")
        public String editUser(MemberModel memberModel, RedirectAttributes redirectAttrs) {
            memberService.updateMember(memberModel);
            redirectAttrs.addFlashAttribute(ALERT_TYPE, "success");
            redirectAttrs.addFlashAttribute(ALERT_MESSAGE, "Member Updated successfully!");

            return "redirect:/admin/users";
        }


    }
