package com.telusko.AopDemo.service;

import java.util.List;

import com.telusko.AopDemo.model.Alien;

public interface IAlienService {
	
	Alien registerALien(Alien alien);
	
	List<Alien> getAllAliensInfo();

}
