package com.pk.multithreading;

class MyRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("run");
	}
}

public class Test04_implementingRunnable {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyRunnable mr = new MyRunnable();
		//mr.start();
		
		Thread th = new Thread(mr);
		th.start();
		
		System.out.println("main end");
}
}