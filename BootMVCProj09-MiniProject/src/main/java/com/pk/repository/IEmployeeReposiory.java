package com.pk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pk.entity.Employee;

public interface IEmployeeReposiory extends JpaRepository<Employee, Integer> {

}
