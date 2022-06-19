package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class welcomecontroller {

	@GetMapping("/welcome")
	public String get(Model model) {
		model.addAttribute("msg", "welcome to spring mvc");
		String name=null;
		name.length();
		return "welcome";
	}
	
	
}
