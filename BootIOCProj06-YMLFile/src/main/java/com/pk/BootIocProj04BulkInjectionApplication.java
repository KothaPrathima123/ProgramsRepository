package com.pk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.pk.sbeans.Company;

@SpringBootApplication
@PropertySource("com/nt/commons/Info.properties")
public class BootIocProj04BulkInjectionApplication {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(BootIocProj04BulkInjectionApplication.class, args);
		//get spring bena class obj ref
		Company company=ctx.getBean("comp",Company.class);
		System.out.println("Injected data ::"+company);
		
		//close container
		 ((ConfigurableApplicationContext) ctx).close();
	}

}
