package com.library.controller.user;

import com.library.forms.UserSearchForm;
import com.library.mappers.UserFormToUserMapper;
import com.library.model.UserModel;
import com.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

import static javax.servlet.RequestDispatcher.ERROR_MESSAGE;


@Controller
public class UserSearchController {
    private static final String USER_SEARCH_FORM = "userSearchForm";
    private static final String USER_LIST = "users";

    @Autowired
    private UserService userService;

    @Autowired
    private UserFormToUserMapper mapper;

    @GetMapping(value = "/admin/users/search")
    public String searchMembers(Model model) {
        model.addAttribute(USER_SEARCH_FORM, new UserSearchForm());
        return "pages/users_search";
    }

    @PostMapping(value = "/admin/users/search")
    public String searchMembers(Model model,
                              @Valid @ModelAttribute(USER_SEARCH_FORM)
                                      UserSearchForm userSearchForm,
                              BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            return "pages/users_search";
        }
        String membNumber = userSearchForm.getMembNumber();
        String email = userSearchForm.getEmail();


        List<UserModel> users = getUsersFromSearch(membNumber,email);
        model.addAttribute(USER_LIST, users);
        model.addAttribute(USER_SEARCH_FORM, userSearchForm);
        return "pages/users_search_results";
    }

    private List<UserModel> getUsersFromSearch(String membNumber, String email){
        if (membNumber != "" && email != ""){

            return userService.findByMembNumberAndEmail(membNumber, email);

        }else if (membNumber != "" && email == ""){

            return userService.findByMembNumber(membNumber);

        }else if (membNumber == "" && email != ""){

            return userService.findByEmail(email);

        } else return userService.findByRole("Member");
    }

}

