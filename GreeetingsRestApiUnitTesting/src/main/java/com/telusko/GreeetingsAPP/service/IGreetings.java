package com.telusko.GreeetingsAPP.service;

import com.telusko.GreeetingsAPP.model.Student;

public interface IGreetings 
{
	String generateGreetings(String name);
	public Boolean addStudent(Student stu);

}
