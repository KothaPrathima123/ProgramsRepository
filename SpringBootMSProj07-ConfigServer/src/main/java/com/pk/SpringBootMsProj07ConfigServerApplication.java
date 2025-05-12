package com.pk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringBootMsProj07ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj07ConfigServerApplication.class, args);
	}

}
