package com.library.service;

import com.library.domain.Member;
import com.library.model.MemberModel;

import java.util.List;
import java.util.Optional;

public interface MemberService {

    Member createMember(Member member);

    Member updateMember(MemberModel memberModel);

    List<MemberModel> findAll();

    List<MemberModel> findByRole(String role);

    List<MemberModel> findByMembNumber(String membNumber);

    List<MemberModel> findByEmail(String email);

    List<MemberModel> findByMembNumberAndEmail(String membNumber, String email);

    Optional<MemberModel> findById(Long id);

    Optional<MemberModel> findByUsername(String username);

    Optional<MemberModel> findByUsernameAndPassword(String username, String password);

    void deleteById(Long id);

    Optional<MemberModel> findByMembNumberOrEmailOrUsername(String membNumber, String email, String username);





}
