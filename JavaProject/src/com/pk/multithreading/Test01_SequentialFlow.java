package com.pk.multithreading;

import java.util.Scanner;

class Example2 {
	
	static void m1() {
		System.out.println("m1");
		new Scanner(System.in).next();//pause
	}
	
	static void m2() {
		System.out.println("m2");
	}

	static void m3() {
		System.out.println("m3");
	}
	
}

public class Test01_SequentialFlow {
	public static void main(String[] args) {
		System.out.println("main start");
		
		Example2.m1(); //main method execution is paused
						//m1() method execution is started
						//after m1() method excution is completed
						//main method execution is resumed
		
		Example2.m2();  //after m1() method execution is completed	
						//then m2() method execution is started
		
						//suppose if m1() method execution is paused 
						//for long or some reason, then m2() method also
						//in paused state only
		
		System.out.println("main end");
	}
}
