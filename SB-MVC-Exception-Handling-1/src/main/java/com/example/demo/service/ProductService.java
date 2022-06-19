package com.example.demo.service;

import com.example.demo.exception.productnotfoundexception;
import com.example.demo.model.Product;

public interface ProductService {
public Product findid(String productid) throws productnotfoundexception;
}
