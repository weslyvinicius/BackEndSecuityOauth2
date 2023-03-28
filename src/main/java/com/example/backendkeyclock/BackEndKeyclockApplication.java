package com.example.backendkeyclock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.validation.secutity.config.EnableValidationToken;

@SpringBootApplication
@EnableValidationToken
public class BackEndKeyclockApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackEndKeyclockApplication.class, args);
    }

}
