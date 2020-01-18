package com.library.mappers;

import com.library.domain.Member;
import com.library.forms.UserCreateForm;
import org.springframework.stereotype.Component;


@Component
public class MemberFormToMemberMapper {

    public Member toUser(UserCreateForm userCreateForm) {
        Member member = new Member();
        member.setMembNumber(userCreateForm.getMembNumber());
        member.setFirstName(userCreateForm.getFirstName());
        member.setLastName(userCreateForm.getLastName());
        member.setPhone(userCreateForm.getPhone());
        member.setEmail(userCreateForm.getEmail());
        member.setUsername(userCreateForm.getUsername());
        member.setPassword(userCreateForm.getPassword());
        member.setRole(userCreateForm.getRole());

        return member;
    }

}
