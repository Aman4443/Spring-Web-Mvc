package com.telusko.DataJpa4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.telusko.DataJpa4.model.Vaccine;
import com.telusko.DataJpa4.repo.IVaccineRepo;

@Service
public class VaccineService implements IVaccineService
{
	@Autowired
	private IVaccineRepo repo;

	@Override
	public Vaccine searchVaccineById(Integer id) 
	{
		return repo.getReferenceById(id);
		
	}

	@Override
	public List<Vaccine> searchVaccinesByIds(Iterable<Integer> ids)
	{
		List<Vaccine> vaccines = repo.findAllById(ids);
		return vaccines;
	}

	@Override
	public List<Vaccine> searchVaccinesByVaccine(Vaccine vac)
	{
		Example<Vaccine> example = Example.of(vac);
		
		return repo.findAll(example);
		
	}

	@Override
	public String removevaccinesByIds(List<Integer> ids) 
	{
		List<Vaccine> list = repo.findAllById(ids);
		if(list.size()!=0)
		{
			repo.deleteAllByIdInBatch(ids);
			return "Records of vaccines dleete for the gievn ids";
		}
		return "Records of given ids are not in db to delete";
	}

	@Override
	public String removevaccinesByIdsCrud(List<Integer> ids) 
	{
		
		List<Vaccine> list = repo.findAllById(ids);
		if(list.size()!=0)
		{
			repo.deleteAllById(ids);
			return "Records of vaccines deleted for the given ids";
		}
		return "Records of given ids are not in db to delete";
	}
	
	

}
