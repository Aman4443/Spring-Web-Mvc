package com.telusko.multidbapp.service;

import java.util.List;

import com.telusko.multidbapp.entity.cx.Customer;

public interface ICustomerService 
{
	Customer addCx(Customer cx);
	List<Customer> getAllCx();
}
