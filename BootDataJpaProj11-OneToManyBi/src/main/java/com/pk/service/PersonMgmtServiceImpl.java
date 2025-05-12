package com.pk.service;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.entity.Person;
import com.pk.entity.PhoneNumber;
import com.pk.repository.IPersonRepository;
import com.pk.repository.IPhoneNumberRepository;

@Service
public class PersonMgmtServiceImpl implements IPersonMgmtService {
	@Autowired
	private IPersonRepository personRepo;
	@Autowired
	private  IPhoneNumberRepository  phoneRepo;

	@Override
	public void saveDataUsingParent() {
		//prepare  parent obj
		Person per=new Person("raja","hyd");
		
		//prepare child objs
		PhoneNumber ph1=new PhoneNumber(9999999L,"residence","vi");
		PhoneNumber ph2=new PhoneNumber(88888888L,"office","jio");
		
		// add parent to childs
		ph1.setPerson(per);  ph2.setPerson(per);
		// add child to parent
		per.setPhones(Set.of(ph1,ph2));
		//save the parent obj
		 int idVal=personRepo.save(per).getPid();
		 
		 System.out.println("Peson is saved with the id value::"+idVal);
	}
	
	@Override
	public void saveDataUsingChild() {
		//prepare  parent obj
				Person per=new Person("suresh","vizag");
				
				//prepare child objs
				PhoneNumber ph1=new PhoneNumber(77777777L,"residence","vi");
				PhoneNumber ph2=new PhoneNumber(67777777L,"office","jio");
				
				// add parent to childs
				ph1.setPerson(per);  ph2.setPerson(per);
				// add child to parent
				per.setPhones(Set.of(ph1,ph2));

				//save the parent obj
				 int idVal1=phoneRepo.save(ph1).getRegId();
				 int idVal2=phoneRepo.save(ph2).getRegId();
				 System.out.println("Phones and associated parent is saved with id values :"+idVal1+"...."+idVal2);
	}
	
	@Override
	public void loadDataUsingParent() {
		//Load parents
		Iterable<Person>  parentsList=personRepo.findAll();
		parentsList.forEach(per->{
			System.out.println("Parent ::"+per);
			/*	//get childs of each parent
				Set<PhoneNumber>  childsSet=per.getPhones();
				childsSet.forEach(ch->{
					System.out.println("child::"+ch);
				});*/
		});
		
	}
	
	@Override
	public void loadDataUsingChild() {
	   //Load childs
		Iterable<PhoneNumber>  itChilds=phoneRepo.findAll();
		itChilds.forEach(ch->{
			System.out.println("Child ::"+ch);
				//get associlated parent
				Person  per=ch.getPerson();
				System.out.println("Parent ::"+per);
		});
	}
	
	@Override
	public String deleteByParent(int pid) {
		//Load  parnet
		Optional<Person>  opt=personRepo.findById(pid);
		if(opt.isPresent()) {
			// get object
			Person p=opt.get();
			personRepo.delete(p);
			return " Person  and  his phone numbers are deleted";
		}
		else 
		    return "Person  not found for deletion";	
	}
	
	@Override
	public String deleteAllChildsOfAParent(int pid) {
		//Load  parnet
		 Optional<Person>  opt=personRepo.findById(pid);
		 if(opt.isPresent()) {
				// get Parent object
				Person per=opt.get();
				//get Associated child objs
				Set<PhoneNumber> childs=per.getPhones();
				// nullify  parent obj from child objs
				childs.forEach(ch->{
					ch.setPerson(null);
				});
				//delete all childs 
				phoneRepo.deleteAllInBatch(childs);
				return " Only phone numbers of  a Parent are deleted";
			}
				
		return "Person not found";
	}

}
