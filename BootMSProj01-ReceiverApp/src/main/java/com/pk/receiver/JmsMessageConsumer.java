package com.pk.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsMessageConsumer {
	@JmsListener(destination = "testmq1")
	public int readMessage(String txt) {
		System.out.println("Received Message: "+txt);
		return 5;
	} 
	
	
}
