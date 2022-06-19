package com.example.demo.exception;


public class Apierror {
private String message;
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
private String code;
}
