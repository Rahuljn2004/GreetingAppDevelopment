package com.example.GreetingAppDevelopment.repository;

//import com.development.Greeting.Application.model.Greeting;
import com.example.GreetingAppDevelopment.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {}