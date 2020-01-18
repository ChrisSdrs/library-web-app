package com.library.controller.member;

import com.library.forms.MemberSearchForm;
import com.library.mappers.MemberFormToMemberMapper;
import com.library.model.MemberModel;
import com.library.service.MemberService;
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
public class MemberSearchController {
    private static final String MEMBER_SEARCH_FORM = "memberSearchForm";
    private static final String MEMBER_LIST = "members";

    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberFormToMemberMapper mapper;

    @GetMapping(value = "/admin/users/search")
    public String searchMembers(Model model) {
        model.addAttribute(MEMBER_SEARCH_FORM, new MemberSearchForm());
        return "pages/users_search";
    }

    @PostMapping(value = "/admin/users/search")
    public String searchMembers(Model model,
                              @Valid @ModelAttribute(MEMBER_SEARCH_FORM)
                                      MemberSearchForm memberSearchForm,
                              BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            return "pages/users_search";
        }
        String membNumber = memberSearchForm.getMembNumber();
        String email = memberSearchForm.getEmail();


        List<MemberModel> members = getMembersFromSearch(membNumber,email);
        model.addAttribute(MEMBER_LIST, members);
        model.addAttribute(MEMBER_SEARCH_FORM, memberSearchForm);
        return "pages/users_search_results";
    }

    private List<MemberModel> getMembersFromSearch(String membNumber, String email){
        if (membNumber != "" && email != ""){

            return memberService.findByMembNumberAndEmail(membNumber, email);

        }else if (membNumber != "" && email == ""){

            return memberService.findByMembNumber(membNumber);

        }else if (membNumber == "" && email != ""){

            return memberService.findByEmail(email);

        } else return memberService.findByRole("Member");
    }

}

