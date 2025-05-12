package com.pk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootMs01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMs01Application.class, args);
	}

}
