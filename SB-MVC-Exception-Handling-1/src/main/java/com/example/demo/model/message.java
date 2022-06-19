package com.example.demo.model;

import java.util.Date;

public class message {
private String code;
private String message;
private Date date;
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getMessage() {
	return message;
}
@Override
public String toString() {
	return "message [code=" + code + ", message=" + message + ", date=" + date + "]";
}
public void setMessage(String message) {
	this.message = message;
}
public Date getDate() {
	return date;
}
public message() {
	super();
}
public message(String code, String message, Date date) {
	super();
	this.code = code;
	this.message = message;
	this.date = date;
}
public void setDate(Date date) {
	this.date = date;
}
}
