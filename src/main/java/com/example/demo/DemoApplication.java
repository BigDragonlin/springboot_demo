package com.example.demo;

import com.example.demo.SendMssageService.SendMessageMangement;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        var orderService = context.getBean(OrderService.class);
        orderService.createOrder(100);
    }
}
