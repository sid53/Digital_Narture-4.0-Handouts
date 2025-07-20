package com.cognizant.loanservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanServiceController {

    @GetMapping("/loan/status")
    public String status() {
        return "Loan Service is up!";
    }
}