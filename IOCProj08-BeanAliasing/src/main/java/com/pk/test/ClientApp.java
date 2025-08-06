package com.pk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.pk.beans.Engine;
import com.pk.beans.Vehicle;

public class ClientApp {
	
	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/pk/cfgs/applicationContext.xml"));
		Vehicle vehicle=factory.getBean("vehicle",Vehicle.class);
		System.out.println();
		vehicle.move();
		
	}

}
