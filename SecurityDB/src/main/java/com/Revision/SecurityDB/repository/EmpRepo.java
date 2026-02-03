package com.Revision.SecurityDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Revision.SecurityDB.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee,Integer> {
public Employee findByEmail(String email);
}
