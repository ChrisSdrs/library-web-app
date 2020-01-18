package com.library.controller.user;

import com.library.model.MemberModel;
import com.library.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

import static com.library.utils.GlobalAttributes.ALERT_MESSAGE;
import static com.library.utils.GlobalAttributes.ALERT_TYPE;

@Controller
public class UserController {
    private static final String USER_LIST = "users";
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MemberService memberService;

    @GetMapping(value="/admin/users")
    public String users(Model model, @ModelAttribute(ALERT_TYPE) String alertType, @ModelAttribute(ALERT_MESSAGE) String alertMessage) {
        List<MemberModel> users = memberService.findByRole("Owner");
        model.addAttribute(USER_LIST, users);
        model.addAttribute(ALERT_TYPE, alertType);
        model.addAttribute(ALERT_MESSAGE, alertMessage);
        return "pages/users_show";
    }

    public void FindAll(){
        memberService.findAll().forEach(users -> logger.info(users.toString()));
    }

    public void FindBySsn(String ssn){
        memberService.findBySsn(ssn).forEach(users -> logger.info(users.toString()));
    }

    public void FindByEmail(String email){
        memberService.findByEmail(email).forEach(users -> logger.info(users.toString()));
    }

    public void FindBySsnAndEmail(String ssn, String email){
        memberService.findBySsnAndEmail(ssn, email).forEach(users -> logger.info(users.toString()));
    }
}
