package com.telusko.multidbapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.multidbapp.entity.cx.Customer;
import com.telusko.multidbapp.entity.pd.Product;
import com.telusko.multidbapp.service.ICustomerService;
import com.telusko.multidbapp.service.IProductService;

@RestController
public class TeluskoController 
{
	@Autowired
	private ICustomerService service1;
	
	
	@Autowired
	private IProductService service2;
	
	@PostMapping("/add-cx")
	public ResponseEntity<Customer> addCx(@RequestBody Customer cx)
	{
		Customer dbcx=service1.addCx(cx);
		return new ResponseEntity<Customer>(dbcx, HttpStatus.CREATED);
	}
	
	@PostMapping("/add-pd")
	public ResponseEntity<Product> addPd(@RequestBody Product pd)
	{
		Product dbpd=service2.addPd(pd);
		return new ResponseEntity<Product>(dbpd, HttpStatus.CREATED);
	}
	
	@GetMapping("/get-pd")
	public ResponseEntity<List> getPd()
	{
		List<Product> dbpd=service2.getAllPd();
		return new ResponseEntity<List>(dbpd, HttpStatus.OK);
	}
	
	@GetMapping("/get-cx")
	public ResponseEntity<List> getCx()
	{
		List<Customer> dbcx=service1.getAllCx();
		return new ResponseEntity<List>(dbcx, HttpStatus.OK);
	}

}
