package com.source.dao.service;

import com.source.dao.userdao;

public class userservice {
private userdao dao;

public userservice() {
}
public userservice(userdao dao) {
	this.dao=dao;
}

public String getnamebyid(int id) {
	String name=dao.findbynameid(id);
	return name;
}

public String getemailbyid(int id) {
	String email=dao.findbyemailid(id);
	return email;
}

public void doprocess() {
	pushkafkamsg("msg");
}
public void pushkafkamsg(String string) {
	System.out.println("messge is kafka");
	
}

public String message(String msg) {
	String formattedmsg=formatMsg(msg);
	return formattedmsg;
}
private String formatMsg(String msg) {
	return msg.toUpperCase();
}
}
