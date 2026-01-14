package com.telusko.WebApp1.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.telusko.WebApp1.model.Course;

@Controller
public class CourseController 
{
    @GetMapping("/course")
	public String getTheCourseInfo(Map<String, Object> map)
	{
    	map.put("Roll_no", 17);
    	map.put("Name", "Aman");
    	map.put("City", "Etawah");
		return "courseinfo";
	}
    
    @GetMapping("/couse-info")
    public String getTheCourse(Model model)
    {
    	Course course =new Course(1, "System Design", 4999.9);
    	model.addAttribute("course", course);
    	return "course";
    }
    
}
//   http://localhost:8484/courseapp/course
