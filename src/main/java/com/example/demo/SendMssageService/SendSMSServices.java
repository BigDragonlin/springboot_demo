package com.example.demo.SendMssageService;
import org.springframework.stereotype.Service;

@Service("SendSMSService")
public class SendSMSServices implements SendMessageIterface{

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
