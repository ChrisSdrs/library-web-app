package com.library.mappers;

import com.library.domain.Member;
import com.library.forms.MemberCreateForm;
import org.springframework.stereotype.Component;


@Component
public class MemberFormToMemberMapper {

    public Member toMember(MemberCreateForm memberCreateForm) {
        Member member = new Member();
        member.setMembNumber(memberCreateForm.getMembNumber());
        member.setFirstName(memberCreateForm.getFirstName());
        member.setLastName(memberCreateForm.getLastName());
        member.setPhone(memberCreateForm.getPhone());
        member.setEmail(memberCreateForm.getEmail());
        member.setUsername(memberCreateForm.getUsername());
        member.setPassword(memberCreateForm.getPassword());
        member.setRole(memberCreateForm.getRole());

        return member;
    }

}
