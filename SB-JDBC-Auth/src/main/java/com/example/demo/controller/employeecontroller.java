package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class employeecontroller {

	@GetMapping("/home")
	public String getmsg() {
		return "home page";
	}
	@GetMapping("/welcome")
	public String get() {
		return "welcome to login process";
	}
	@GetMapping("/admin")
		public String getadmin() {
			return "admin details process";
		}

	@GetMapping("/employee")
		public String getemp() {
			return "employee details process";
		}

	@GetMapping("/manager")
		public String getman() {
			return "manager details process";
		}
	@GetMapping("/accessdenied")
	public String getacc() {
		return "access denied  process";
	}
	}
	

