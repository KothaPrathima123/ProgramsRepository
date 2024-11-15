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
		http.authorizeRequests().antMatchers("/").permitAll()//notauthentication and no authorization
		.antMatchers("/offers").authenticated()//only authentication
		.antMatchers("/balance").hasAnyRole("CUSTOMER","MANAGER")//authentication + authorization for cuatomer,manager role users
		.antMatchers("/loanApprove").hasRole("MANAGER")//authentication = authorizatio for 
		.anyRequest().authenticated()//remaining urls must be authenticated
		//specify authentication mode(uss the browser managed dialog for collecting username,password from enduser
		//.and().httpBasic()
		.and().formLogin()
		.and().rememberMe()
		.and().logout()
		.and().sessionManagement().maximumSessions(2).maxSessionsPreventsLogin(true);
		
		//exceptiom/errorhandling(403 page)
		//.and().exceptionHandling().accessDeniedPage("/denied");
		
		
	}
}
