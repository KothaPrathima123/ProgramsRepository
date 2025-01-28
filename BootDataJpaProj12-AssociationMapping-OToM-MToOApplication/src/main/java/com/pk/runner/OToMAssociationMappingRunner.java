package com.pk.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pk.service.IPersonMgntService;

@Component
public class OToMAssociationMappingRunner implements CommandLineRunner{
	@Autowired
	private IPersonMgntService perService;
	@Override
	public void run(String... args) throws Exception {
			
		perService.saveDataUsingParent();
		perService.saveDataUsingChild();
		perService.loadDataUsingParent();
		//perService.loadDataUsingChild();
		//System.out.println(perService.deleteByParent(20));
		System.out.println(perService.deleteAllChildsOfAParent(21));
		/*
		 * perService.fetchParentToChildJoinsData().forEach(row->{
		 * System.out.println(Arrays.toString()); });
		 * perService.fetchChildToParentJoinsData().forEach(row->{
		 * System.out.println(Arrays.toString()); });
		 */
	}
}
