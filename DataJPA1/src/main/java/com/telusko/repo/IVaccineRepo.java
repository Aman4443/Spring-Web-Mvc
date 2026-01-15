package com.telusko.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.telusko.model.Vaccine;

@Repository
public interface IVaccineRepo extends CrudRepository<Vaccine, Integer>
{

}
