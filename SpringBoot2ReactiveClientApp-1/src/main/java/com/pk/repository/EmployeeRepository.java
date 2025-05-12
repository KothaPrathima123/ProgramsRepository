package com.pk.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.pk.model.Employee;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee,Integer>{

}
