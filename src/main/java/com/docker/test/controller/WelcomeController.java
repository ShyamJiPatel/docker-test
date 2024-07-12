package com.docker.test.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	public String sayWelcome() {
		return "Welcome to the Docker learning from Spring Boot project.";
	}

}
