package com.pk.sevice;

import java.util.List;

import com.pk.entity.Employee_Info;

public interface IEmployeeMgntService {
	public List<Employee_Info> showEmployeeBySalaryRange(double start,double end);
}
