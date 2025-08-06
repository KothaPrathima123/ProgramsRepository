package com.pk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.dao.IEmployeeDAO;
@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDAO dao;
	@Override
	public String fetchEmployeeByNo(int no) {
		// TODO Auto-generated method stub
		return dao.getEmpNameByNo(no);
	}

}
