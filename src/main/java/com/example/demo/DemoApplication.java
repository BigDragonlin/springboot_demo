package com.example.demo;

import com.example.demo.UserRegistrationService.User;
import com.example.demo.UserRegistrationService.UserServices;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        var userServices = context.getBean(UserServices.class);
        userServices.registerUser(new User(1, "111@email.com", "123", "Alice"));
        userServices.registerUser(new User(1, "111@email.com", "123", "Alice"));
    }
}
