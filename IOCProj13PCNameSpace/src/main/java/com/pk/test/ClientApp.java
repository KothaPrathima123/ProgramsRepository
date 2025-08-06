package com.pk.test;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pk.beans.Dept;
import com.pk.beans.Emp;

public class ClientApp {
	public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/pk/cfgs/applicationContext.xml");
	Emp employee=ctx.getBean("emp",Emp.class);
	System.out.println(employee);
	Date dt=ctx.getBean("dt",Date.class);
	System.out.println(dt);
	Dept dept=ctx.getBean("dept",Dept.class);
	System.out.println(dept);
	
	}

}
