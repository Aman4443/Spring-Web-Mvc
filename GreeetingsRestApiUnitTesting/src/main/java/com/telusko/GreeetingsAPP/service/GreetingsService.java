package com.telusko.GreeetingsAPP.service;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.GreeetingsAPP.model.Student;

@Service
public class GreetingsService implements IGreetings
{
	
	@Autowired
	private LocalTime time;
	
	public GreetingsService()
	{
		System.out.println("Greeting Service bean created");
	}

	@Override
	public String generateGreetings(String name)
	{
		
		int hour=time.getHour();
		if(hour < 12)
			return "Good Morning "+ name;
		else if(hour < 16)
			return "Good Afternoon " + name;
		else if(hour < 20)
			return "Good Evening "+name;
		else
		return "Good Night "+ name;
	}
	
	public Boolean addStudent(Student stu)
	{
		System.out.println(stu);
		return true;
	}

}
