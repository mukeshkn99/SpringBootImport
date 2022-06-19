package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.Petservice;

@SpringBootApplication
public class RestclientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(RestclientApplication.class, args);
		Petservice ser=context.getBean(Petservice.class);
		//ser.getall();
	 //ser.getid(2);	
	//ser.add();
	}

}
