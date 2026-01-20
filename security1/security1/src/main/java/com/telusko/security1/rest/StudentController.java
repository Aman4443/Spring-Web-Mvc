package com.telusko.security1.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.security1.model.Student;

@RestController
public class StudentController 
{
	List<Student> students=new ArrayList<>(List.of(new Student(1, "Rohan" ,"java"),
			
			new Student(2, "Rohit" ,"DevOps"),
			new Student(3, "Ramesh" ,"System Design")));
	
	
	@GetMapping("/get-students")
	public List<Student> getSTudents()
	{
		return students;
	}
	
	@PostMapping("/add-student")
	public void addStudents(@RequestBody Student st)
	{
		students.add(st);
	}

}
