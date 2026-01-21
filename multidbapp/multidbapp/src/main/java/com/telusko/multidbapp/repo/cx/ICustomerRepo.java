package com.telusko.multidbapp.repo.cx;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.multidbapp.entity.cx.Customer;

public interface ICustomerRepo extends JpaRepository<Customer, Long> {

}
