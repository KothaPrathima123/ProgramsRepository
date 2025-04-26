package com.pk.basics;

class Test06 { //Executable class
	public static void main(String[] args) {

		Example e1 = new Example();

		System.out.println(e1); //classname@hashcode

		System.out.println(e1.i1); //5
		System.out.println(e1.d1); //6.7
		System.out.println(e1.ch); //a
		System.out.println(e1.la); //[J@hashcode
		System.out.println(e1.la[0]); //8
		System.out.println(e1.la[1]); //9
		System.out.println(e1.s1); //Hari
	}
}