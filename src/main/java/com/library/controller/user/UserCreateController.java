package com.library.controller.user;

import com.library.domain.Member;
import com.library.forms.UserCreateForm;
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
    public class UserCreateController {
        private static final String USERS_FORM = "userCreateForm";
        private static final String USER_CREATE_ERROR = "userCreateError";

        @Autowired
        private MemberService memberService;

        @Autowired
        private MemberFormToMemberMapper mapper;

        @GetMapping(value = "/admin/users/create")
        public String usersDynamic(Model model) {

            model.addAttribute(USERS_FORM, new UserCreateForm());
            return "pages/user_create";
        }

        @PostMapping(value = "/admin/users/create")
        public String createUser(Model model,
                                 @Valid @ModelAttribute(USERS_FORM)
                                          UserCreateForm userCreateForm,
                                 BindingResult bindingResult, RedirectAttributes redirectAttrs) {

            if (bindingResult.hasErrors()) {
                //have some error handling here, perhaps add extra error messages to the model
                model.addAttribute(ERROR_MESSAGE, "an error occurred");
                return "pages/user_create";
            }

            Member member = mapper.toUser(userCreateForm);
            if (isValidUserEmptyFields(member)) {
                if (isValidUser(member) == "") {
                    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
                    String password = member.getPassword();
                    String encodedPW = encoder.encode(password);
                    member.setPassword(encodedPW);
                    memberService.createUser(member);
                    redirectAttrs.addFlashAttribute(ALERT_TYPE, "success");
                    redirectAttrs.addFlashAttribute(ALERT_MESSAGE, "Member Created Successfully!");
                    return "redirect:/admin/users";
                } else {
                    model.addAttribute(USERS_FORM, userCreateForm);
                    model.addAttribute(USER_CREATE_ERROR, isValidUser(member));

                    return "pages/user_create";
                }
            }else{
                model.addAttribute(USERS_FORM, userCreateForm);
                model.addAttribute(USER_CREATE_ERROR, "Please fill all fields!");
                return "pages/user_create";
            }
        }

        private String isValidUser(Member member) {
            String result = "";
            String ssn = member.getSsn();
            String email = member.getEmail();
            String username = member.getUsername();
            //Member provided is not Valid if any of the ssn,email,username already exists
            if (!memberService.findBySsn(ssn).isEmpty()) {
                result += "Ssn Already Exists. ";
            }
            if (!memberService.findByEmail(email).isEmpty()) {
                result += "Email Already Exists. ";
            }
            if (!memberService.findByUsername(username).isEmpty()) {
                result += "Username Already Exists. ";
            }

            return result;


        }

        private boolean isValidUserEmptyFields(Member member){
            boolean isValid   = true;
            String ssn = member.getSsn();

            String firstName = member.getFirstName();
            String lastName = member.getLastName();
            String phone = member.getPhone();
            String email = member.getEmail();
            String username = member.getUsername();
            String password = member.getPassword();
            String role = member.getRole();
            if (ssn.isEmpty() || email.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty() || username.isEmpty() || password == null || role.isEmpty()){
                isValid = false;
            }

            return isValid;
        }

}
