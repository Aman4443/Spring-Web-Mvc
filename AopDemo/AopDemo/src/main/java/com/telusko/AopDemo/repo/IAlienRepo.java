package com.telusko.AopDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.AopDemo.model.Alien;

public interface IAlienRepo extends JpaRepository<Alien, Integer> {

}
