package com.telusko.WebApp1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController
{
	  @GetMapping("/home")
      public String showHome()
	  {
		  return "home";
	  }
	
	   @GetMapping("/response")
	   public String getResponse(Model model)
	   {
		   String books[]=new String[] {"Aman", "Nikhil","Anay", "Abhay"};
		   model.addAttribute("books", books);
//		   for(String booksName:books)
//		   {
//			   System.out.println(booksName);
//		   }
		   return "response";
	   }
}
