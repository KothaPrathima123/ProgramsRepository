package com.pk.service;

import com.pk.model.Employee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IEmployeeService {
	public Mono<Employee> saveeEmployee(Employee emp);
	public Flux<Employee> findAllEmployees();
	public Mono<Employee> getOneEmployee(Integer id);
	public Mono<Void> removeEmployee(Integer id);

}
