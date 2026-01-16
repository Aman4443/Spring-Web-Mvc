package com.telusko.GreeetingsAPP.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.GreeetingsAPP.model.Student;

@RestController
public class StudentController
{
	
	@GetMapping("/info")
	public ResponseEntity<Student> getStudentInfo()
	{
		
		Student s=new Student(1, "Rohan", "Bengaluru", 16.4);
		return new ResponseEntity<Student>(s, HttpStatus.OK);
	}
	
	@GetMapping("/info2")
	public Student getStudentInfo2()
	{
		
		Student s=new Student(1, "Rohan", "Bengaluru", 16.4);
		return s;
	}
	
//	@PostMapping("/add-stu")
//	public ResponseEntity<Student> addStudentInfo(@RequestBody Student st)
//	{
//		System.out.println(st);
//		return new ResponseEntity<Student>(st, HttpStatus.CREATED);
//
//	}

}
