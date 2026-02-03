package com.Revision.SecurityDB.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Revision.SecurityDB.entity.Employee;
import com.Revision.SecurityDB.repository.EmpRepo;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private EmpRepo empRepo;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        Employee emp = empRepo.findByEmail(username);

        if (emp == null) {
            throw new UsernameNotFoundException(
                "User not found with email: " + username);
        }

        return User.builder()
                .username(emp.getEmail())
                .password(emp.getPassword())
                .roles(emp.getRole())   // DB value: USER or ADMIN
                .build();
    }
}
