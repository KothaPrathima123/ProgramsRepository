package com.pk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMs14ShoppingServiceOperationsControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMs14ShoppingServiceOperationsControllerApplication.class, args);
	}

}
