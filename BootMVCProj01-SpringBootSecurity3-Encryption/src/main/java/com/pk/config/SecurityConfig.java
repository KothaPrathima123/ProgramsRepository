package com.pk.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Override
	public void configure(AuthenticationManagerBuilder auth) {
		auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("raja").password("$2a$10$c.qibNJwgPX7FynuE2il0eMk3XVxZAizWFAbUb/errhmA5RJ1d6ge").roles("CUSTOMER").accountLocked(true));
	auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("ramesh").password("$2a$10$VGfLVzcXOEV2V4R8MB0kgu1vTVHjsCWKh1b.JayuiaLpb44lEm6CK").roles("MANAGER");
	}
	
	
	
	
}
