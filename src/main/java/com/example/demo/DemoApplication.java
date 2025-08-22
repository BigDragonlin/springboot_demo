package com.example.demo;

import com.example.demo.SendMssageService.SendMessageMangement;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//        var orderService = context.getBean(OrderService.class);

//        OrderService os = new OrderService();
//        os.setPaymentService(new StripePaymentService());
//        os.setPaymentService(new PayPalPaymentService());
//        orderService.createOrder(100);

//        String[] beans = context.getBeanDefinitionNames();
//        for (String bean : beans) {
//            System.out.println(bean);
//        }

        var sendMessageManagement = context.getBean(SendMessageMangement.class);
        sendMessageManagement.sendMessage("Hello, world!", "EMAIL");
        sendMessageManagement.sendMessage("Hello, world!", "SMS");
    }

}
