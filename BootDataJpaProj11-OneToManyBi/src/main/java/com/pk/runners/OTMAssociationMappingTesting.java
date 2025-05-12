package com.pk.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pk.service.IPersonMgmtService;

@Component
public class OTMAssociationMappingTesting  implements CommandLineRunner {
	@Autowired
	 private IPersonMgmtService  personService;
	@Override
	public void run(String... args) throws Exception {
		personService.saveDataUsingParent();
		 personService.saveDataUsingChild();
		
		  personService.loadDataUsingParent();
		   personService.loadDataUsingChild();
		
		   // System.out.println(personService.deleteByParent(1));
		//System.out.println(personService.deleteAllChildsOfAParent(2));
		
	}

}
