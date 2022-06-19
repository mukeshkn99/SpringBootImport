package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SbJdbcAuthApplication {

	@Autowired
	private BCryptPasswordEncoder  encoder;
	
	public static void main(String[] args) {
		SpringApplication.run(SbJdbcAuthApplication.class, args);
		
		BCryptPasswordEncoder b=new BCryptPasswordEncoder();
		String encode=b.encode("mukesh@123");
		System.out.println(encode);
	}

}
