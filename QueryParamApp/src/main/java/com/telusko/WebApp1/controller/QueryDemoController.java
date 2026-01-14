package com.telusko.WebApp1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QueryDemoController 
{

	//http://localhost:8484/info?name=AmanJha
	@GetMapping("/info")
	public String getSomeData(@RequestParam("name")String name , Model model)
	{
		model.addAttribute("name", name);
		return "index";
	}
	
	
	//http://localhost:8484/info2?name=Aman%20Jha&course=SpringBoot
	@GetMapping("/info2")
//	public String getSomeInfo(@RequestParam("name")String name , @RequestParam("course")String course,Model model)
	public String getSomeInfo(@RequestParam("name")String name , String course,Model model)

	{
		model.addAttribute("name", "hello "+name+" I Hope you're learning from this "+course+ " course");
		return "index";
	}
}

////http://localhost:8484/info?name=AmanJha
//http://localhost:8484/info2?name=Aman%20Jha&course=SpringBoot