package com.pk.oops;

abstract class Example {//Rule #2: 
    abstract void m1();    //Rule #1:
}

class Sample extends Example { //Rule #4
   void m1() { System.out.println("m1 from class Sample");}
}

class Test01 {
	public static void main(String[] args) {
		
		//Example e1 = new Example();   //Rule #3:

		Example e1 = new Sample();
		e1.m1();


	}
}