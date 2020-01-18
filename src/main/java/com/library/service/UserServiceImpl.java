package com.library.service;

import com.library.domain.User;
import com.library.mappers.UserToUserModelMapper;
import com.library.model.UserModel;
import com.library.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserToUserModelMapper mapper;

    @Override
    public User createMember(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(UserModel userModel) {
        User originalUser = userRepository.findById(userModel.getId()).get();
        originalUser.setUsername(userModel.getUsername());
        originalUser.setFirstName(userModel.getFirstName());
        originalUser.setEmail(userModel.getEmail());
        originalUser.setLastName(userModel.getLastName());
        originalUser.setPhone(userModel.getPhone());
        originalUser.setMembNumber(userModel.getMembNumber());
        originalUser.setRole(userModel.getRole());
        return userRepository.save(originalUser);
    }

    @Override
    public List<UserModel> findAll() {
        return userRepository
                .findAll()
                .stream()
                .map(user -> mapper.mapToUserModel(user))
                .collect(Collectors.toList());
    }

    @Override
    public List<UserModel> findByRole(String role) {
        return userRepository.findByRole(role)
                .stream()
                .map(user -> mapper.mapToUserModel(user))
                .collect(Collectors.toList());
    }

    @Override
    public List<UserModel> findByMembNumber(String membNumber) {
        return userRepository
                .findByMembNumber(membNumber)
                .stream()
                .map(user -> mapper.mapToUserModel(user))
                .collect(Collectors.toList());
    }

    @Override
    public List<UserModel> findByEmail(String email) {
        return userRepository
                .findByEmail(email)
                .stream()
                .map(user -> mapper.mapToUserModel(user))
                .collect(Collectors.toList());    }

    @Override
    public List<UserModel> findByMembNumberAndEmail(String membNumber, String email) {
        return userRepository
                .findByMembNumberAndEmail(membNumber, email)
                .stream()
                .map(user -> mapper.mapToUserModel(user))
                .collect(Collectors.toList());    }

    @Override
    public Optional<UserModel> findById(Long id) {
        return userRepository
                .findById(id)
                .map(user -> mapper.mapToUserModel(user));
    }

    @Override
    public Optional<UserModel> findByUsername(String username) {
        return userRepository
                .findByUsername(username)
                .map(user -> mapper.mapToUserModel(user));
    }

    @Override
    public Optional<UserModel> findByUsernameAndPassword(String username, String password) {
        return userRepository
                .findByUsernameAndPassword(username, password)
                .map(user -> mapper.mapToUserModel(user));
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public Optional<UserModel> findByMembNumberOrEmailOrUsername(String membNumber, String email, String username) {
        return userRepository.findByMembNumberOrEmailOrUsername(membNumber, email, username)
                .map(user -> mapper.mapToUserModel(user));
    }
}
