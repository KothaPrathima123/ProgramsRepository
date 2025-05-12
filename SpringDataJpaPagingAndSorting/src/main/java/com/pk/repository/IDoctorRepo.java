package com.pk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.pk.entiy.Doctor;

public interface IDoctorRepo extends PagingAndSortingRepository<Doctor,Integer>,CrudRepository<Doctor, Integer>,JpaRepository<Doctor, Integer>{

}
