package com.pk.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pk.beans.Bike;

public class ClientTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/pk/cfgs/applicationContext.xml");
		Bike b=ctx.getBean("basepulsor",Bike.class);
		Bike b1=ctx.getBean("pulsor1",Bike.class);
		Bike b2=ctx.getBean("pulsor2",Bike.class);
		System.out.println("Parent Bike: "+b+ " Bike1: "+b1+" Bike2: "+b2);
	}
	

}
