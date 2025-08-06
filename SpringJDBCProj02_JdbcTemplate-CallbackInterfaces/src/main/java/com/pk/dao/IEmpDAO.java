package com.pk.dao;

import java.util.List;
import java.util.Map;

import com.pk.model.Employee;

public interface IEmpDAO {
	public Employee getEmpDetailsById(int eno);
	public List<Employee> getEmpDetails(String desg1,String desg2,String desg3);
	
}
