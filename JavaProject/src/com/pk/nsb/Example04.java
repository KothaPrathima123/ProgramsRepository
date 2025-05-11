package com.pk.nsb;

public class Example04 {
	
	{													
		System.out.println("NSB");								
	}														
															
	Example04() {												
		System.out.println("NPC");								
	}																 	
																	
	Example04(int a) {
		System.out.println("IPC");								
	}															
	
	Example04(String s) {										
		System.out.println("SPC");									
	}
	public static void main(String[] args) {
		System.out.println("main");//main
		Example e1;	//not object
		e1 = new Example();	//it is object non-static members are executed here 	
		Example04 e2 = new Example04(5);//all static members are executed in order they are declared
		Example04 e3 = new Example04("PK");//NSB is called just before constructor
	}
}