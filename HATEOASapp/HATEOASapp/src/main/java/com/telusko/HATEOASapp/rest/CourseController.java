package com.telusko.HATEOASapp.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.HATEOASapp.model.Course;

@RestController
public class CourseController 
{
	
	@GetMapping("/get-course")
	public ResponseEntity<Course> getCourseDetails()
	{
		Course course=new Course(4, "AI Engineering", 54545.6);
		
//		Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CourseController.class).getJavaInfo())
//		.withRel("get-java");
		
		Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CourseController.class).getCourseInfo())
				.withRel("get-all-courses");
		
		course.add(link);
		
		return new ResponseEntity<Course>(course, HttpStatus.OK);
	}

	@GetMapping("/get-java")
	public List<Course> getJavaInfo()
	{
		List courseInfo=new ArrayList<>();
		courseInfo.add(new Course(1, "SpringBoot", 4999.9));
		return courseInfo;
	}
	
	@GetMapping("/get-all-courses")
	public List<Course> getCourseInfo()
	{
		List courseInfo=new ArrayList<>();
		courseInfo.add(new Course(1, "SpringBoot", 4999.9));
		courseInfo.add(new Course(2, "Java", 4445.9));
		courseInfo.add(new Course(3, "DevOps with AWS", 5545.5));
		return courseInfo;
	}
}


