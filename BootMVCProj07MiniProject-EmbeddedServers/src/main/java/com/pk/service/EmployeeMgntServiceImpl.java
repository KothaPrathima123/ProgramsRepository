package com.pk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.model.Employee;
import com.pk.repo.IEmployeeRepository;

	@Service("empService")
public class EmployeeMgntServiceImpl implements IEmployeeMgntService{
		@Autowired
		private IEmployeeRepository  empRepo;
		@Override
		public Iterable<Employee> getAllEmployees(){
			return empRepo.findAll();
		
	}
		@Override
		public String registerEmployee(Employee emp) {
			return "Employee is saved with id value:"+empRepo.save(emp).getEmpno();
		}
		@Override
		public Employee getEmployeeByNo(int eno) {
			Employee emp=empRepo.findById(eno).orElseThrow(()->new IllegalArgumentException());
			return emp;
		}
		@Override
		public String updateEmployee(Employee emp) {
			// TODO Auto-generated method stub
			return "Employee is updated with having id value:"+empRepo.save(emp).getEmpno();
		}
		@Override
		public String deleteEmployeeById(int eno) {
			empRepo.deleteById(eno);
			return eno+" employee id employee is deleted";
		}
	
}
