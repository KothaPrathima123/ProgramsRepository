package com.pk.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;

import com.pk.entiy.Doctor;
import com.pk.service.DoctorMgmtServiceImpl;

public class PandSRepoTestRunner implements CommandLineRunner{
	private DoctorMgmtServiceImpl service;
	@Override
	public void run(String... args) throws Exception {
		service.showDoctorsBySorting(true,"docName").forEach(System.out::println);
		System.out.println("----------------");
		service.showDoctorsBySorting(false, "income","docName").forEach(System.out::println);
	System.out.println("-----findAll(Pageable pageable)---------");
		try {
			//service.showDoctorsInfoByPageNo(1,3,true,"docName").forEach(System.out::println);
			Page<Doctor> page=service.showDoctorsInfoByPageNo(2,3,false,"docName");
			System.out.println("page number: "+page.getNumber());
			System.out.println("pages count: "+page.getTotalPages());
			System.out.println("is it first page: "+page.isFirst());
			System.out.println("is it last page: "+page.isLast());
			System.out.println("page size: "+page.getSize());
			System.out.println("page Elements count: "+page.getNumberOfElements());
			if(page.isEmpty()) {
				List<Doctor> list=page.getContent();
				list.forEach(System.out::println);
			} else {
				System.out.println("no page found");
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		
		service.showDataThroughPagination(3);		
		System.out.println(service.deleteDoctorsByIdsInBatch(List.of(678,901)));
		//System.out.println(service.deleteDoctorsByIdsInBatch(List.of(678,null)));throws EXception becoz List.of() does not allow null elements
		System.out.println(service.deleteDoctorsByIdsInBatch(Arrays.asList(16,null)));///does not throw any exception these methods are given from java 9 to create immutable  collection of objs with given data hey cannot have values as null's 

		Doctor doctor=new Doctor();
		doctor.setSpecialization("cardio");
		doctor.setIncome(90000.0);
		service.showDoctorsByExampleData(doctor,true,"income").forEach(System.out::println);
	}
}
