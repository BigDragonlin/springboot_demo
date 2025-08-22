package com.example.demo.SendMssageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SendMessageMangement {
    @Autowired
    @Qualifier("SendSMSService")
    private SendMessageIterface sendSMS;

    @Autowired
    @Qualifier("SendEmailServices")
    private SendMessageIterface sendEmail;

    // 发送信息
    public void sendMessage(String message, String type) {
        if (type.equals("SMS")) {
            sendSMS.sendMessage(message);
        } else if (type.equals("EMAIL")) {
            sendEmail.sendMessage(message);
        } else {
            throw new IllegalArgumentException("Invalid message type");
        }
    }
}
