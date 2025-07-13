package com.cognizant.springlearn.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.util.JwtUtil;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public ResponseEntity<Map<String, String>> authenticate() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();

        String token = JwtUtil.generateToken(username);

        Map<String, String> response = new HashMap<>();
        response.put("token", token);

        return ResponseEntity.ok(response);
    }
}
