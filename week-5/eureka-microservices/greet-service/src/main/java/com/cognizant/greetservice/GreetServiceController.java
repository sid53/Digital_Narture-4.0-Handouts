package com.cognizant.greetservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetServiceController {

    @GetMapping("/greet/status")
    public String status() {
        return "Greet Service is up!";
    }
}