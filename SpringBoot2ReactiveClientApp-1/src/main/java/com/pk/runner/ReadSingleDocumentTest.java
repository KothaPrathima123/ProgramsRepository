package com.pk.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.pk.model.Employee;

import reactor.core.publisher.Mono;
//@Component
public class ReadSingleDocumentTest implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		WebClient client=WebClient.create("http://localhost:5051");
		Mono<Employee> mono=client.get()
		.uri("/employee/one/2")
		.retrieve()
		.bodyToMono(Employee.class);
		mono.subscribe(System.out::println);
	}

}
