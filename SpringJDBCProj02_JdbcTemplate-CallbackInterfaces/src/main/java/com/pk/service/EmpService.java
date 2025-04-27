package com.pk.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.dao.EmpDAO;
import com.pk.dao.IEmpDAO;
import com.pk.model.Employee;

@Service("service")
public class EmpService implements IEmpMgmtService {
	@Autowired
	private IEmpDAO dao;
	
	@Override
	public Employee fetchEmployeeById(int eno) {
		Employee emp=dao.getEmpDetailsById(eno);
		return emp;
	}

	@Override
	public List<Employee> fetchEmployeesByDesgs(String desg1,String desg2,String desg3) {
		return dao.getEmpDetails(desg1, desg2, desg3);
				
	}
	
}
