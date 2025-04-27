package com.pk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@SpringBootApplication
public class BootMvcProj07ViewResolverApplication {

	
	
	/*@Bean
	public ViewResolver createIRVR() {
		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		return resolver;
		
	}*/
	
	
	@Bean
	public ViewResolver createIRVR() {
		System.out.println("BootMvcProj07ViewResolverApplication.createIRVR()");
		UrlBasedViewResolver resolver=new UrlBasedViewResolver();
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(InternalResourceView.class);
		return resolver;
		
	}
	public static void main(String[] args) {
		SpringApplication.run(BootMvcProj07ViewResolverApplication.class, args);
	}

}
