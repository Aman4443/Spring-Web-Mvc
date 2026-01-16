package com.telusko.GreeetingsAPP.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.GreeetingsAPP.model.Student;
import com.telusko.GreeetingsAPP.service.IGreetings;

@RestController
public class GreetingController 
{
	@Autowired
	private IGreetings greet;
	

	@GetMapping("/wish")
	public String getWish()
	{
		String response=greet.generateGreetings("Manish");
		return response;
	}
	
	@GetMapping("/wish2")
	public ResponseEntity<String> getWish2()
	{
		String response=greet.generateGreetings("Manish");
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	
	@PostMapping("/add-stu")
	public ResponseEntity<Student> addStudentInfo(@RequestBody Student st)
	{
		System.out.println(st);
		greet.addStudent(st);
		return new ResponseEntity<Student>(st, HttpStatus.CREATED);

	}
	


}
