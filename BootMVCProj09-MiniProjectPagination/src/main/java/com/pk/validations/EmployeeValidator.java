package com.pk.validations;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.pk.entity.Employee;
@Component
public class EmployeeValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(Employee.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Employee emp=(Employee)target;
		if(emp.getEname()==null||emp.getEname().length()==0||emp.getEname().equalsIgnoreCase(""))
			errors.rejectValue("ename", "empname.required");
		else if(emp.getEname().length()>10)
			errors.rejectValue("ename", "empname.maxlen");
		if(emp.getJob()==null||emp.getJob().length()==0||emp.getJob().equalsIgnoreCase(""))
			errors.rejectValue("job","ename.job");
		else if(emp.getSal()<1 ||  emp.getSal()>100000)
			errors.rejectValue("sal", "esal.range");
	}

}
