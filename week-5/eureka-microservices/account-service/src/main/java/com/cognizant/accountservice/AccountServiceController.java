package com.cognizant.accountservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountServiceController {

    @GetMapping("/account/status")
    public String status() {
        return "Account Service is up!";
    }
}