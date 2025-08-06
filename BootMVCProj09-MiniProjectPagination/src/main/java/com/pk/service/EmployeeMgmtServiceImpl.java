package com.pk.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
		int idVal=empRepo.save(emp).getEmpno();
		return "Employee is saved with id value ::: ::"+idVal;
	}
	
	@Override
	public Employee fetchEmployeeByNo(int no) {
		return empRepo.findById(no).orElseThrow(()-> new IllegalArgumentException("Invalid employee no"));
	}
	
	@Override
	public String updateEmployee(Employee emp) {
		//load object
		Optional<Employee> opt=empRepo.findById(emp.getEmpno());
		if(opt.isPresent()) {
			//update the object
			empRepo.save(emp);
			return emp.getEmpno()+" employee detaisl are updated";
		}
		return emp.getEmpno()+"  Employee is not found";
	}
	
	@Override
	public String deleteEmployeeById(int empNo) {
		//Load object
		boolean  flag=empRepo.existsById(empNo);
		if(flag) {
			  empRepo.deleteById(empNo);
			  return empNo+"    Employee is  found  and deleted";
		}
		return empNo+" Employee is not found and deleted ";
	}

	@Override
	public Page<Employee> getEmployeePageData(Pageable pageable) {
		Page<Employee> page=empRepo.findAll(pageable);
		return page;
	}

}
