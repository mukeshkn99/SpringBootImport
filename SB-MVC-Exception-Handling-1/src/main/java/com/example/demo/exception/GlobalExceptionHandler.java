package com.example.demo.exception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value=NullPointerException.class)
	public String handler(Model model) {
		model.addAttribute("errormsg", "something went wrong");
		return "error";
	}
	@ExceptionHandler(value=NoBookFoundException.class)
	public String handlerexception() {
		return "customerror";
	}
}
