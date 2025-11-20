package com.test.app.service;

import com.test.app.model.User;
import com.test.app.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }
    public User createUser(User user) {
        return userRepository.save(user);
    }
    public boolean deleteUser(Long id) {
        if(userRepository.findById(id).isPresent()) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
    public Optional<User> updateUser(Long id, User updated) {
        return userRepository.findById(id).map(existing -> {
            existing.setId(updated.getId());
            return userRepository.save(existing);
        });

    }
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

}
