package com.pk.nsv;

class Example_04{
	int x;
	int y;
}

class Sample_04{
	static Example_04 e1 = new Example_04();							
	Example_04 e2 = new Example_04();									

	void m1(Example_04 e3){			
		Example_04 e4 = new Example_04();
		
		System.out.println(e3.x  + "  " + e3.y);//0 0
		System.out.println(e4.x  + "  " + e4.y);//0 0
		System.out.println();
		e3.x = 15; e3.y = 16;
		System.out.println(e3.x  + "  " + e3.y);//15 16
		System.out.println(e4.x  + "  " + e4.y);//0 0
		System.out.println();
		e4.x = 17; e4.y = 18;
		System.out.println(e3.x  + "  " + e3.y);//15 16
		System.out.println(e4.x  + "  " + e4.y);//17 18
	}
}

class  Test04{
	public static void main(String[] args) {
		Sample_04 s1 = new Sample_04();
		s1.m1(new Example_04());

		System.out.println();
		System.out.println(Sample_04.e1.x + "  "+ Sample_04.e1.y);//0 0
		System.out.println(s1.e2.x + "  "+ s1.e2.y);//0 0
		Sample_04.e1.x = 25;
		Sample_04.e1.y = 26;
		System.out.println();
		System.out.println(Sample_04.e1.x + "  "+ Sample_04.e1.y);//25 26
		System.out.println(s1.e2.x + "  "+ s1.e2.y);//0 0
		s1.e2.x = 27;
		s1.e2.y = 28;
		System.out.println();
		System.out.println(Sample_04.e1.x + "  "+ Sample_04.e1.y);//25 26
		System.out.println(s1.e2.x + "  "+ s1.e2.y);//27 28

	}
}

