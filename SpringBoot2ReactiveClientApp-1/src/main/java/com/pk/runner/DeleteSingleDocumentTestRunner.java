package com.pk.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;
@Component
public class DeleteSingleDocumentTestRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		WebClient client=WebClient.create("http://localhost:5051");
		Mono<Void> mono=client.delete().uri("/employee/remove/10")
				.retrieve().bodyToMono(Void.class);
		mono.subscribe(System.out::println);
		System.out.println("Deleted");
	}

}
