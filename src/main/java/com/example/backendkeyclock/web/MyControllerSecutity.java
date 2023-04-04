package com.example.backendkeyclock.web;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secutity")

public class MyControllerSecutity {

    @GetMapping("/admin")
    @PreAuthorize("hasAnyAuthority('ROLE_BACKEND-APP_ADMIN','ROLE_BACKEND-APP_USER') ")
    public String getAdmin() {
        return "Hello Admin";
    }

    @GetMapping("/user")
    @PreAuthorize("hasAnyAuthority('ROLE_BACKEND-APP_USER')")
    public String getUser() {
        return "Hello User ";
    }
}
