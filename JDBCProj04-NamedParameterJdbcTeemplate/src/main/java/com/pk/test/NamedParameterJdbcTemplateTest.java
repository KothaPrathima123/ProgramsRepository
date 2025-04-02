package com.pk.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.pk.Employee.Employee;
import com.pk.service.IEmployeeMgntService;

public class NamedParameterJdbcTemplateTest {

	public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/pk/cfgs/applicationContext.xml");
	IEmployeeMgntService service=ctx.getBean("empService",IEmployeeMgntService.class);
	try {
		System.out.println("emp name: "+service.fetchEmpNameById(102));
	
	}
	catch(DataAccessException dae) {
		dae.printStackTrace();
	}
	System.out.println("===========================");
	try {
		System.out.println("emp details whose desgs are clerk, manager,president");
		List<Employee> listEmps=service.fetchEmpsByDesgs("CLERK", "MANAGER", "PRESIDET");
		listEmps.forEach(emp->{
			System.out.println(emp);
		});
	}
	catch(DataAccessException dae) {
		dae.printStackTrace();
	}
	System.out.println("===========================");
	try {
		Employee emp=new Employee(1007,"ramu","SALESMAN",990.7f);
		String msg=service.registerEmployee(emp);
		System.out.println(msg);
	}
	catch(DataAccessException dae) {
		dae.printStackTrace();
	}
	ctx.close();
	}

}
