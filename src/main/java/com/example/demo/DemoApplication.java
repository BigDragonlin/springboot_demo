package com.example.demo;

import com.entities.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        User user = new User(1L, "111@email.com", "123", "Alice");
    }
}
