package com.telusko.GreeetingsAPP.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
	
	private Integer id;
	
	private String name;
	
  //  @JsonProperty(required = true)
	private String city;
	
	private Double age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getAge() {
		return age;
	}

	public void setAge(Double age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + "]";
	}

	public Student(Integer id, String name, String city, Double age) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
