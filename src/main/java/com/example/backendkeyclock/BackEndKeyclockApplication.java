package com.example.backendkeyclock;

import org.mycustomer.starter.secutity.annotation.EnableValidationToken;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableValidationToken
public class BackEndKeyclockApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackEndKeyclockApplication.class, args);
    }

}
