package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${payment.type:stripe}")
    private String paymentType;

    @Bean
    public OrderService orderService() {
        if (paymentType.equals("stripe")) {
            return new OrderService(new  StripePaymentService());
        } else if (paymentType.equals("paypal")) {
            return new OrderService(new PayPalPaymentService());
        }
        throw new IllegalArgumentException("Invalid payment type: " + paymentType);
    }
}