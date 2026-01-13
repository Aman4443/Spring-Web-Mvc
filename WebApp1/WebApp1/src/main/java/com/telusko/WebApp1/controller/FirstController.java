package com.telusko.WebApp1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController 
{
	
	@RequestMapping("/alien")	
	public ModelAndView displayInfo()
	{
		ModelAndView mav=new ModelAndView();
		mav.addObject("message", "This is my First WebAPP");
		mav.setViewName("index");
		
		return mav;
	}
	
	@GetMapping("/info")	
	public ModelAndView displayInfo2()
	{
		ModelAndView mav=new ModelAndView();
		mav.addObject("message", "This is my First WebAPP with Telusko");
		mav.setViewName("index");
		
		return mav;
	}

}
