package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${payment.type:stripe}")
    private String paymentType;

    //在bean初始化后执行
    @PostConstruct
    public void init(){
        System.out.println("print init");
    }

    //在bean销毁后执行
    @PreDestroy
    public void destroy(){
        System.out.println("print destroy");
    }

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