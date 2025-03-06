package com.example.GreetingAppDevelopment.service;

import com.example.GreetingAppDevelopment.dto.GreetingDTO;
import com.example.GreetingAppDevelopment.dto.UserDTO;
import java.util.List;


public interface IGreetingService {
    GreetingDTO addGreeting(UserDTO user);
    GreetingDTO getGreetingById(long id);
    List<GreetingDTO> getAllGreetings();
    GreetingDTO editGreeting(long id, UserDTO user);
    void deleteGreeting(long id);
}