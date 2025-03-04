package com.example.GreetingAppDevelopment.service;

import org.springframework.stereotype.Service;

import com.example.GreetingAppDevelopment.entity.Greeting;
import com.example.GreetingAppDevelopment.repository.GreetingRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GreetingService {
    private final GreetingRepository greetingRepository;
    public Optional<Greeting> getGreetingById(Long id) {
        return greetingRepository.findById(id);
    }

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public Greeting saveGreeting(String message) {
        Greeting greeting = new Greeting(message);
        return greetingRepository.save(greeting);
    }
    public Greeting createGreeting(Greeting greeting) {
        return greetingRepository.save(greeting);
    }

}