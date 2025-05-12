package com.pk.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pk.bindings.ActorData;

//@Component
public class ShowAllActorsRunner implements CommandLineRunner{
	@Autowired
	private RestTemplate temp;

	@Override
	public void run(String... args) throws Exception {
		String serviceUrl="http://localhost:4041/actor-api/all";
		ResponseEntity<String> resp=temp.exchange(serviceUrl, HttpMethod.GET,null,String.class);
		System.out.println(resp.getBody()+" "+resp.getStatusCodeValue()+" "+resp.getHeaders());
	ObjectMapper mapper=new ObjectMapper();
	List<ActorData> list=mapper.readValue(resp.getBody(), new TypeReference<List<ActorData>>() {  });
	System.out.println("JSON array to List<ActorData> obj");
	list.forEach(System.out::println);
	}
}
