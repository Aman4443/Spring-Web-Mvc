package com.telusko.security1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.security1.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, String>
{

	User findByName(String userName);
}
