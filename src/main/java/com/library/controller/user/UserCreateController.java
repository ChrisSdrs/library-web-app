package com.library.controller.user;

import com.library.domain.Customer;
import com.library.forms.UserCreateForm;
import com.library.mappers.UserFormToUserMapper;
import com.library.service.UserService;
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
        private UserService userService;

        @Autowired
        private UserFormToUserMapper mapper;

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

            Customer customer = mapper.toUser(userCreateForm);
            if (isValidUserEmptyFields(customer)) {
                if (isValidUser(customer) == "") {
                    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
                    String password = customer.getPassword();
                    String encodedPW = encoder.encode(password);
                    customer.setPassword(encodedPW);
                    userService.createUser(customer);
                    redirectAttrs.addFlashAttribute(ALERT_TYPE, "success");
                    redirectAttrs.addFlashAttribute(ALERT_MESSAGE, "Customer Created Successfully!");
                    return "redirect:/admin/users";
                } else {
                    model.addAttribute(USERS_FORM, userCreateForm);
                    model.addAttribute(USER_CREATE_ERROR, isValidUser(customer));

                    return "pages/user_create";
                }
            }else{
                model.addAttribute(USERS_FORM, userCreateForm);
                model.addAttribute(USER_CREATE_ERROR, "Please fill all fields!");
                return "pages/user_create";
            }
        }

        private String isValidUser(Customer customer) {
            String result = "";
            String ssn = customer.getSsn();
            String email = customer.getEmail();
            String username = customer.getUsername();
            //Customer provided is not Valid if any of the ssn,email,username already exists
            if (!userService.findBySsn(ssn).isEmpty()) {
                result += "Ssn Already Exists. ";
            }
            if (!userService.findByEmail(email).isEmpty()) {
                result += "Email Already Exists. ";
            }
            if (!userService.findByUsername(username).isEmpty()) {
                result += "Username Already Exists. ";
            }

            return result;


        }

        private boolean isValidUserEmptyFields(Customer customer){
            boolean isValid   = true;
            String ssn = customer.getSsn();

            String firstName = customer.getFirstName();
            String lastName = customer.getLastName();
            String phone = customer.getPhone();
            String email = customer.getEmail();
            String username = customer.getUsername();
            String password = customer.getPassword();
            String role = customer.getRole();
            if (ssn.isEmpty() || email.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty() || username.isEmpty() || password == null || role.isEmpty()){
                isValid = false;
            }

            return isValid;
        }

}
