package com.pk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMsProj02ConsumerMsProj02LbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj02ConsumerMsProj02LbcApplication.class, args);
	}

}
