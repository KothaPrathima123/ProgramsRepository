package com.pk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

@SpringBootApplication
public class BootMvcProj08WishMessageAppViewResolversApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMvcProj08WishMessageAppViewResolversApplication.class, args);
	}
	
	@Bean
	public ViewResolver createRBVResolver() {
	ResourceBundleViewResolver resolver=new ResourceBundleViewResolver();
	resolver.setBasename("com/pk/commons/views");
	return resolver;
		
	}
	
	

}
