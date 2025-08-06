package com.pk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value="com/pk/validations/validation.properties")
public class BootMvcProj09MiniProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMvcProj09MiniProjectApplication.class, args);
	}

}
