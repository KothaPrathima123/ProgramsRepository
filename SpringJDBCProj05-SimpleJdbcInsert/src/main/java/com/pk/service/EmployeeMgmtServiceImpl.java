package com.pk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.dao.IEmployeeDAO;
import com.pk.model.Employee;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	@Autowired
	private IEmployeeDAO empDAO;
	@Override
	public String registerEmployee(Employee emp) {
		int count=empDAO.insert(emp);
		return count==0?"Employee not registered":"Employee registered";
	}

}
