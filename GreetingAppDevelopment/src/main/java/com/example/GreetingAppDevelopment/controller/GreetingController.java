package com.example.GreetingAppDevelopment.controller;

import com.example.GreetingAppDevelopment.entity.Greeting;
import com.example.GreetingAppDevelopment.service.GreetingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @PostMapping
    public ResponseEntity<Greeting> createGreeting(@RequestBody Greeting greeting) {
        return ResponseEntity.ok(greetingService.createGreeting(greeting));
    }

    // ✅ Add this method to handle GET requests
    @GetMapping
    public Greeting getGreeting() {
        return new Greeting("Hello, World!"); // Default greeting
    }
    @GetMapping("/{id}")
    public ResponseEntity<Greeting> getGreetingById(@PathVariable Long id) {
        Optional<Greeting> greeting = greetingService.getGreetingById(id);
        return greeting.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
