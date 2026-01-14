package com.telusko.WebApp1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PathParamDemoController 
{

	//http://localhost:8484/info/Vijaykumar
	@GetMapping("/info/{name}")
	public String getSomeData(@PathVariable("name")String name , Model model)
	{
		model.addAttribute("name", name);
		return "index";
	}
	
	
	//http://localhost:8484/info2/VijayKumar/SpringBoot
	@GetMapping("/info2/{name}/{course}")
	public String getSomeInfo(@PathVariable("name")String name , @PathVariable("course")String course,Model model)
	{
		model.addAttribute("name", "hello "+name+" I Hope you're learning from this "+course+ " course");
		return "index";
	}
}
