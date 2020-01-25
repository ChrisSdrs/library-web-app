package com.library.controller.user;


import com.library.forms.UserEditForm;
import com.library.model.UserModel;
import com.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import static com.library.utils.GlobalAttributes.ALERT_MESSAGE;
import static com.library.utils.GlobalAttributes.ALERT_TYPE;

@Controller
    public class UserEditController {
        private static final String USER_FORM = "userEditForm";
        private static final String USER = "user";

        @Autowired
        private UserService userService;


        @PostMapping(value = "/admin/users/{id}/delete")
        public String deleteUser(@PathVariable Long id) {
            userService.deleteById(id);

            return "redirect:/admin/users";
        }

        @PostMapping(value = "/admin/users/{id}/edit")
        public String editUser(@PathVariable Long id, Model model) {
            UserModel userModel = userService.findById(id).get();
            model.addAttribute(USER_FORM, new UserEditForm());
            model.addAttribute(USER, userModel);
            return "pages/user_edit";
        }

        @PostMapping(value = "/admin/users/edit")
        public String editUser(UserModel userModel) {
            userService.updateUser(userModel);

            return "redirect:/admin/users";
        }


    }
