package com.bloodbank.springsecurity.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity(debug = true)
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private PasswordEncoder bcryptcalculator;
	@Autowired
	private DataSource dataSource;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		/*auth
		.inMemoryAuthentication().withUser("admin")
		.password("$2a$10$ow5YG1g6iZRWfoPM5FO6XO9eYXwEWinT0NVZFMsuvUNaqo6nOINbi").roles("admin")
		.and().withUser("babu")
		.password("$2a$10$KsGCb4w9j.AoH3W88fSlnOE2/oQg4oM8CFS0MRQqxldTlQW6CeWn2").roles("customer");
		System.out.println("---" + bcryptcalculator.encode("123"));*/
		
		//auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(NoOpPasswordEncoder.getInstance());
		auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(passwordEncoder);
		
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// http.authorizeRequests().anyRequest().authenticated().and().formLogin().and().httpBasic();
		/*http
		.authorizeRequests()
		.antMatchers("/hellow", "/hi").hasRole("admin") // we are giving role to user
		.antMatchers("/bye").authenticated()
		.antMatchers("/hellowWorld").permitAll()
		.antMatchers("/").permitAll()
		.and().formLogin().and().httpBasic();*/
		
		
		// /authuser
		
		/*http
		.authorizeRequests()
		.antMatchers("/hellow").authenticated()
		.antMatchers("/bye").authenticated()
		.antMatchers("/hellowWorld").permitAll()
		.antMatchers("/signup").permitAll()
		//.antMatchers("/myCustomLogin").permitAll()
		.antMatchers("/").permitAll()
		.and()
		.formLogin().loginPage("/myCustomLogin").loginProcessingUrl("/login-process")
		.and()
		.httpBasic().and().logout();*/
		
		
		http
		.authorizeRequests()
		.antMatchers("/coder").hasAuthority("coder")
		.antMatchers("/developer").hasAuthority("developer")
		.antMatchers("/admin").hasAuthority("admin")
		.antMatchers("/hellowWorld", "/campRegistration").permitAll()
		.and()
		.formLogin().loginPage("/myCustomLogin").loginProcessingUrl("/login-process").permitAll()
		.and().httpBasic().and().logout().and()
		.exceptionHandling().accessDeniedPage("/accessdenied");
	}

	/*
	 * @Bean PasswordEncoder getPasswordEncoder() {
	 * //https://www.bcryptcalculator.com/encode return new BCryptPasswordEncoder();
	 * }
	 */
}
