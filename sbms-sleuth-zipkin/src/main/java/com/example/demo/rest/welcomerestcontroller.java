package com.example.demo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomerestcontroller {

	Logger logger=LoggerFactory.getLogger(welcomerestcontroller.class);
	@GetMapping("/welcome")
	public String getmsg() {
		logger.info("sleuth-zipkin server start");
		String msg="welcome to sleuth dependency";
		logger.info("sleuth-zipkin server end");
       return msg;	
	}
}
