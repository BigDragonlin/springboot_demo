package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    @Qualifier("stripePaymentService")
    private PaymentService paymentService ;
    
    public void createOrder(int amount) {
        paymentService.processPayment(amount);
    }
}