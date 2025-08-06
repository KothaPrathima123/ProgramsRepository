package com.pk.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Vehicle {
	private String enggId;
	public Vehicle() {
		System.out.println("Vehicle:0-param");
	}
	public void setEnggId(String enggId) {
		this.enggId=enggId;
	}
	public void move() {
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/pk/cfgs/applicationContext.xml"));
		Engine engine=factory.getBean("engg1",Engine.class);
		engine.start();
		System.out.println("Vehicle moved for journey");
	}

}
