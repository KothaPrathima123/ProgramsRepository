package com.pk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pk.service.ShoppingStore;

public class ClientApp {
	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/pk/cfgs/applicationContext.xml");
		ShoppingStore proxy=ctx.getBean("pfb",ShoppingStore.class);
		float billAmt=proxy.calBillAmt("table", 120, 20);
		System.out.println("Bill Amount: "+billAmt);
		
	}
	
}
