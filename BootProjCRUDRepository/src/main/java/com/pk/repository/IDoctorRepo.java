package com.pk.repository;
import org.springframework.data.repository.CrudRepository;

import com.pk.entity.Doctor;
public interface IDoctorRepo extends CrudRepository<Doctor ,Integer> {

}
