package com.pk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.model.Employee;
import com.pk.repository.EmployeeRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class EmployeeMgntServiceImpl implements IEmployeeService{

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public Mono<Employee> saveeEmployee(Employee emp) {
		System.out.println("EmployeeMgntServiceImpl.saveeEmployee()");
		return repo.save(emp);
	}

	@Override
	public Flux<Employee> findAllEmployees() {
	System.out.println("EmployeeMgntServiceImpl.findAllEmployees()");
	return repo.findAll().switchIfEmpty(Flux.empty());
	}

	@Override
	public Mono<Employee> getOneEmployee(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).switchIfEmpty(Mono.empty());
	}

	@Override
	public Mono<Void> removeEmployee(Integer id) {
		// TODO Auto-generated method stub
		return repo.deleteById(id);
	}
	
}
