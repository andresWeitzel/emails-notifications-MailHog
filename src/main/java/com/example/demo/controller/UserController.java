package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private EmailService emailService; 

    @PostMapping
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        emailService.sendWelcomeEmail(user.getEmail(), user.getName());
        return ResponseEntity.ok("User registered and email sent.");
    }
}