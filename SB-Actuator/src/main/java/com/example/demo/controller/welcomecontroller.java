package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomecontroller {

	@GetMapping("/welcome")
	public String view() {
		return "welcome to actuator";
	}
}
