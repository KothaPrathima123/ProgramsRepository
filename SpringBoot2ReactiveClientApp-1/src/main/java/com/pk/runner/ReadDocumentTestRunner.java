package com.pk.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.pk.model.Employee;

import reactor.core.publisher.Flux;
//@Component
public class ReadDocumentTestRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		WebClient client=WebClient.create("http://localhost:5051");
		Flux<Employee> flux=client.get().
				uri("/employee/all")
				.retrieve()
				.bodyToFlux(Employee.class);
		flux.doOnNext(System.out::println).blockLast();
	}
	

}
