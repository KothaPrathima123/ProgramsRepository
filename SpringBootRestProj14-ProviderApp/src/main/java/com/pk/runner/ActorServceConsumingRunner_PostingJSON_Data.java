package com.pk.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ActorServceConsumingRunner_PostingJSON_Data implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		RestTemplate temp=new RestTemplate();
		String serviceUrl="http://localhost:4042/actor/register";
		//prepare JSON data(request data) 
		String json_body="{\"id\":1002,\"name\":\"ranveer\",\"addrs\":\"hyd\",\"remuneration\":}";
	HttpHeaders headers=new HttpHeaders();
	headers.setContentType(MediaType.APPLICATION_JSON);
	//prepare http req as HttpEntity obj having head ,body
	HttpEntity<String> entity=new HttpEntity<String>(json_body,headers);
	ResponseEntity<String> resp=temp.exchange(serviceUrl, HttpMethod.POST,entity,String.class);
	System.out.println(resp.getBody()+" "+resp.getHeaders()+" "+resp.getStatusCode());
	System.out.println("-------------------");
	}

}
