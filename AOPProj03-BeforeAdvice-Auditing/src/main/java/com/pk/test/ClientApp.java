package com.pk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pk.service.OrderApprover;

public class ClientApp {
	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/pk/cfgs/applicationContext.xml");
		OrderApprover proxy=ctx.getBean("pfb",OrderApprover.class);
		System.out.println("Order Approved? "+proxy.approveOrder(123));
		System.out.println("---------------------------");
		System.out.println("Order Approved? "+proxy.approveOrder(2345));
		System.out.println("-----------------------------");
		System.out.println("Order Approved? "+proxy.approveOrder(0));
		System.out.println("-------------------------------");
	}

}
