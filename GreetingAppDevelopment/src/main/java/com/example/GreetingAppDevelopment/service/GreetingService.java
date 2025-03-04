package com.example.GreetingAppDevelopment.service;

import org.springframework.stereotype.Service;

import com.example.GreetingAppDevelopment.entity.Greeting;
import com.example.GreetingAppDevelopment.repository.GreetingRepository;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public Greeting saveGreeting(String message) {
        Greeting greeting = new Greeting(message);
        return greetingRepository.save(greeting);
    }
}