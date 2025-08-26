package com.example.demo;

import com.entities.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        var user = User.builder()
                .name("John Doe")
                .email("JohnDoe@example.com")
                .build();
        System.out.println(user);
    }
}
