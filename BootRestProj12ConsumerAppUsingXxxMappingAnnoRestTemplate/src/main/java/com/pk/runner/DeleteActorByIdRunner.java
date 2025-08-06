package com.pk.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class DeleteActorByIdRunner implements CommandLineRunner{
	@Autowired
	private RestTemplate template;
	@Override
	public void run(String... args) throws Exception {
		String serviceUrl="http://localhost:4041/actor-api/delete/{id}";
		template.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
		template.delete(serviceUrl, 102);
		System.out.println("actor deleted");
	}

}
