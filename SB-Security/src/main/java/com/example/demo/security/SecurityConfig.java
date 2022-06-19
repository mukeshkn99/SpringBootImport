package com.example.demo.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/balance").authenticated()
		.antMatchers("/myloan").authenticated()
		.antMatchers("/statement").authenticated()
		.antMatchers("/home").permitAll()
		.antMatchers("/contact").permitAll()
		.and().formLogin()
		.and().httpBasic();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("mukesh").password("mukesh@123").authorities("admin").and()
		.withUser("raju").password("raju@123").authorities("user").and()
		.withUser("kanesh").password("kanesh@123").authorities("user").and()
		.passwordEncoder(NoOpPasswordEncoder.getInstance());
		
	}
}
