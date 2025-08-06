package com.pk.runner;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class SaveActorRunner implements CommandLineRunner{
	@Autowired
	RestTemplate template;
	@Override
	public void run(String... args) throws Exception {
		String serviceUrl="http://localhost:4041/actor-api/save";
		//prepare json body
		String json_body="{\"aname\":\"Jr.ntr\",\"addrs\":\"hyd\",\"remuneration\":5432.0,\"active_SW\":\"active\"}";
		//http headers
		HttpHeaders headers=new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		//prepare httpentity obj having headers,body
		HttpEntity<String> entity=new HttpEntity<String>(json_body,headers);
		//use postForEntity(-,-) method
		ResponseEntity<String> response=template.postForEntity(serviceUrl, entity, String.class);
		System.out.println(response.getBody()+"  "+response.getHeaders()+" "+response.getStatusCode().value());
	}

}
