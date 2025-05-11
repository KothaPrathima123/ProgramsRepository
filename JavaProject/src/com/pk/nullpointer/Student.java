package com.pk.nullpointer;

public class Student {

	static String institute;
	static Address a1;				//for storing institute address

	int sno;
	String sname;
	Address a2;						//for storing Student address

	void m1(int sno){ 	
		int p = 10;
	}
	void m2(String sname){ 	
		String s = "NiT";
	}
	void m3(Address a3){ 	
		Address a4 = new Address();
	}

	void display(){
		System.out.println( "    institute\t: "	 + institute);
		System.out.print( "    a1\t\t: "	+ a1);
		System.out.println("("+ a1.stnum +", "+ a1.city+")");

		System.out.println( "    sno\t\t: "		+ sno);
		System.out.println( "    sname\t: "		+ sname);
		System.out.print( "    a2\t\t: "		+ a2) ;
		System.out.print("("+ a2.stnum +", "+ a2.city+")");
	}
}