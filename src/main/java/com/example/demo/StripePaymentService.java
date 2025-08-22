package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(int amount){
        System.out.println("Processing payment of " + amount + " using Stripe");
    }
}