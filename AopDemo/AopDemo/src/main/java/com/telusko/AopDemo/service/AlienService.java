package com.telusko.AopDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.AopDemo.model.Alien;
import com.telusko.AopDemo.repo.IAlienRepo;


@Service
public class AlienService implements IAlienService {

	@Autowired	
	private IAlienRepo repo;
	
	@Override
	public Alien registerALien(Alien alien) 
	{
		return repo.save(alien);
	}

	@Override
	public List<Alien> getAllAliensInfo()
	{
		
		return repo.findAll();
	}

}
