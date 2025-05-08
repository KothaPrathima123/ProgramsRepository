package com.pk.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pk.beans.Student;

public class ClientApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/pk/cfgs/applicationContext.xml");
		Student stud=ctx.getBean("st",Student.class);
		System.out.println(stud);
		
		
		
	}
	
	
}
