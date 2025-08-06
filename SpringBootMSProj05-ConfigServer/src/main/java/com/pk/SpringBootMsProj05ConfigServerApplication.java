package com.pk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class SpringBootMsProj05ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj05ConfigServerApplication.class, args);
	}

}
