package com.pk.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pk.entity.Actor;
@Component
public class ActorServiceConsuming_GettingJSONData_Runner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		RestTemplate template=new RestTemplate();
		String serviceUrl="http://localhost:4042/actor/find";
		ResponseEntity<String> resp=template.exchange(serviceUrl,HttpMethod.GET,null, String.class);
		System.out.println(resp.getBody()+" "+resp.getStatusCode()+" "+resp.getStatusCodeValue()+" "+resp.getHeaders());
		//converting JSON text response(body) to java class object/model class obj/entity clas obj using JACKSON api
		String jsonBody=resp.getBody();
		//create ObjectMapper
		ObjectMapper mapper=new ObjectMapper();
		Actor actor=mapper.readValue(jsonBody, Actor.class);
		System.out.println("response body as the actor object data: "+actor);
	}

}
