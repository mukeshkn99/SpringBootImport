package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.exception.NoBookFoundException;
import com.example.demo.service.bookservice;

@Controller
public class bookcontroller {

	@Autowired
	private bookservice service;
	
	@RequestMapping("/find")
	public String find(@RequestParam("bookid") String bookid,Model model) throws NoBookFoundException {
		Double d=service.getid(bookid);
		model.addAttribute("price", "d:"+d);
		return "finderror";
	}
}
