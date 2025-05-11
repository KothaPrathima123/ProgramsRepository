package com.pk.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.pk.model.ActorInfo;

@Component
public class ObjectMessageReceiver {
	
	@JmsListener(destination="obj_mq1")
	public void consumeObjectAsData(ActorInfo actor) {
		System.out.println("Received Obj data: "+actor);
	}
}
