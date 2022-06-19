package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculator {

	@GetMapping("/div")
	public String calculate() {
		int a=10;
		int b=0;
		int result=a/b;
		return "result:"+result;
	}
}
