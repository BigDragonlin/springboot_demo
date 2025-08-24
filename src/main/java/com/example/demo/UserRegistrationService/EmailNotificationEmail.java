package com.example.demo.UserRegistrationService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationEmail implements NotificationServiceInterface {
    @Value("${email.host}")
    private String host;

    @Value("${email.port}")
    private String port;

    @Override
    public void sendNotification(String message, String recipentEmail) {
        System.out.println("Sending email to " + recipentEmail + " with message: " + message);
        System.out.println("Host: " + host);
        System.out.println("Port: " + port);
    }

    public EmailNotificationEmail(){
        System.out.println("EmailNotificationEmail created");
    }
}