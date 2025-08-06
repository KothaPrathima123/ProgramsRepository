package com.pk.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.pk.model.Employee;
import com.pk.service.IEmployeeMgmtService;

public class SimpleInsertJdbcTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/pk/cfgs/applicationContext.xml");
		IEmployeeMgmtService service=ctx.getBean("empService",IEmployeeMgmtService.class);
		try {
			Employee emp=new Employee(4778,"smith","SALESMAN",567.9F);
			String msg=service.registerEmployee(emp);
			System.out.println(msg);
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		ctx.close();
	}

}
