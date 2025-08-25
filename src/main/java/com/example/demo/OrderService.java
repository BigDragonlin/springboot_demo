package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

public class OrderService {
    private PaymentService paymentService ;

    OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    public void createOrder(int amount) {
        paymentService.processPayment(amount);
    }
}