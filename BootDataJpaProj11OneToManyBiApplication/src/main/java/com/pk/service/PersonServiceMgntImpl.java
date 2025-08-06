package com.pk.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.entity.Person;
import com.pk.entity.PhoneNumber;
import com.pk.repository.IPersonRepository;
import com.pk.repository.IPhoneNumberRepository;

@Service("personService")
public class PersonServiceMgntImpl implements IPersonMgntService{
	@Autowired
	private IPersonRepository personRepo;
	@Autowired
	private IPhoneNumberRepository phoneRepo;
	@Override
	public List<Object[]> fetchDataByJoinsUsingParent() {
		
		return personRepo.fetchDataByJoinsUsingParent();
	}
	@Override
	public List<Object[]> fetchChildToParentJoinsData() {
		// TODO Auto-generated method stub
		return phoneRepo.showJoinsDataChildToParent();
	}
	
	
}
