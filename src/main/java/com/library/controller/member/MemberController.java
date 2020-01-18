package com.library.controller.member;

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
public class MemberController {
    private static final String MEMBER_LIST = "members";
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MemberService memberService;

    @GetMapping(value="/admin/users")
    public String users(Model model, @ModelAttribute(ALERT_TYPE) String alertType, @ModelAttribute(ALERT_MESSAGE) String alertMessage) {
        List<MemberModel> members = memberService.findByRole("Owner");
        model.addAttribute(MEMBER_LIST, members);
        model.addAttribute(ALERT_TYPE, alertType);
        model.addAttribute(ALERT_MESSAGE, alertMessage);
        return "pages/users_show";
    }

    public void FindAll(){
        memberService.findAll().forEach(members -> logger.info(members.toString()));
    }

    public void FindByMembNumber(String membNumber){
        memberService.findByMembNumber(membNumber).forEach(members -> logger.info(members.toString()));
    }

    public void FindByEmail(String email){
        memberService.findByEmail(email).forEach(members -> logger.info(members.toString()));
    }

    public void FindByMembNumberAndEmail(String membNumber, String email){
        memberService.findByMembNumberAndEmail(membNumber, email).forEach(members -> logger.info(members.toString()));
    }
}
