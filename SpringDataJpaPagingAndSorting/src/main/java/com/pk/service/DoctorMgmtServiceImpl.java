package com.pk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.pk.entiy.Doctor;
import com.pk.repository.IDoctorRepo;

@Service("doctorService")
public class DoctorMgmtServiceImpl implements IDoctorService{
	@Autowired
	private IDoctorRepo doctorRepo;
	
	@Override
	public Iterable<Doctor> showDoctorsBySorting(boolean asc,String ...props){
		//prepare sort object
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC,props);
		//use repo
		Iterable<Doctor> it=doctorRepo.findAll(sort);
		return it;
	}
	@Override
	public Page<Doctor> showDoctorsInfoByPageNo(int pageNo, int pageSize, boolean ascOrder, String props) {
		//prepare the sort object
		Sort sort=Sort.by(ascOrder?Direction.ASC:Direction.DESC,props);
		//prepare Pageeable object
		Pageable pageable=PageRequest.of(pageNo, pageSize);
		Page<Doctor> page=doctorRepo.findAll(pageable);
		return page;
	}
	@Override
	public void showDataThroughPagination(int pageSize) {
		long count=doctorRepo.count();
		long pagesCount=count/pageSize;
		//pagesCount=count%pageSize==0?pagesCount;++pagesCount;
		if(count%pagesCount!=0)
			pagesCount++;
		for(int i=0;i<pagesCount;i++) {
			Pageable pageasble=PageRequest.of(i, pageSize);
			//get each page records
			Page<Doctor> page=doctorRepo.findAll(pageasble);
			System.out.println("page: "+(page.getNumber()+1)+" records of"+page.getTotalPages());
			page.getContent().forEach(System.out::println);
			System.out.println("=================");
		}
	}
	@Override
	public String deleteDoctorsByIdsInBatch(List<Integer> ids) {
		List<Doctor> list=doctorRepo.findAllById(ids);
		doctorRepo.deleteAllByIdInBatch(ids);
		
		return list.size()+" recors are deleted ";
	}
	@Override
	public List<Doctor> showDoctorsByExampleData(Doctor exDoctor, boolean ascOrder, String... props) {
		Sort sort=Sort.by(ascOrder?Direction.ASC:Direction.DESC,props);
		Example example=Example.of(exDoctor);
		List<Doctor> list=doctorRepo.findAll(example,sort);
		return list;
	}
	
	
}	
