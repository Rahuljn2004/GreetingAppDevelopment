package com.example.GreetingAppDevelopment.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    // GET request - Return a simple greeting
    @GetMapping
    public String getGreeting() {
        return "{\"message\": \"Hello, Welcome to Greeting App!\"}";
    }

    // POST request - Return a greeting with a name
    @PostMapping
    public String postGreeting(@RequestParam String name) {
        return "{\"message\": \"Hello, " + name + "! Welcome to Greeting App!\"}";
    }

    // PUT request - Update a greeting message
    @PutMapping
    public String putGreeting(@RequestParam String name) {
        return "{\"message\": \"Greeting updated for " + name + "!\"}";
    }

    // DELETE request - Delete a greeting message
    @DeleteMapping
    public String deleteGreeting(@RequestParam String name) {
        return "{\"message\": \"Greeting deleted for " + name + "!\"}";
    }
}

