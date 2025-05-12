package com.pk.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class ActorAPIConsumer3Runner implements CommandLineRunner{
	@Autowired
	RestTemplate template;
	@Override
	public void run(String... args) throws Exception {
		String serviceUrl="http://localhost:4041/actor-api/report";
		//invoke the providers rest operation method (through provide operation gives obj/list of objs we get them in consumer app as json String
		ResponseEntity<String> response=template.getForEntity(serviceUrl, String.class);
		System.out.println(response.getBody()+" "+response.getStatusCode()+" "+response.getStatusCode().value());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

}
