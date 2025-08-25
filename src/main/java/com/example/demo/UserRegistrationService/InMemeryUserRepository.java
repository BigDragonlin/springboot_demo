package com.example.demo.UserRegistrationService;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;


@Repository("InMemeryUserRepository")
public class InMemeryUserRepository implements UserRepositoryInterface {
    private Map<String, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        System.out.println("Saving user: " + user.getEmail());
        users.put(user.getEmail(), user);
    }

    @Override
    public User findByEmail(String email) {
        return users.get(email);
    }

    public InMemeryUserRepository() {
        System.out.println("InMemeryUserRepository created");
    }
}