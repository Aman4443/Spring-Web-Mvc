package com.telusko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.model.Vaccine;
import com.telusko.repo.IVaccineRepo;

@Service
public class VaccineService implements IVaccineService 
{
	@Autowired
	private IVaccineRepo repo;

	@Override
	public String registerVaccineInfo(Vaccine vaccine) 
	{
		System.out.println(repo.getClass().getName());
		Vaccine vac = repo.save(vaccine);
		return "Vaccine info is saved in database with id "+ vac.getId();
	}

	@Override
	public Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines) 
	{
		
		return repo.saveAll(vaccines);
	
	}

	@Override
	public Long count() 
	{
		return repo.count();
		
	}

	@Override
	public Boolean checkAvailability(Integer id)
	{
		return repo.existsById(id);
		
	}

	@Override
	public Iterable<Vaccine> fetchallVaccinesInfo() 
	{
		return repo.findAll();
		
	}

	@Override
	public Iterable<Vaccine> fetchALlVaccinesBasedOnIds(Iterable<Integer> ids)
	{
		
		return repo.findAllById(ids);
	}

}
