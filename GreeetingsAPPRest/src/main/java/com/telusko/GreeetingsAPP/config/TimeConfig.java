package com.telusko.GreeetingsAPP.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TimeConfig
{
	public TimeConfig()
	{
		System.out.println("Time config bean created");
	}
	
	@Bean
	public LocalTime createTime()
	{
		return LocalTime.now();
	}
}
