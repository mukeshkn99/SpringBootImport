package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.pet;
import com.example.demo.service.Petservice;

@RestController
public class restcontroller {
	
	@Autowired
	private Petservice service;
	
	@GetMapping("/pet/{petid}")
public pet get(@PathVariable("petid")Integer petid){
		return service.getid(petid);
	}
	@GetMapping("/pet")
	public pet getall() {
		return service.getall();
	}

}
