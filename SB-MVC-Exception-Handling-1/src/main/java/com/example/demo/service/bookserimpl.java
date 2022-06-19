package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.exception.NoBookFoundException;

@Service
public class bookserimpl implements bookservice {

	@Override
	public Double getid(String bookid) throws NoBookFoundException {
		if(bookid.equals("b101")) {
			return 450.00;
		}
		else {
			throw new NoBookFoundException("Invalid");
		}
	}



}
