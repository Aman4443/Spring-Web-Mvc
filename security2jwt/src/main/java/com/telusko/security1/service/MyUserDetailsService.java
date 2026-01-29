package com.telusko.security1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.telusko.security1.entity.User;
import com.telusko.security1.repo.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService 
{

	@Autowired
	private UserRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	{
		User user = repo.findByName(username);
		if(user==null)
		{
			System.out.println("User not found");
			throw new UsernameNotFoundException("User not found 404");
		}
		return new UserPrincipal(user);
	}


}
