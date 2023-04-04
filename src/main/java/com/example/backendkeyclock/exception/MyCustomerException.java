package com.example.backendkeyclock.exception;

import org.mycustomer.starter.error.exeception.BaseException;
import org.springframework.http.HttpStatus;

import java.util.UUID;

public class MyCustomerException extends BaseException {

    public MyCustomerException(UUID transactionId, String message) {
        super(transactionId, HttpStatus.BAD_REQUEST, message);
    }
}
