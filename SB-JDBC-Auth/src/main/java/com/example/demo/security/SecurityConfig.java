package com.example.demo.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
@Autowired
private DataSource datasource;

@Bean
public PasswordEncoder passwordEncoder()
{
    return new BCryptPasswordEncoder();
}

@Autowired
private BCryptPasswordEncoder encoder;

@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
		.dataSource(datasource)
		.usersByUsernameQuery("Select user_name,user_password,user_role,user_enabled from user where user_name=?")
	    .authoritiesByUsernameQuery("Select user_name,user_password,user_role from user where user_name=?")
	    .passwordEncoder(encoder);
	}

@Override
	protected void configure(HttpSecurity http) throws Exception {
	http.authorizeRequests()
	.antMatchers("/home").permitAll()
	.antMatchers("/admin").hasAuthority("ADMIN")
	.antMatchers("/employee").hasAuthority("EMPLOYEE")
	.antMatchers("/manager").hasAuthority("MANAGER")
	.anyRequest().authenticated()
	
	
	.and()
	.formLogin()
	.defaultSuccessUrl("welcome",true)
	
	.and()
	.logout()
	.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
	
	.and()
	.exceptionHandling()
	.accessDeniedPage("/accessdenied");
	
	
	
	
	}
}
