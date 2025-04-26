package com.pk.oops;

class Test04{
	public static void main(String[] args){
		Example_03 e1 = new Sample03();//Ex class SV
		//Ex class SB
		//Ex class NSV
		//Ex class NSB
		//Ex class NPC
		//m1 is executed from Sample
		//Ex class SM
		//Ex class NSM
		e1.m1();
		e1.m3();//50 Ex class SM The static method m3() from the type Example_03 should be accessed in a static way
		e1.m5();//
	}
}