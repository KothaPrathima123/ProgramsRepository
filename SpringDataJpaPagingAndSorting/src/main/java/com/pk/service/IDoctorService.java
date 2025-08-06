package com.pk.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.pk.entiy.Doctor;


public interface IDoctorService {

	/*
	 * public String registerDoctor(Doctor doc); public String
	 * registerAllDoctors(List<Doctor> list); public long fetchDoctorCount(); public
	 * boolean checkDoctorAvailability(Integer id); public Iterable<Doctor>
	 * showAllDoctors(); public Iterable<Doctor>
	 * showAllDoctorsByIds(Iterable<Integer> ids); public Doctor
	 * showDoctorById(Integer id); //full obj modifn public String
	 * registerOrUpdateDoctor(Doctor d); //partial obj modn //public String
	 * updateCustAddrs(int cno,String newAddrs); public String
	 * deleteDoctorById(Integer id); public String deleteDoctor(Doctor d); public
	 * String removeAllDoctors(); public String removeDoctorsByIds(Iterable<Integer>
	 * ids); public String removeDoctorById(int id);
	 */
	//one method can have only one var arg param that to last param of the method
	public Iterable<Doctor> showDoctorsBySorting(boolean asc,String ...props);
	public Page<Doctor> showDoctorsInfoByPageNo(int pageNo,int pageSize,boolean ascOrder,String props);
	public void showDataThroughPagination(int pageSize);
	public String deleteDoctorsByIdsInBatch(List<Integer> ids);
	public List<Doctor> showDoctorsByExampleData(Doctor exDoctor,boolean ascorder,String ...props);


}
