package com.example.demo.UserRegistrationService;

public interface UserRepositoryInterface {
    void save(User user);
    User findByEmail(String email);
}