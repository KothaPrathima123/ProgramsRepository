package com.pk.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pk.beans.Employee;

public class ClientApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/pk/cfgs/applicationContext.xml");
		Employee employee=ctx.getBean("emp",Employee.class);
		System.out.println(employee);
	}
}
