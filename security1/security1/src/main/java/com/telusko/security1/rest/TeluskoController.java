package com.telusko.security1.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class TeluskoController 
{
	
	@GetMapping("/telusko-info")
	public ResponseEntity<String> getInfo(HttpServletRequest request)
	{
		String res="Telusko has launched Java SpringBoot SpringAI React course" + 
	request.getSession().getId();
		return new ResponseEntity<String>(res, HttpStatus.OK);
	}
	
	@GetMapping("/telusko-info-devops")
	public ResponseEntity<String> getCourseInfo(HttpServletRequest request)
	{
		String res="Telusko has launched DevOps weekend Batch"+ request.getSession().getId();
		return new ResponseEntity<String>(res, HttpStatus.OK);
	}

}
