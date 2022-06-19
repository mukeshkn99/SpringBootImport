package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.WelcomeService;

@RestController
public class WelcomeController {

	@Autowired
	private WelcomeService welcomeservice;
	
	@GetMapping("/welcome")
	public ResponseEntity<String> get() {
		String message=welcomeservice.getmessage();
		return new ResponseEntity<>(message,HttpStatus.OK);
	}
}
