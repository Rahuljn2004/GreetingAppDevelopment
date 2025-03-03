package com.example.GreetingAppDevelopment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GreetingAppDevelopmentApplication {

	public static void main(String[] args) {

		SpringApplication.run(GreetingAppDevelopmentApplication.class, args);

	}

}


@RestController
@RequestMapping("/")
class WelcomeApp {

	@GetMapping
	public String Welcome() {
		return "Welcome to Gettings App";
	}
}