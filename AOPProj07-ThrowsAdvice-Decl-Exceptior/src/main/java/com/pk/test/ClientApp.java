package com.pk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pk.service.PriceCalculator;

public class ClientApp {
	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/pk/cfgs/applicationContext.xml");
		PriceCalculator proxy=ctx.getBean("pfb",PriceCalculator.class);
		try {
			float price=proxy.calcPrice(0, 0);
			System.out.println("Price: "+price);
		}
		catch(Exception e) {
			System.out.println("Internal Problem: "+e.getClass()+" "+e.getMessage());
		}
	}
}
