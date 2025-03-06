package com.example.GreetingAppDevelopment.service;

import com.example.GreetingAppDevelopment.dto.GreetingDTO;
import com.example.GreetingAppDevelopment.dto.UserDTO;
import com.example.GreetingAppDevelopment.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService implements IGreetingService {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private GreetingRepository greetingRepository;

    @Override
    public GreetingDTO addGreeting(UserDTO user) {
        String message = String.format(template, (user.getFirstName().isEmpty() && user.getLastName().isEmpty()) ? "World" : user.getFirstName() + " " + user.getLastName());
        return greetingRepository.save(new GreetingDTO(counter.incrementAndGet(), message));
    }

    @Override
    public GreetingDTO getGreetingById(long id) {
        return greetingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Greeting not found with id: " + id));
    }

    @Override
    public List<GreetingDTO> getAllGreetings() {
        return greetingRepository.findAll();
    }
}