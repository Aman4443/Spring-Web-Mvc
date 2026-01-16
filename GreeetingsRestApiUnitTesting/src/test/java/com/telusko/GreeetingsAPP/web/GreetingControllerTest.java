package com.telusko.GreeetingsAPP.web;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.MediaType;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
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

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telusko.GreeetingsAPP.model.Student;
import com.telusko.GreeetingsAPP.service.IGreetings;

@WebMvcTest(GreetingController.class)
public class GreetingControllerTest
{
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private IGreetings service;
	
	@Test
	@Disabled
	public void testGetWish2() throws Exception
	{
		
		//MockObject
		Mockito.when(service.generateGreetings("Manish")).thenReturn("Good Morning");
		
		//Request Object
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/wish2");
		
		ResultActions res = mockMvc.perform(requestBuilder);
		MvcResult result = res.andReturn();
		MockHttpServletResponse response = result.getResponse();
		int status = response.getStatus();
		
		//unit testing //assertion
		assertEquals(200, status);
	}
	
	@Test
	public void testAddStuInfo() throws Exception
	{
		//Mocking
		Mockito.when(service.addStudent(ArgumentMatchers.any())).thenReturn(true);
		
		Student st=new Student(1, "Rohan", "Begaluru", 16.2);
		ObjectMapper map=new ObjectMapper();
		String json=map.writeValueAsString(st);
		
		//Request Object
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/add-stu")
				.contentType(MediaType.APPLICATION_JSON)
				.content(json);
		
		ResultActions res = mockMvc.perform(requestBuilder);
		MvcResult result = res.andReturn();
		MockHttpServletResponse response = result.getResponse();
		int status = response.getStatus();
		
		//unit testing //assertion
		assertEquals(201, status);
		
	}
	
	
	
	
	
	
	
	
	
	
}
