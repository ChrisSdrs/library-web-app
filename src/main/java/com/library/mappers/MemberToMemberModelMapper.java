package com.library.mappers;

import com.library.domain.Member;
import com.library.model.MemberModel;
import org.springframework.stereotype.Component;

@Component
public class MemberToMemberModelMapper {

    public MemberModel mapToMemberModel(Member members) {
        MemberModel memberModel = new MemberModel();
        memberModel.setId(members.getId());
        memberModel.setMembNumber(members.getMembNumber());
        memberModel.setFirstName(members.getFirstName());
        memberModel.setLastName(members.getLastName());
        memberModel.setPhone(members.getPhone());
        memberModel.setEmail(members.getEmail());
        memberModel.setRole(members.getRole());
        memberModel.setUsername(members.getUsername());
        return memberModel;
    }
}