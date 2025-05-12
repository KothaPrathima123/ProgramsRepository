package com.pk.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.pk.model.Employee;

import reactor.core.publisher.Mono;
//@Component
public class SaveDocumentTestRunner implements CommandLineRunner{
	
	@Override
	public void run(String... args) throws Exception {
		//create WebClient obj
		WebClient client=WebClient.create("http://localhost:5051");
		//mehod ,path,retrieve type
		Mono<Employee> mono=client.post()
				.uri("/employee/save")
				.body(Mono.just(new Employee(10,"A","QA",33.0)), Employee.class)
				.retrieve().bodyToMono(Employee.class);
		mono.subscribe(System.out::println);
	}

}
