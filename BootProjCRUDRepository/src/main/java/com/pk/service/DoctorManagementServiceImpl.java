package com.pk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.entity.Doctor;
import com.pk.repository.IDoctorRepo;

@Service("doctorService")
public class DoctorManagementServiceImpl implements IDoctorService{
	@Autowired
	private IDoctorRepo doctorRepo;
	@Override
	public String registerDoctor(Doctor doctor) {
		System.out.println("doc id (before save::"+doctor.getDocId());
		Doctor doc=doctorRepo.save(doctor);
		return "Doctor obj is saved with id value :"+doc.getDocId();
	
	}
	
}
