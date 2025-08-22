package com.example.demo.SendMssageService;

import org.springframework.stereotype.Service;

@Service
public interface SendMessageIterface {
    void sendMessage(String message);
}
