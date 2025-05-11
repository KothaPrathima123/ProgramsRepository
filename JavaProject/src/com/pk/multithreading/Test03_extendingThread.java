package com.pk.multithreading;

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("run");
	}
}

public class Test03_extendingThread {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread mt1 = new MyThread();
		mt1.start();
		
		System.out.println("main end");
	}
}