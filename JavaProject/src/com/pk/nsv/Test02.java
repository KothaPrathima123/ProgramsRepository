package com.pk.nsv;
class Example_01{
	int x;
	int y;
}

class Sample{
	static Example_01 e1;							
	Example_01 e2;									

	static void m1(Example_01 e3){			
		Example_01 e4;								
	}
}

//Q7) What is the life time and scope of all above referenced variables?
	/*
	 *	Like primitive variable 
	 *		- static referenced variable 	gets memory, 
	 *				when it's enclosing class is loaded, means Sample in above program
     *
	 *		- non-static referenced variable 	gets memory,
	 *				when it's enclosing class object is created, means Sample class object in above program
	 *
	 *		- parameter referenced variable 	gets memory,
	 *				when it's enclosing method is called, means m1() is  above program object
	 *
	 *		- local referenced variable 	gest memory,
	 *				when it's enclosing method is called and its declaration statement is executed, 
	 *				means m1() is  above program object
	 */

//Below program shows allocating memory for above referenced variables
public class  Test02{
	
	public static void main(String[] args) {

			System.out.println(Sample.e1);//null
			Sample.m1(null);
			Sample s1 = new Sample();
		
	}
}