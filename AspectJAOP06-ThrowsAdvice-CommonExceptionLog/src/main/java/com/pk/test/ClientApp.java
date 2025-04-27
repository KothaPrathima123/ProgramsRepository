package com.pk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pk.service.DivMath;

public class ClientApp {
	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/pk/cfgs/applicationContext.xml");
		DivMath proxy=ctx.getBean("math",DivMath.class);
		System.out.println(proxy);
		try {
			System.out.println("Result: "+proxy.div(10, 10));
			System.out.println("--------------------------");
			System.out.println("Result: "+proxy.div(10, 0));
		}
		catch(Exception e) {
			System.out.println("Internal Problem");
		}
		
		
 	}
}
