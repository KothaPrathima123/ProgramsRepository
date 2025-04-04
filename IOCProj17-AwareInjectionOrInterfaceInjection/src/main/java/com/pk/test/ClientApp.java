package com.pk.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pk.beans.Vehicle;

public class ClientApp {
	public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/pk/cfgs/applicationContext.xml");
	Vehicle v= ctx.getBean("vehicle",Vehicle.class);
	System.out.println(v);
	}
}
