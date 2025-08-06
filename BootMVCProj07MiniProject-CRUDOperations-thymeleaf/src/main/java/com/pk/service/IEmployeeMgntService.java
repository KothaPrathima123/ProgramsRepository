package com.pk.service;

import com.pk.model.Employee;

public interface IEmployeeMgntService {
	public Iterable<Employee> getAllEmployees();
	public String registerEmployee(Employee emp);
	public Employee getEmployeeByNo(int eno);
	public String updateEmployee(Employee emp);
	public String deleteEmployeeById(int eno);
}
