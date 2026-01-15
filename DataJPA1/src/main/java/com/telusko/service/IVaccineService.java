package com.telusko.service;

import com.telusko.model.Vaccine;

public interface IVaccineService 
{
	String registerVaccineInfo(Vaccine vaccine);
	Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines);
	Long count();
	Boolean checkAvailability(Integer id);
	Iterable<Vaccine> fetchallVaccinesInfo();
	Iterable<Vaccine> fetchALlVaccinesBasedOnIds(Iterable<Integer> ids);

}
