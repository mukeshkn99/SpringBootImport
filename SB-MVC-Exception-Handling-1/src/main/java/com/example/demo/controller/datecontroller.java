package com.example.demo.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class datecontroller {
	@RequestMapping("/get")
public String date(Model model) {
	model.addAttribute("msg", "new date:"+new Date());
	String name=null;
	name.length();
	return "welcome";
}
}
