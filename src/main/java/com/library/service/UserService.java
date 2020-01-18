package com.library.service;

import com.library.domain.Customer;
import com.library.model.UserModel;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Customer createUser(Customer customer);

    Customer updateUser(UserModel userModel);

    List<UserModel> findAll();

    List<UserModel> findByRole(String role);

    List<UserModel> findBySsn(String ssn);

    List<UserModel> findByEmail(String email);

    List<UserModel> findBySsnAndEmail(String ssn, String email);

    Optional<UserModel> findById(Long id);

    Optional<UserModel> findByUsername(String username);

    Optional<UserModel> findByUsernameAndPassword(String username, String password);

    void deleteById(Long id);

    Optional<UserModel> findBySsnOrEmailOrUsername(String ssn, String email, String username);





}
