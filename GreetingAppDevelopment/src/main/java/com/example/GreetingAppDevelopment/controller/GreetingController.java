package com.example.GreetingAppDevelopment.controller;

import com.example.GreetingAppDevelopment.dto.GreetingDTO;
import com.example.GreetingAppDevelopment.dto.UserDTO;
import com.example.GreetingAppDevelopment.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetingController {
    @Autowired
    private IGreetingService greetingService;

    @GetMapping("")
    public GreetingDTO getGreeting(@RequestParam(value = "firstName", defaultValue = "", required = false) String firstName, @RequestParam(value = "lastName", defaultValue = "", required = false) String lastName) {
        UserDTO user = new UserDTO();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return greetingService.addGreeting(user);
    }

    @GetMapping("/{id}")
    public GreetingDTO getGreetingById(@PathVariable(value = "id") long id) {
        return greetingService.getGreetingById(id);
    }

    @GetMapping("/all")
    public Iterable<GreetingDTO> getAllGreetings() {
        return greetingService.getAllGreetings();
    }
}