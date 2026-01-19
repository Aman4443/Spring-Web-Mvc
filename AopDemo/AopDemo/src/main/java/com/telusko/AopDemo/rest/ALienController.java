package com.telusko.AopDemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.AopDemo.model.Alien;
import com.telusko.AopDemo.service.IAlienService;

@RestController
public class ALienController 
{
	@Autowired
	private IAlienService service;
	
	@PostMapping("/add-alien")
	public ResponseEntity<Alien> registerAlien(@RequestBody Alien alien)
	{
		Alien aliendb = service.registerALien(alien);
		return new ResponseEntity<Alien>(aliendb, HttpStatus.CREATED);
	}
	
	@GetMapping("/get-aliens")
	public ResponseEntity<List> getALien()
	{
		List<Alien> aliens = service.getAllAliensInfo();
		
		return new ResponseEntity<List>(aliens, HttpStatus.OK);

	}

}
