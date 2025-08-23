package com.example.demo;

import com.example.demo.SendMssageService.SendMessageMangement;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

//        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//        var sendMessageMangement = context.getBean(SendMessageMangement.class);

         ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
         context.close();
    }
}
