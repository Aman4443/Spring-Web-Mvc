package com.telusko.security1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.security1.entity.User;
import com.telusko.security1.repo.UserRepo;

@Service
public class UserService
{
	@Autowired
	private UserRepo repo;
	
	
	
	public User registerUser(User user)
	{
		User usr=repo.save(user);
		return usr;
	}

}
