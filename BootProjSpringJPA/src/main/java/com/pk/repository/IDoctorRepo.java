package com.pk.repository;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pk.entity.Doctor;

@Repository
public interface IDoctorRepo extends JpaRepository<Doctor ,Integer> {
@Query("From Doctor WHERE income<=?1 AND income>=?2")
public List<Doctor> searhDoctorsByIncomeRange(double start,double end);
/*@Query("From Doctor WHERE income<=:start and income>=?end")
public List<Doctor> searhDoctorsByIncomeRange(double start,double end);*/




}
