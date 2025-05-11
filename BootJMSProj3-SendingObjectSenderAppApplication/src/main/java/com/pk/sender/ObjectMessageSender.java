package com.pk.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.pk.model.ActorInfo;

@Component
public class ObjectMessageSender {
	@Autowired
	private JmsTemplate template;
	@Scheduled(cron="0/15 * * * * *")
	public void sendObjectDataAsMessage() {
		ActorInfo actor=new ActorInfo(101,"ranveer","mumbai");
		template.convertAndSend("obj_mq1", actor);
		System.out.println("Object is send Message");
		
	}
	
	
}
