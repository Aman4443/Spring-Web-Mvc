package com.telusko.multidbapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.multidbapp.entity.cx.Customer;
import com.telusko.multidbapp.repo.cx.ICustomerRepo;

@Service
public class CustomerService implements ICustomerService 
{

	@Autowired
	private ICustomerRepo repo;
	
	@Override
	public Customer addCx(Customer cx) 
	{
		
		return repo.save(cx);
	}

	@Override
	public List<Customer> getAllCx()
	{
		
		return repo.findAll();
	}

}
