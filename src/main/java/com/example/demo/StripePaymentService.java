package com.example.demo;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(int amount){
        System.out.println("Processing payment of " + amount + " using Stripe");
    }
}