package com.pk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class BootKafkaProj01ProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootKafkaProj01ProducerApplication.class, args);
	}

}
