package com.pk.oops;

public class College {
	public static void main(String[] args) {
		
		Person p1 =  new Person(); 
		System.out.println(p1);
		System.out.println();
	
		Student s1 = new Student();
		System.out.println(s1); 
		System.out.println();

		Faculty f1 = new Faculty();
		System.out.println(f1);
		System.out.println();
		
		System.out.println("=========================================");
		s1.setEyes(2);
		s1.setEars(2);
		s1.setHands(2);
		s1.setLegs(2);
		s1.setName("HK");
		s1.setHeight(6);
		s1.setWeight(100);
	
		s1.setInstitute("NiT");
		s1.setSno(101);
		s1.setCourse("Core Java");
		s1.setFee(2500);
		
		System.out.println(s1);  
		System.out.println();

		System.out.println("============================================");
			
		f1.setName("BK");
		f1.setDept("Acting");
		f1.setSubject("Dialouges");
		System.out.println(f1); 
		System.out.println();
	
		System.out.println("============================================");
		s1.eat();
		s1.sleep();
		s1.listen();
		s1.reply();
		s1.write();
		s1.read();
		System.out.println("\n============================================");

		f1.eat();
		f1.sleep();
		f1.teach();
		f1.prepareMaterial();
		System.out.println("============================================");

		Canteen hkCanteen = new Canteen();
		hkCanteen.eat(s1);		//message passing
		hkCanteen.eat(f1);

/**/		
	}

}
