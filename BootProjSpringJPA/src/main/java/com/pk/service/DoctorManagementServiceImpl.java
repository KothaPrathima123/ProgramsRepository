package com.pk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.entity.Doctor;
import com.pk.repository.IDoctorRepo;

@Service("doctorService")
public class DoctorManagementServiceImpl implements IDoctorService{
	@Autowired
	private IDoctorRepo doctorRepo;
	@Override
	public List<Doctor> showDoctorByIncomeRange(double startRange, double endRange) {
		return doctorRepo.searhDoctorsByIncomeRange(startRange,endRange);
	}
	
}
