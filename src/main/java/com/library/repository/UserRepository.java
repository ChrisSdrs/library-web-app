package com.library.repository;

import com.library.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Override
    List<User> findAll();

    List<User> findByRole(String role);

    Optional<User> findById(Long id);

    List<User> findBySsn(String ssn);

    List<User> findByEmail(String email);

    List<User> findBySsnAndEmail(String ssn, String email);

    Optional<User> findByUsername(String username);

    Optional<User> findByUsernameAndPassword(String username, String password);

    User save(User user);

    Optional<User> findBySsnOrEmailOrUsername(String ssn, String email, String username);


}
