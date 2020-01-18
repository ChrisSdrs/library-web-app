package com.library.repository;

import com.library.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<Customer, Long> {

    @Override
    List<Customer> findAll();

    List<Customer> findByRole(String role);

    Optional<Customer> findById(Long id);

    List<Customer> findBySsn(String ssn);

    List<Customer> findByEmail(String email);

    List<Customer> findBySsnAndEmail(String ssn, String email);

    Optional<Customer> findByUsername(String username);

    Optional<Customer> findByUsernameAndPassword(String username, String password);

    Customer save(Customer customer);

    Optional<Customer> findBySsnOrEmailOrUsername(String ssn, String email, String username);


}
