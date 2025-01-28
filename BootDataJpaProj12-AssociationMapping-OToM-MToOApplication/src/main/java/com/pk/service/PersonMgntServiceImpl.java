package com.pk.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.entity.Person;
import com.pk.entity.PhoneNumber;
import com.pk.repository.IPersonRepository;
import com.pk.repository.IPhoneNumberRepository;

@Service("OToMService")
public class PersonMgntServiceImpl implements IPersonMgntService{
	@Autowired
	private IPersonRepository personRepo;
	@Autowired
	private IPhoneNumberRepository phoneRepo;
	@Override
	public void saveDataUsingParent() {
		//create parent obj
		Person per=new Person("raja","hyd");
		//create child objs
		PhoneNumber ph1=new PhoneNumber(99999L,"airtel","personal");
		PhoneNumber ph2=new PhoneNumber(88888L,"vi","office");
		//add parent to child
		ph1.setPersonInfo(per);
		ph2.setPersonInfo(per);
		//add childs to parent
		per.setPhones(Set.of(ph1,ph2));
	//save the parent obj
		int idVal=personRepo.save(per).getPid();
		System.out.println("person is saved with id val: "+idVal);		
	}
	@Override
	public void saveDataUsingChild() {
		//create Parent obj
		Person per=new Person("suresh","vizag");
		//create child objs
		PhoneNumber ph1=new PhoneNumber(88888L,"residence","vi");
		PhoneNumber ph2=new PhoneNumber(77777L,"office","jio");
		//add parent to child
		ph1.setPersonInfo(per);
		ph2.setPersonInfo(per);
		//add childs to parent
		per.setPhones(Set.of(ph1,ph2));
		int idVal1=phoneRepo.save(ph1).getRegNo();
		int idVal2=phoneRepo.save(ph2).getRegNo();
		System.out.println("phones and his associated parent is saved with id values "+idVal1+"  "+idVal2);
	}
	@Override
	public void loadDataUsingParent() {
		Iterable<Person> it=personRepo.findAll();
		System.out.println(it);
		it.forEach(per->{
			System.out.println("parent::"+per);
			//get childs of each parent 
			/*
			 * Set<PhoneNumber> childs=per.getContactDetails();
			 * System.out.println("childs count::"+childs.size()); childs.forEach(ph->{
			 * System.out.println("child::"+ph.getMobileNo()); });
			 */
	});
}
	@Override
	public void loadDataUsingChild() {
		//Load childs
		/*Iterable<PhoneNumber> itChilds=phoneRepo.findAll();
		itChilds=phoneRepo.findAll();
		itChilds.forEach(ch->{
			System.out.println("child: "+ch);
		
		//get associated parent
		Person per=ch.getPersonInfo();
		System.out.println("person: "+per);
	});*/
	}
	@Override
	public String deleteByParent(int pid) {
		Optional<Person> opt=personRepo.findById(pid);
		if(opt.isPresent()) {
			Person p=opt.get();
			personRepo.delete(p);
	return "Person and his phone numebrs are deleted";
		
		} else 
	return "Person not found for deletion";
	}
	@Override
	public String deleteAllChildsOfAParent(int pid) {
		//load parent 
		Optional<Person> opt=personRepo.findById(pid);
		if(opt.isPresent()) {
			//get parent object
			Person per=opt.get();
			//get associated childs
			Set<PhoneNumber> childs=per.getPhones();//nullify parent obj from child objs
			childs.forEach(ch->{ch.setPersonInfo(null);
			});//delets all childs
					
		phoneRepo.deleteAllInBatch(childs);
		return "Only phone nubers of a parent are deleted ";
	}
	return "Person not found";
}
}