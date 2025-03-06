package com.example.GreetingAppDevelopment.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.GreetingAppDevelopment.dto.GreetingDTO;

import com.example.GreetingAppDevelopment.dto.GreetingDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<GreetingDTO, Long> {

}