package com.telusko.multidbapp.repo.pd;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.multidbapp.entity.pd.Product;

public interface IProductRepo extends JpaRepository<Product, Long> {

}
