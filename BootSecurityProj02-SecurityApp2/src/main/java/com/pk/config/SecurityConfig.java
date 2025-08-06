package com.pk.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication().withUser("raja").password("{noop}rani").roles("CUSTOMER");
		auth.inMemoryAuthentication().withUser("ramesh").password("{noop}hyd").roles("MANAGER");
	}
	@Override
	public void configure(HttpSecurity http) throws Exception{
		//authorize requests
		http.authorizeRequests()
		.antMatchers("/customer**").hasRole("MANAGER")
		.antMatchers("/").permitAll()//notauthentication and no authorization
		.antMatchers("/registeroffers").authenticated()//only authentication
		.antMatchers("/registerbalance").hasAnyRole("CUSTOMER","MANAGER")//authentication + authorization for cuatomer,manager role users
		.antMatchers("/regitserloanApprove").hasRole("MANAGER")//authentication = authorizatio for 
		//.antMatchers("/register*").hasAnyRole("MANAGER","CUSTOMER")//single level 
		.antMatchers("/register","/registerbalance").hasRole("MANAGER")
		.anyRequest().authenticated()//remaining urls must be authenticated
		//specify authentication mode(uss the browser managed dialog for collecting username,password from enduser
		//.and().httpBasic()
		//only manager role authenticated users can access webpages whose urls starts with /customer and contain multi path
		.and().formLogin()
		.and().rememberMe()
		.and().logout()
		.and().sessionManagement().maximumSessions(2).maxSessionsPreventsLogin(true);
		
		//exceptiom/errorhandling(403 page)
		//.and().exceptionHandling().accessDeniedPage("/denied");
		
		
	}
}
