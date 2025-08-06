package com.pk;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.pk.controller.EmployeeOperationsController;
import com.pk.model.Employee;

@SpringBootApplication
public  class BootIocProj03MiniProjectLayeredAppApplication {

	public static void main(String[] args) {
		//get  Access to IOC container
		ApplicationContext ctx=SpringApplication.run(BootIocProj03MiniProjectLayeredAppApplication.class, args);
		// get  Controller class obj
		EmployeeOperationsController  controller=ctx.getBean("empController",EmployeeOperationsController.class);
	    //invoke the b.method
		try {
			List<Employee> list=controller.getEmployeesByDesgs("CLERK", "MANAGER", "SALESMAN");
			list.forEach(emp->{
				System.out.println(emp);
			});
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//close the container
		  ((ConfigurableApplicationContext) ctx).close();
	}

}
