package com.pk.service;

import java.util.List;
import java.util.Map;

import com.pk.model.Employee;

public interface IEmpMgmtService {
	public Employee fetchEmployeeById(int eno);
	
	public List<Employee> fetchEmployeesByDesgs(String desg1, String desg2, String desg3);
}