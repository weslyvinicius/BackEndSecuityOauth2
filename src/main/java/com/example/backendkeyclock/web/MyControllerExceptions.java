package com.example.backendkeyclock.web;

import com.example.backendkeyclock.exception.MyCustomerException;
import org.mycustomer.starter.error.exeception.NotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("exception")
public class MyControllerExceptions {

  @GetMapping("notfound")
  public void notFoundException() {
    throw new NotFoundException(UUID.randomUUID(), "Starter NotFoundException");
  }

  @GetMapping("custom")
  public void customException() {
    throw new MyCustomerException(UUID.randomUUID(), "My Customer Exception");
  }
}
