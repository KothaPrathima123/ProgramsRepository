package com.pk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pk.model.Employee;
import com.pk.service.IEmployeeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/employee")
public class EmployeeOperationsController {
	@Autowired
	private IEmployeeService service;
	@PostMapping("/save")
	public Mono<Employee> saveOneEmployee(@RequestBody Employee employee){
		System.out.println("EmployeeOperationsController.saveOneEmployee()");
		return service.saveeEmployee(employee);
	}
	@GetMapping("/all")
	public Flux<Employee> getAllEmployees(){
		System.out.println("EmployeeOperationsController.getAllEmployees()");
		return service.findAllEmployees();
	}
	@GetMapping("/one/{id}")
	public Mono<Employee> getOneEmployee(@PathVariable("id") Integer id){
		Mono<Employee> employee=service.getOneEmployee(id);
		return employee;
	}
	@DeleteMapping("/remove/{id}")
	public Mono<Void> removeEmployee(@PathVariable("id") Integer id){
		return service.removeEmployee(id);
		//return Mono.just("Employee Deleted");
	}

}
