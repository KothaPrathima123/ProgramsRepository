package com.pk.multithreading;

class MyThread7 extends Thread {
	@Override
	public void run() {
		System.out.println("mt7 start");
		MyThread8 mt2 = new MyThread8();
		mt2.start();
		System.out.println("mt7 end");
	}	
}

class MyThread8 extends Thread {
	@Override
	public void run() {
		System.out.println("mt8 start");
		
		System.out.println("mt8 end");
	}	
}

public class Test12_CT_from_CT {
	public static void main(String[] args) {
		System.out.println("main start");
		MyThread7 mt1 = new MyThread7();
		mt1.start();
		System.out.println("main end");
	}
}