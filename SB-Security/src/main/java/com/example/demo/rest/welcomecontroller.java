package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomecontroller {

	@GetMapping("/home")
	public String getmsg() {
		String msg="welcome to Ashok IT !!!";
		return msg;
	}
	@GetMapping("/balance")
	public String getbalance() {
		String msg="Your balance is 1,200";
		return msg;
	}
	
	@GetMapping("/myloan")
	public String getloan() {
		String msg="loan is processing ";
		return msg;
	}
	@GetMapping("/statement")
	public String getstatement() {
		String msg="your transaction history will be generated";
		return msg;
	}
	@GetMapping("/contact")
	public String getcontact() {
		String msg="contact number should be provided";
		return msg;
	}
	
	
}
