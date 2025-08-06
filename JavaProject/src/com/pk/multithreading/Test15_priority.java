package com.pk.multithreading;

class MyThread11 extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=20; i++) {
			System.out.println(getName() + " run: "+ i);
		}
	}
}
public class Test15_priority {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread11 mt1 = new MyThread11();
		MyThread11 mt2 = new MyThread11();
		
		System.out.println(mt1.getPriority());
		System.out.println(mt2.getPriority());
		System.out.println();
		
		mt1.setPriority(7);
		mt2.setPriority(9);
		//mt2.setPriority(-9);//RE: IllegalArgumentException
		
		System.out.println(mt1.getPriority());
		System.out.println(mt2.getPriority());
		
		mt1.start();
		mt2.start();
		
		System.out.println("main end");
		
	}
}