package com.pk.service;

import java.util.Optional;

public class IServiceImpl {
	@Override
	public Employee fetchEmployeeByEno(int eno) {
		Optional<Employee> opt=empRepo.findById(eno);
		if(opt.isPresent())
			return opt.get();
		else
			throw new EmployeeNotFoundException("Problem in getting employee")
	}
}
