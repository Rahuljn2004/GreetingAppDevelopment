package com.example.GreetingAppDevelopment.controller;

import com.example.GreetingAppDevelopment.entity.Greeting;
import com.example.GreetingAppDevelopment.service.GreetingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @PostMapping
    public Greeting saveGreeting(@RequestBody Greeting greeting) {
        return greetingService.saveGreeting(greeting.getMessage());
    }

    // ✅ Add this method to handle GET requests
    @GetMapping
    public Greeting getGreeting() {
        return new Greeting("Hello, World!"); // Default greeting
    }
}