package com.pk.staticmembers;
/*
4) To what programming elements the keyword static is allowed and not allowed?
      - The keyword static is allowed only to the members created inside the class
	    which can be executed with out an object 

	  - the keyword static is not allowed to constructor even though it is defined inside 
	    the class, becuase it must be executed for an object for doing initialization

	 - Below are the members to which static is allowed
	     1) fields
		 2) blocks
		 3) methods
		 4) class level inner classes

	- Below are the members to which static is not allowed
		1) module
		2) package 
		3) outer class
		4) abstract method
		5) constructor

		6) parameter
		7) local variable
		8) local block 
		9) local inner class

Below program shows the members to which static is allowed and not allowed


*/

//static interface I{}//ce:Illegal modifier for the interface I; only public & abstract are permitted
//static abstract class AC{ }ce:Illegal modifier for the class AC; only public, abstract & final are permitted we should create subclass 
//static class CC{ }	//ce: Illegal modifier for the class CC; only public, abstract & final are permitted							//outer classes
//static final class FC{ }
//static enum E{} ce: Illegal modifier for the class CC; only public, abstract & final are permitted
//static @interface A{ }//ce: Illegal modifier for the annotation type A; only public & abstract are permitted

abstract class Test03{
	//static Test03(){  }//ce: only public, protected & private are permitted //constructor so static is not allowed its a non static member

	//static abstract void m1();		//ce: can use one of public or protected	//abstract method

	//void m2(static int p) {	//ce: llegal modifier for parameter p; only final is permitted	//parameter
	/*void m2(static int p) {
		//static int q = 20;		//ce:only final is permitted	//local variable
//it is non static method
		//static{ }									//local block

		//static class A{ }//ce:Syntax error, insert "}" to complete ClassBody//local inner classs

	}*/
}
