package com.telusko.HATEOASapp.model;

import org.springframework.hateoas.RepresentationModel;

public class Course extends RepresentationModel
{
	private Integer id;
	
	private String course;
	
	private Double cost;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", course=" + course + ", cost=" + cost + "]";
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(Integer id, String course, Double cost) {
		super();
		this.id = id;
		this.course = course;
		this.cost = cost;
	}
	
	

}
