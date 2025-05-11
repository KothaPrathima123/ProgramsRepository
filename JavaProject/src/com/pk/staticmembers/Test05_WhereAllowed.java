package com.pk.staticmembers;

/*
7) Where can we create a static member?
Can we create it inside a method?
     - No we can not 
	 - A static member must be created inside a class 
	   outside all methods, blocks and constuctors
	 - if we create a static member inside a method
	   we will get CE: illegal start of expression

*/
class Test02 {
	static int a = 10;

	static void m1(){//static is class level and method can be static but we cannot use for parameters and local variables

		//static int b = 20;//ce: Illegal modifier for parameter b; only final is permitted
	
	}
}
