package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.productnotfoundexception;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@RestController
public class productcontroller {
	
	@Autowired
	private ProductService service;
	
	@GetMapping(value="/product",produces= {"application/json"})
public Product findproduct(@RequestParam("productid") String productid) throws productnotfoundexception {
	return service.findid(productid);
	
}
}
