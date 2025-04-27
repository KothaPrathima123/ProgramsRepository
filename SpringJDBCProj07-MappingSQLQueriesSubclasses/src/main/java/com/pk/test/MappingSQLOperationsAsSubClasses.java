package com.pk.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.pk.service.IEmployeeService;

public class MappingSQLOperationsAsSubClasses {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/pk/cfgs/applicationContext.xml");
		IEmployeeService service=ctx.getBean("empService",IEmployeeService.class);
		try {
			System.out.println("Employee name of 1002: "+service.fetchEmployeeByNo(1003));
			System.out.println("Employee name of 1003: "+service.fetchEmployeeByNo(1003));
			System.out.println("Employee name of 1007: "+service.fetchEmployeeByNo(1007));
			
			
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		ctx.close();
	}
	
}
