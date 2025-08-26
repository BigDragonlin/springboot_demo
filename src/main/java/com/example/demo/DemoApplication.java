package com.example.demo;

import com.entities.Address;
import com.entities.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        var user = User.builder()
                .name("John Doe")
                .email("JohnDoe@example.com")
                .build();

        var address = Address.builder()
                .street("123 Main St")
                .city("Anytown")
                .state("CA")
                .zip("12345")
                .build();

        user.addAddress(address);

        System.out.println( user);
    }
}
