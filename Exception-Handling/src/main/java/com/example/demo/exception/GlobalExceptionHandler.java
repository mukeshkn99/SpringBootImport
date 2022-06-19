package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.NoCustomedFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value= {ArithmeticException.class})
	public ResponseEntity<Apierror> exception(ArithmeticException ae){
		String expmsg=ae.getMessage();
		String code="Exb100";
		
		Apierror error=new Apierror();
		error.setMessage(expmsg);
		error.setCode(code);
		
		return new ResponseEntity<Apierror>(error,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@ExceptionHandler(value= {NoCustomedFoundException.class})
	public ResponseEntity<Apierror> exception(NoCustomedFoundException nce){
		String expmsg=nce.getMessage();
		String code="Exb102";
		
		Apierror error=new Apierror();
		error.setMessage(expmsg);
		error.setCode(code);
		
		return new ResponseEntity<Apierror>(error,HttpStatus.BAD_REQUEST);
	}
}
