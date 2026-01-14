package com.telusko.WebApp1.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.telusko.WebApp1.service.IGreetingService;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class GreetingController
{
   
	 @Autowired
	 private IGreetingService service;
	 
	 @GetMapping("/greet")
	// public String getGreetings(Model model)
	 public String getGreetings(Map<String, Object> map)
	 {
		 map.put("greet", service.getGreetings("Vijay"));
		 return "greetings";
	 }
	 
//	 @PostMapping("/greet")
//	 public String getGreeting1(Map<String, Object> map)
//	 {
//		 map.put("greet", service.getGreetings("Vijay"));
//		 return "greetings";
//	 }
	 
	 @GetMapping("/greetings")
	 public Map<String, Object> getGreetings()
	 {
		 Map<String, Object> map=new HashMap<>();
		 map.put("greet", service.getGreetings("Sanjai"));
		 return map;
	 }
	 
	 @GetMapping("/wish")
	 public void getGreetings(HttpServletResponse response) throws IOException
	 {
		 PrintWriter writer=response.getWriter();
		 writer.println("<h1> This is from greetings app Servlet:  "+service.getGreetings("Samuel")+" </h1>");
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
