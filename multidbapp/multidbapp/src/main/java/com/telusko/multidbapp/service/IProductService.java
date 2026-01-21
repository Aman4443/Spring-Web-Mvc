package com.telusko.multidbapp.service;

import java.util.List;

import com.telusko.multidbapp.entity.pd.Product;

public interface IProductService 
{
	Product addPd(Product pd);
	List<Product> getAllPd();
}
