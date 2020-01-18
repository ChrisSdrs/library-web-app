package com.library.mappers;

import com.library.domain.Member;
import com.library.model.MemberModel;
import org.springframework.stereotype.Component;

@Component
public class MemberToMemberModelMapper {

    public MemberModel mapToUserModel(Member users) {
        MemberModel memberModel = new MemberModel();
        memberModel.setId(users.getId());
        memberModel.setMembNumber(users.getMembNumber());
        memberModel.setFirstName(users.getFirstName());
        memberModel.setLastName(users.getLastName());
        memberModel.setPhone(users.getPhone());
        memberModel.setEmail(users.getEmail());
        memberModel.setRole(users.getRole());
        memberModel.setUsername(users.getUsername());
        return memberModel;
    }
}