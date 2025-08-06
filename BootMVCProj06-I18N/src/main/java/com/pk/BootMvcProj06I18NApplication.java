package com.pk;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class BootMvcProj06I18NApplication {

	
	@Bean(name="localeResolver")
	public SessionLocaleResolver createSLResolver() {
		SessionLocaleResolver resolver=new SessionLocaleResolver();
		resolver.setDefaultLocale(new Locale("en","US"));
		return resolver;
	}
	@Bean
	public LocaleChangeInterceptor createCInterceptor() {
		LocaleChangeInterceptor interceptor=new LocaleChangeInterceptor();
		interceptor.setParamName("lang");
		return interceptor;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BootMvcProj06I18NApplication.class, args);
	}


	
	
}
