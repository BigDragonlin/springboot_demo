package com.example.demo;

public class OrderService {
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    private PaymentService paymentService ;
    
    public void createOrder(int amount) {
        paymentService.processPayment(amount);
    }
}