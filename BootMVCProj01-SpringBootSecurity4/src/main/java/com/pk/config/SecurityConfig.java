package com.pk.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired
	private DataSource ds;
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws  Exception{
		//auth.inMemoryAuthentication().withUser("raja").password("{noop}rani").roles("CUSTOMER");
		//auth.inMemoryAuthentication().withUser("ramesh").password("{noop}hyd").roles("MANAGER");
		auth.jdbcAuthentication().dataSource(ds).passwordEncoder(new BCryptPasswordEncoder())
		.usersByUsernameQuery("SELECT UNAME,PWD,STATUS FROM USERS WHERE UNAME=?")//for authentication
		.authoritiesByUsernameQuery("SELECT UNAME,ROLE FROM USER_ROLES WHERE UNAME=?");//for authorization
	}
	@Override
	public void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests().antMatchers("/").permitAll()
		.antMatchers("/offers").authenticated()
		.antMatchers("/balance").hasAnyAuthority("CLERK","MANAGER")
		.antMatchers("/loan").hasAuthority("MANAGER")
		.anyRequest().authenticated()
		.and().formLogin()
		.and().rememberMe()
		.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/signout"))
		//and().logout()
	//and().httpBasic()//enables basic mdoe of authnetiction makes browser generating the dialogbox asking for username and password
	//cfg error page for 403 authorization error
		.and().exceptionHandling().accessDeniedPage("/denied")
		.and().sessionManagement().maximumSessions(2).maxSessionsPreventsLogin(true);	
	}

}
