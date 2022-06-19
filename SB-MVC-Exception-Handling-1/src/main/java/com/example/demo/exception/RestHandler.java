package com.example.demo.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.message;

@RestController
@ControllerAdvice
public class RestHandler {

	@ExceptionHandler(value=productnotfoundexception.class)
	public ResponseEntity<message> handler() {
		message m=new message("400","not found",new Date());
		return new ResponseEntity<message>(m,HttpStatus.BAD_REQUEST);
	}
}
