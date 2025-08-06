package com.pk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootMs13CustomerRestApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMs13CustomerRestApi1Application.class, args);
	}

}
