package com.pk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pk.service.PinGenerator;

public class ClientApp {
	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/pk/cfgs/applicationContext.xml");
		PinGenerator proxy=ctx.getBean("pfb",PinGenerator.class);
		int pin=proxy.generatePin(56789);
		System.out.println("Generated Pin: "+pin);
	}
}
