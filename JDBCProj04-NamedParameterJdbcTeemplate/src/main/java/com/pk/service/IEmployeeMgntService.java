package com.pk.service;

import java.util.List;

import com.pk.Employee.Employee;

public interface IEmployeeMgntService {
	public String fetchEmpNameById(int id);
	public List<Employee> fetchEmpsByDesgs(String desg1,String desg2,String desg3);
	public String registerEmployee(Employee emp);
}
