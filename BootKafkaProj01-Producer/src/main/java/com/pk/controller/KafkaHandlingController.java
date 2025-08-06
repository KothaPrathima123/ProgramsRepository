package com.pk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pk.consumer.MessageStore;
import com.pk.producer.MessageProducer;

@RestController
public class KafkaHandlingController {
	@Autowired
	private MessageProducer producer;
	@Autowired
	private MessageStore store;
	
	@GetMapping("/send")
	public String sendMessage(@RequestParam("message") String message) {
		String status=producer.sendMessage(message);
		return "<h1>"+status+"<h1>";
	}
	
	@GetMapping("/readAll")
	public String fetchAllMessages() {
		return "<h1>"+store.getAllMessages()+"<h1>";
		
	}
	
	
	
	
}
