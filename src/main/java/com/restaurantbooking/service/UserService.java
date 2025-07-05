package com.restaurantbooking.service;


import com.restaurantbooking.model.User;
import com.restaurantbooking.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public User register(User user) {
        return userRepo.save(user);
    }

    public Optional<User> login(String email, String password) {
        Optional<User> user = userRepo.findByEmail(email);
        return user.filter(u -> u.getPassword().equals(password));
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public Optional<User> getById(Long id) {
        return userRepo.findById(id);
    }
}
