package com.telusko.GreeetingsAPP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.GreeetingsAPP.service.GreetingsService;

@SpringBootApplication
public class GreeetingsAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(GreeetingsAppApplication.class, args);
	    
	
		
	}

}
