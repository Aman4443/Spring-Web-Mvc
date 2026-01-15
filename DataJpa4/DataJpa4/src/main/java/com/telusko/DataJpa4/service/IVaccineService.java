package com.telusko.DataJpa4.service;

import java.util.List;

import com.telusko.DataJpa4.model.Vaccine;

public interface IVaccineService 
{
	
	 Vaccine searchVaccineById(Integer id);
	 List<Vaccine> searchVaccinesByIds(Iterable<Integer> ids);
	 List<Vaccine> searchVaccinesByVaccine(Vaccine vac); 
	 String removevaccinesByIds(List<Integer> ids);
	 String removevaccinesByIdsCrud(List<Integer> ids);

	 

}
