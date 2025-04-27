package com.pk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.Employee.Employee;
import com.pk.dao.IEmployeeDAO;

@Service("empService")
public class EmployeeMgntServiceImpl implements IEmployeeMgntService {
	
	@Autowired
	private IEmployeeDAO dao;
	@Override
	public String fetchEmpNameById(int id) {
		// TODO Auto-generated method stub
		return dao.getEmpNameByNo(id);
	}
	@Override
	public List<Employee> fetchEmpsByDesgs(String desg1, String desg2, String desg3) {
		
		return dao.getEmpDetailsByDesgs(desg1, desg2, desg3)
				;
	}
	@Override
	public String registerEmployee(Employee emp) {
		int count=dao.insertEmployee(emp);
		return count==0?"employee not registered":"employee is registered";
	}

}
