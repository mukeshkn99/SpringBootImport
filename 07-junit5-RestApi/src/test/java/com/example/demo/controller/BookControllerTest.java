package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest
public class BookControllerTest {

	@MockBean
	private BookService bookservice;
	
	@Autowired
	private MockMvc mockmvc;
	
	@Test
	public void testbook() throws Exception {
		when(bookservice.savebook(ArgumentMatchers.any()));
		Book b=new Book("101","Java",120.00);
		ObjectMapper mapper=new ObjectMapper();
		String json=mapper.writeValueAsString(b);
		
		MockHttpServletRequestBuilder request=MockMvcRequestBuilders.post("/addbook")
		                    .contentType(MediaType.APPLICATION_JSON)
	                        .content(json);
		
ResultActions actions=mockmvc.perform(request);
	MvcResult result=actions.andReturn();
	MockHttpServletResponse response=result.getResponse();
	int status=response.getStatus();
	assertEquals(201,status);
	}

	private Object when(Boolean savebook) {
		// TODO Auto-generated method stub
		return null;
	}                    
}
