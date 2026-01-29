package com.telusko.security1.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.security1.entity.User;
import com.telusko.security1.service.JwtService;
import com.telusko.security1.service.UserService;

@RestController
public class UserController 
{
	@Autowired
	private AuthenticationManager authenticationmanager;
	
	@Autowired
	private UserService service;
	
	@Autowired
	private JwtService jwtService;
	
	BCryptPasswordEncoder bcrypt=new BCryptPasswordEncoder(10);
	
	@PostMapping("/add-user")
	public User registerUser(@RequestBody User user)
	{
		System.out.println(user);
		user.setPassword(bcrypt.encode(user.getPassword()));
		return service.registerUser(user);	
	}
	
	@PostMapping("/login")
	public String loginUser(@RequestBody User user)
	{
		Authentication authentication= authenticationmanager.authenticate
				(new UsernamePasswordAuthenticationToken(user.getName(), user.getPassword()));
		
		if(authentication.isAuthenticated())
		{
			String token=jwtService.generateToken(user.getName());
			return token;
		}
		else
		{
			return "Invalid Credentials";
		}
	}
	
	
}
