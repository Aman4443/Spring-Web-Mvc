package com.telusko.GreeetingsAPP.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.GreeetingsAPP.service.IGreetings;

//@Controller +@ResponseBody ==> @RestController
@RestController
public class GreetingController 
{
	@Autowired
	private IGreetings greet;
	
//	@GetMapping("/wish")
//	@ResponseBody
//	public String getWish()
//	{
//		String response=greet.generateGreetings("Manish");
//		return response;
//	}
	@GetMapping("/wish")
	public String getWish()
	{
		String response=greet.generateGreetings("Aman Kumar Jha");
		return response;
	}
	
	@GetMapping("/wish2")
	public ResponseEntity<String> getWish2()
	{
		String response=greet.generateGreetings("Aman Jha");
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	
//	@GetMapping("/wish2")
//	@ResponseBody
//	public ResponseEntity<String> getWish2()
//	{
//		String response=greet.generateGreetings("Manish");
//		return new ResponseEntity<String>(response, HttpStatus.OK);
//	}

}
//http://localhost:8080/wish
// http://localhost:8080/wish2
