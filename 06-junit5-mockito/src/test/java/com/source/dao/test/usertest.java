 package com.source.dao.test;

import static org.junit.Assert.assertEquals;

import java.nio.channels.AsynchronousServerSocketChannel;

import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

import com.source.dao.userdao;
import com.source.dao.service.userservice;

public class usertest {
@Test
public void getname() {
	userdao mockito=PowerMockito.mock(userdao.class);
	PowerMockito.when(mockito.findbynameid(101)).thenReturn("smith");
	
	userservice service=new userservice(mockito);
	String result=service.getnamebyid(101);
	assertEquals("smith", result);
}

@Test
public void getemail() {
	userdao mockito=PowerMockito.mock(userdao.class);
	PowerMockito.when(mockito.findbyemailid(102)).thenReturn("smith123@gmail.com");
	
	userservice service=new userservice(mockito);
	String result=service.getemailbyid(102);
	assertEquals("smith123@gmail.com", result);
}

@Test
public void getmsg() {
	userservice service=PowerMockito.mock(userservice.class);
	try {
		PowerMockito.doNothing().when(service,"pushkafksmsg",toString());
		service.doprocess();
	}
	catch(Exception e){
		e.printStackTrace();
	}
}

@Test
public void messageadd() throws Exception {
	userservice service=new userservice();
	userservice spy=PowerMockito.spy(service);
	PowerMockito.doReturn("TEXT MESSAGE").when(spy,"formatMsg","text message");
	String result=service.message("text message");
	assertEquals("TEXT MESSAGE", result);
}

}
