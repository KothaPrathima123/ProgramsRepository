package com.pk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pk.entity.Person;

public interface IPersonRepository extends JpaRepository<Person, Integer> {

}
