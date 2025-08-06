package com.pk.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.entity.Employee;
import com.pk.repository.IEmployeeReposiory;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private  IEmployeeReposiory  empRepo;

	@Override
	public Iterable<Employee> showAllEmloyees() {
		return empRepo.findAll();
	}
	
	@Override
	public String registerEmployee(Employee emp) {
		//use  repo
		int idVal=empRepo.save(emp).getEno();
		return "Employee is saved with id value ::: ::"+idVal;
	}
	
	@Override
	public Employee fetchEmployeeByNo(int no) {
		return empRepo.findById(no).orElseThrow(()-> new IllegalArgumentException("Invalid employee no"));
	}
	
	@Override
	public String updateEmployee(Employee emp) {
		//load object
		Optional<Employee> opt=empRepo.findById(emp.getEno());
		if(opt.isPresent()) {
			//update the object
			empRepo.save(emp);
			return emp.getEno()+" employee detaisl are updated";
		}
		return emp.getEno()+"  Employee is not found";
	}
	
	@Override
	public String deleteEmployeeById(int eno) {
		//Load object
		boolean  flag=empRepo.existsById(eno);
		if(flag) {
			  empRepo.deleteById(eno);
			  return eno+"    Employee is  found  and deleted";
		}
		return eno+" Employee is not found and deleted ";
	}

}
