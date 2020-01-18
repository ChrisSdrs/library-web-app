package com.library.repository;

import com.library.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    @Override
    List<Member> findAll();

    List<Member> findByRole(String role);

    Optional<Member> findById(Long id);

    List<Member> findByMembNumber(String membNumber);

    List<Member> findByEmail(String email);

    List<Member> findByMembNumberAndEmail(String membNumber, String email);

    Optional<Member> findByUsername(String username);

    Optional<Member> findByUsernameAndPassword(String username, String password);

    Member save(Member member);

    Optional<Member> findByMembNumberOrEmailOrUsername(String membNumber, String email, String username);


}
