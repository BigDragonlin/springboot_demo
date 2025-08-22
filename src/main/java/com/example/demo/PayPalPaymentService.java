package com.example.demo;
import org.springframework.stereotype.Service;

@Service
public class PayPalPaymentService implements PaymentService {
    @Override
    public void processPayment(int amount) {
        System.out.println("Paying " + amount + " using PayPal");
    }
}
