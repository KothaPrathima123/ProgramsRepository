package com.pk.multithreading;

class MyThread5 extends Thread {
	@Override
	public void run() {
		System.out.println(getName() + " run exectued");
	}	
}
public class Test09_multipleCTs {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread5 mt1 = new MyThread5(); //name=Thread-0
		mt1.start();
		//mt1.start(); //RE: ITSE
		
		MyThread5 mt2 = new MyThread5(); //name=Thread-1
		mt2.start();
		
		System.out.println("main end");
		
	}
}