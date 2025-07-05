package com.restaurantbooking.controller;


import com.restaurantbooking.model.User;
import com.restaurantbooking.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // 🔍 Get all users (Admin use)
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // 🔍 Get user by ID
    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.getById(id);
    }

    // ✏️ Update user profile
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        user.setUserId(id);
        return userService.register(user);
    }

    // ❌ Delete user (optional)
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.getById(id).ifPresent(user -> userService.getAllUsers().remove(user));
    }
}
