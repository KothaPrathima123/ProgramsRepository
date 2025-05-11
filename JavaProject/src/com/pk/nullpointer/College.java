package com.pk.nullpointer;



public class  College {
	public static void main(String[] args){

		Student01 s1 = new Student01();
		s1.setSno(101);
		s1.setSname("a");
                    
		s1.display();
		Address1 addr = new Address1();
		addr.setStrnum(1);
		addr.setCity("Hyd");

		s1.setAddress(addr);

		s1.display();
		
	}
}