package com.pk.multithreading;

class MyThread10 extends Thread {
	@Override
	public void run() {
		System.out.println("In run  #3: "+ getState());
		
		try{Thread.sleep(2000);}
		catch (InterruptedException e) {}
		
	}
}
public class Test14_state {
	public static void main(String[] args) throws InterruptedException {
		
		MyThread10 mt1 = new MyThread10();
		System.out.println("In main #1: " + mt1.getState());
		
		mt1.start();
		System.out.println("In main #2: " + mt1.getState());
		
		Thread.sleep(1000);
		System.out.println("In main #4: " + mt1.getState());

		Thread.sleep(2000);
		System.out.println("In main #5: " + mt1.getState());

		
		
		
	}
}