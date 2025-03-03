package com.example.GreetingAppDevelopment.controller;

import com.example.GreetingAppDevelopment.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    // Constructor-based Dependency Injection
    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // GET request - Get greeting message from Service Layer
    @GetMapping
    public String getGreeting() {
        return "{\"message\": \"" + greetingService.getGreetingMessage() + "\"}";
    }
}