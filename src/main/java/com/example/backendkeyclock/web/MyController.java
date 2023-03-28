package com.example.backendkeyclock.web;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/test")

public class MyController {

    @GetMapping("/anonymous")
    public ResponseEntity<String> getAnonymous() {
        return ResponseEntity.ok("Hello Anonymous");
    }

    @GetMapping("/admin")
    @PreAuthorize("hasAnyAuthority('ROLE_MYREALMROLEADMIN','ROLE_MYROLECLIENTADMIN') ")
    public ResponseEntity<String> getAdmin(Principal principal) {
        return ResponseEntity.ok("Hello Admin ");
    }

    @GetMapping("/user")
    @PreAuthorize("hasAnyAuthority('ROLE_MYCLIENT_MYROLECLIENTUSER','ROLE_MYREALMROLEUSER')")
    public ResponseEntity<String> getUser(Principal principal) {

        return ResponseEntity.ok("Hello User ");
    }
}
