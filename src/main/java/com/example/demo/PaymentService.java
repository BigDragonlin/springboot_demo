package com.example.demo;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {
    void processPayment(int amount);
}
