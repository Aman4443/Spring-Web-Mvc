package com.telusko.multidbapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.multidbapp.entity.pd.Product;
import com.telusko.multidbapp.repo.pd.IProductRepo;

@Service
public class ProductService implements IProductService {

	@Autowired
	private IProductRepo repo;
	
	@Override
	public Product addPd(Product pd) 
	{
		
		return repo.save(pd);
	}

	@Override
	public List<Product> getAllPd() 
	{
		
		return repo.findAll();
	}

}
