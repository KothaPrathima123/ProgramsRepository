package com.pk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootMs14BillingServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMs14BillingServiceProviderApplication.class, args);
	}

}
