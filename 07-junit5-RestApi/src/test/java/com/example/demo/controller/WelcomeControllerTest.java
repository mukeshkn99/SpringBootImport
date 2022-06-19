package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.service.WelcomeService;

@WebMvcTest
public class WelcomeControllerTest {

	@MockBean
	private WelcomeService welcomeservice;
	
	@Autowired
	private MockMvc mockmvc;
	
	@Test
	public void testmsg() throws Exception {
		when(welcomeservice.getmessage()).thenReturn("LIKE");
		MockHttpServletRequestBuilder request=MockMvcRequestBuilders.get("/welcome");
		ResultActions actions=mockmvc.perform(request);
		MvcResult result=actions.andReturn();
        MockHttpServletResponse response=result.getResponse();
        int status=response.getStatus();
        assertEquals(200, status);
	}

	
}
