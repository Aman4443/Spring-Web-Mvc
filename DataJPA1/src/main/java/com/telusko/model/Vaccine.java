package com.telusko.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;  

@Entity
public class Vaccine 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String vaccineNmae;
	
	private String vaccineCompany;
	
	private Double cost;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVaccineNmae() {
		return vaccineNmae;
	}

	public void setVaccineNmae(String vaccineNmae) {
		this.vaccineNmae = vaccineNmae;
	}

	public String getVaccineCompany() {
		return vaccineCompany;
	}

	public void setVaccineCompany(String vaccineCompany) {
		this.vaccineCompany = vaccineCompany;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Vaccine [id=" + id + ", vaccineNmae=" + vaccineNmae + ", vaccineCompany=" + vaccineCompany + ", cost="
				+ cost + "]";
	}

	public Vaccine(String vaccineNmae, String vaccineCompany, Double cost) {
		super();
		this.vaccineNmae = vaccineNmae;
		this.vaccineCompany = vaccineCompany;
		this.cost = cost;
	}

	public Vaccine() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
