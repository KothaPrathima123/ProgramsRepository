package com.pk.service;

import java.util.List;

import com.pk.entity.Doctor;

public interface IDoctorService {
	public List<Doctor> showDoctorByIncomeRange(double startRange,double endRange);
}
