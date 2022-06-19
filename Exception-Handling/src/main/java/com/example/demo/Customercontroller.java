package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.Apierror;

@RestController
public class Customercontroller {

	
	@GetMapping("/sum/{cid}")
	public ResponseEntity<String> customer(@PathVariable("cid") int customerid) throws NoCustomedFoundException {
		String email=" ";
		
		if(customerid==100) {
			email="mukeshkn20@gmail.com";
		}
		else {
			throw new NoCustomedFoundException("Invalid Customer id");
		}
		return new ResponseEntity<String>(email,HttpStatus.OK);
	}
}
