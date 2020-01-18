package com.library.service;

import com.library.domain.Member;
import com.library.mappers.MemberToMemberModelMapper;
import com.library.model.MemberModel;
import com.library.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private MemberToMemberModelMapper mapper;

    @Override
    public Member createMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public Member updateMember(MemberModel memberModel) {
        Member originalMember = memberRepository.findById(memberModel.getId()).get();
        originalMember.setUsername(memberModel.getUsername());
        originalMember.setFirstName(memberModel.getFirstName());
        originalMember.setEmail(memberModel.getEmail());
        originalMember.setLastName(memberModel.getLastName());
        originalMember.setPhone(memberModel.getPhone());
        originalMember.setMembNumber(memberModel.getMembNumber());
        originalMember.setRole(memberModel.getRole());
        return memberRepository.save(originalMember);
    }

    @Override
    public List<MemberModel> findAll() {
        return memberRepository
                .findAll()
                .stream()
                .map(member -> mapper.mapToMemberModel(member))
                .collect(Collectors.toList());
    }

    @Override
    public List<MemberModel> findByRole(String role) {
        return memberRepository.findByRole(role)
                .stream()
                .map(member -> mapper.mapToMemberModel(member))
                .collect(Collectors.toList());
    }

    @Override
    public List<MemberModel> findByMembNumber(String membNumber) {
        return memberRepository
                .findByMembNumber(membNumber)
                .stream()
                .map(member -> mapper.mapToMemberModel(member))
                .collect(Collectors.toList());
    }

    @Override
    public List<MemberModel> findByEmail(String email) {
        return memberRepository
                .findByEmail(email)
                .stream()
                .map(member -> mapper.mapToMemberModel(member))
                .collect(Collectors.toList());    }

    @Override
    public List<MemberModel> findByMembNumberAndEmail(String membNumber, String email) {
        return memberRepository
                .findByMembNumberAndEmail(membNumber, email)
                .stream()
                .map(member -> mapper.mapToMemberModel(member))
                .collect(Collectors.toList());    }

    @Override
    public Optional<MemberModel> findById(Long id) {
        return memberRepository
                .findById(id)
                .map(member -> mapper.mapToMemberModel(member));
    }

    @Override
    public Optional<MemberModel> findByUsername(String username) {
        return memberRepository
                .findByUsername(username)
                .map(member -> mapper.mapToMemberModel(member));
    }

    @Override
    public Optional<MemberModel> findByUsernameAndPassword(String username, String password) {
        return memberRepository
                .findByUsernameAndPassword(username, password)
                .map(member -> mapper.mapToMemberModel(member));
    }

    @Override
    public void deleteById(Long id) {
        memberRepository.deleteById(id);
    }

    @Override
    public Optional<MemberModel> findByMembNumberOrEmailOrUsername(String membNumber, String email, String username) {
        return memberRepository.findByMembNumberOrEmailOrUsername(membNumber, email, username)
                .map(member -> mapper.mapToUserModel(member));
    }
}
