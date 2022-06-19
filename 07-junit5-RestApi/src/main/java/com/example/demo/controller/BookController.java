package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookservice;
	
	@PostMapping(value="/addbook" ,consumes="{application/json}")
	public ResponseEntity<Boolean> bookinfo(@RequestBody Book book) {
		Boolean issaved=bookservice.savebook(book);
		if(issaved) {
			return new ResponseEntity<>(issaved,HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<>(issaved,HttpStatus.BAD_REQUEST);
		}
	}
}
