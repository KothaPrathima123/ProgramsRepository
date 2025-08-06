package com.pk.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.pk.model.Employee;
@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO{
	
	@Autowired
	private SimpleJdbcInsert sji;
	
	@Override
	public int insert(Employee emp) {
		sji.setTableName("employee");
		Map<String,Object> colMap=Map.of("EMPNO",emp.getEmpno(),
										"ENAME",emp.getEname(),
										"JOB",emp.getJob(),
										"SAL",emp.getSal());
		int count=sji.execute(colMap);
		return count;
	}

}
