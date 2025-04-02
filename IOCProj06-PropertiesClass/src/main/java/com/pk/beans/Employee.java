package com.pk.beans;

import java.util.Date;
import java.util.Properties;

public class Employee {
	private String name;
	private Date doj;
	
	private Properties empDesgs;
	public void setEmpDesgs(Properties empDesgs) {
		this.empDesgs=empDesgs;
		
	}
	public Employee(String name, Date dob) {
		this.name = name;
		this.doj = dob;
	}
	@Override
	public String toString() {
		return "EmployeeProfile [empDesgs=" + empDesgs + "name" +"  "+name+" "+"doj"+" "+doj+"]";
	}

}
