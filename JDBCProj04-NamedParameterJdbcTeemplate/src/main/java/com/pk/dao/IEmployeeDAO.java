package com.pk.dao;

import java.util.List;

import com.pk.Employee.Employee;

public interface IEmployeeDAO {
	public String getEmpNameByNo(int no);
	public List<Employee> getEmpDetailsByDesgs(String desg1,String desg2,String desg3);
	public int insertEmployee(Employee emp);
}
