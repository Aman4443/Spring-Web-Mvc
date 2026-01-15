package com.telusko.DataJpa4.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.DataJpa4.model.Vaccine;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {

}
