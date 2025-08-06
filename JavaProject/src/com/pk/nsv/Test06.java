package com.pk.nsv;

class Student {

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
public class Test06{
	public static void main(String[] args){
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();

		Student.institute	= "NiT";
		Student.a1			= new Address();
		Student.a1.stnum	= 1;
		Student.a1.city	 	= "HYD";

		s1.sno			= 101;
		s1.sname		= "HK";
		s1.a2			= new Address();
		s1.a2.stnum		= 2;
		s1.a2.city		= "Hyd";

		s2.a2 = new Address();
		s3.a2 = s2.a2;
		s2.a2.stnum = 3;
		s2.a2.city	= "CYB";

		System.out.println("s1 object details");
		s1.display();

		System.out.println("\ns2 object details");
		s2.display();

		System.out.println("\ns3 object details");
		s3.display();

		System.out.println();
	}
}
	
