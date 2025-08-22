package com.example.demo.SendMssageService;
import org.springframework.stereotype.Service;

@Service("SendEmailServices")
public class SendEmailServices implements SendMessageIterface {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}
