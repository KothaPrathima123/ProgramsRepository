package com.pk.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.pk.model.Employee;
import com.pk.service.EmpService;

public class CallbackInterfacesTest {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/pk/cfgs/applicationContext.xml");
		EmpService service=(EmpService) ctx.getBean("service");
		try {
		Employee emp=service.fetchEmployeeById(101);
		System.out.println(emp);
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
	}
		try {
			List<Employee> listEmps=service.fetchEmployeesByDesgs("CLERK", "MANAGER", "PRESIDENT");
			listEmps.forEach(emp->{
				System.out.println(emp);
			});
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		ctx.close();
}
}