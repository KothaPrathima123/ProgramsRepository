package com.pk.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pk.service.IPersonMgntService;

@Component
public class OToMAssociationMappingRunner implements CommandLineRunner{
	@Autowired
	private IPersonMgntService personService;
	@Override
	public void run(String... args) {
	
		personService.fetchDataByJoinsUsingParent().forEach(row->{
			for(Object val:row) {
				System.out.println(val+" ");
			}
			System.out.println();
		});
		personService.fetchChildToParentJoinsData().forEach(row->{
			System.out.println(Arrays.toString(row));
		});
}
}