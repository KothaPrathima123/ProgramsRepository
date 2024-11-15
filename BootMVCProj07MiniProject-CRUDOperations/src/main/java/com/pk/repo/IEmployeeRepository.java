package com.pk.repo;

import org.springframework.data.repository.CrudRepository;

import com.pk.model.Employee;

public interface IEmployeeRepository extends CrudRepository<Employee,Integer>{

}
