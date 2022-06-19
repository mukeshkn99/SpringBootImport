package com.example.demo.service;

import com.example.demo.exception.NoBookFoundException;

public interface bookservice {
public Double getid(String bookid) throws NoBookFoundException; 
}
