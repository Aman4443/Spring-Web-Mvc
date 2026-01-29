package com.telusko.security1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig 
{
	@Autowired
	private UserDetailsService userDetailsService;

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
	{
		http.csrf(customizer -> customizer.disable());
		http.authorizeHttpRequests(request -> request.requestMatchers("add-user", "login").permitAll()
				.anyRequest().authenticated());
		http.httpBasic(Customizer.withDefaults());
		http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		return http.build();	
	}
	
	@Bean
	public AuthenticationProvider authProvider()
	{
		DaoAuthenticationProvider daoAuth=new DaoAuthenticationProvider();
		daoAuth.setUserDetailsService(userDetailsService);
		//daoAuth.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		daoAuth.setPasswordEncoder(new BCryptPasswordEncoder(10));
		
		return daoAuth;
	}
	@Bean
	public AuthenticationManager authenticationmanager(AuthenticationConfiguration config) throws Exception
	{
		return config.getAuthenticationManager();
	}
	
//	@Bean
//	public AuthenticationManager authenticationManager(
//	        HttpSecurity http,
//	        PasswordEncoder passwordEncoder,
//	        UserDetailsService userDetailsService) throws Exception {
//
//	    AuthenticationManagerBuilder builder =
//	            http.getSharedObject(AuthenticationManagerBuilder.class);
//
//	    builder
//	        .userDetailsService(userDetailsService)
//	        .passwordEncoder(NoOpPasswordEncoder.getInstance());
//
//	    return builder.build();
//	}

	
	
//	@Bean
//	public UserDetailsService userDetailsService()
//	{
//			UserDetails user=User.withDefaultPasswordEncoder()
//					.username("Vijay")
//					.password("telusko123")
//					.roles("USER")
//					.build();
//			
//			UserDetails admin=User.withDefaultPasswordEncoder()
//					.username("Dinesh")
//					.password("telusko1234")
//					.roles("ADMIN")
//					.build();
//			
//			return new InMemoryUserDetailsManager(user, admin);
//	}

}
