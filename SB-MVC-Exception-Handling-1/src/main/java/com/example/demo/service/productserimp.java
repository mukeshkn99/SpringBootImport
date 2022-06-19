package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.exception.productnotfoundexception;
import com.example.demo.model.Product;

@Service
public class productserimp implements ProductService {

	@Override
	public Product findid(String productid) throws productnotfoundexception {
	if(productid.equals("101")) {
		return new Product("101","java",450.00);
	}
	else {
		 throw new productnotfoundexception("Invalid method");
	}
		
	}

}
