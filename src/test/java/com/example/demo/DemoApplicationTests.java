package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.SendMssageService.SendMessageMangement;
import org.springframework.context.ApplicationContext;


@SpringBootTest
class DemoApplicationTests {
    //测试发送信息
    @Test
    void testSendMessage() {
    }

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
    }
}
