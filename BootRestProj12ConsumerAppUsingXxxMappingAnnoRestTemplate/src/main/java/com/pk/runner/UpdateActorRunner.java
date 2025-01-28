package com.pk.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
//@Component
public class UpdateActorRunner implements CommandLineRunner {
	@Autowired
	RestTemplate template;
	@Override
	public void run(String... args) throws Exception {
		String serviceUrl="http://localhost:4041/actor-api/update";
		String json_body="{\"aid\":2002,\"aname\":\"Jr.ntr\",\"remuneration\":5432.0,\"active_SW\":\"active\"}";
		HttpHeaders headers=new org.springframework.http.HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity=new HttpEntity<String>(json_body,headers);
		template.put(serviceUrl, entity);
		System.out.println("actor updated");
		System.exit(0);
	}

}
