package com.pk.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.entity.Employee_Info;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;
@Service("empService")
public class IEmployeeMgntServiceImpl implements IEmployeeMgntService{
	
	@Autowired
	private EntityManager manager;
	
	@Override
	public List<Employee_Info> showEmployeeBySalaryRange(double start, double end) {
	StoredProcedureQuery query=manager.createStoredProcedureQuery("GET_DOCTORS_BY_INCOMERANGE",Employee_Info.class);
	query.registerStoredProcedureParameter(1, Double.class, ParameterMode.IN);
	query.registerStoredProcedureParameter(2, Double.class, ParameterMode.IN);	
	//set parameter values
	query.setParameter(1, start);
	query.setParameter(2, end);
	//call PL/SQl procedures
	List<Employee_Info> list=query.getResultList();
	return list;
	}
	
	
}
