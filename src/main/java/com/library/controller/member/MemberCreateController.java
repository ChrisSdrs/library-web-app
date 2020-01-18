package com.library.controller.member;

import com.library.domain.Member;
import com.library.forms.MemberCreateForm;
import com.library.mappers.MemberFormToMemberMapper;
import com.library.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

import static com.library.utils.GlobalAttributes.ALERT_MESSAGE;
import static com.library.utils.GlobalAttributes.ALERT_TYPE;
import static javax.servlet.RequestDispatcher.ERROR_MESSAGE;


@Controller
    public class MemberCreateController {
        private static final String MEMBERS_FORM = "memberCreateForm";
        private static final String MEMBER_CREATE_ERROR = "memberCreateError";

        @Autowired
        private MemberService memberService;

        @Autowired
        private MemberFormToMemberMapper mapper;

        @GetMapping(value = "/admin/users/create")
        public String usersDynamic(Model model) {

            model.addAttribute(MEMBERS_FORM, new MemberCreateForm());
            return "pages/user_create";
        }

        @PostMapping(value = "/admin/users/create")
        public String createMember(Model model,
                                 @Valid @ModelAttribute(MEMBERS_FORM)
                                          MemberCreateForm memberCreateForm,
                                 BindingResult bindingResult, RedirectAttributes redirectAttrs) {

            if (bindingResult.hasErrors()) {
                //have some error handling here, perhaps add extra error messages to the model
                model.addAttribute(ERROR_MESSAGE, "an error occurred");
                return "pages/user_create";
            }

            Member member = mapper.toMember(memberCreateForm);
            if (isValidMemberEmptyFields(member)) {
                if (isValidMember(member) == "") {
                    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
                    String password = member.getPassword();
                    String encodedPW = encoder.encode(password);
                    member.setPassword(encodedPW);
                    memberService.createMember(member);
                    redirectAttrs.addFlashAttribute(ALERT_TYPE, "success");
                    redirectAttrs.addFlashAttribute(ALERT_MESSAGE, "Member Created Successfully!");
                    return "redirect:/admin/users";
                } else {
                    model.addAttribute(MEMBERS_FORM, memberCreateForm);
                    model.addAttribute(MEMBER_CREATE_ERROR, isValidMember(member));

                    return "pages/user_create";
                }
            }else{
                model.addAttribute(MEMBERS_FORM, memberCreateForm);
                model.addAttribute(MEMBER_CREATE_ERROR, "Please fill all fields!");
                return "pages/user_create";
            }
        }

        private String isValidMember(Member member) {
            String result = "";
            String membNumber = member.getMembNumber();
            String email = member.getEmail();
            String username = member.getUsername();
            //Member provided is not Valid if any of the ssn,email,username already exists
            if (!memberService.findByMembNumber(membNumber).isEmpty()) {
                result += "Member Number Already Exists. ";
            }
            if (!memberService.findByEmail(email).isEmpty()) {
                result += "Email Already Exists. ";
            }
            if (!memberService.findByUsername(username).isEmpty()) {
                result += "Username Already Exists. ";
            }

            return result;


        }

        private boolean isValidMemberEmptyFields(Member member){
            boolean isValid   = true;
            String membNumber = member.getMembNumber();

            String firstName = member.getFirstName();
            String lastName = member.getLastName();
            String phone = member.getPhone();
            String email = member.getEmail();
            String username = member.getUsername();
            String password = member.getPassword();
            String role = member.getRole();
            if (membNumber.isEmpty() || email.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty() || username.isEmpty() || password == null || role.isEmpty()){
                isValid = false;
            }

            return isValid;
        }

}
