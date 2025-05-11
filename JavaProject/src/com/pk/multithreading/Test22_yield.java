package com.pk.multithreading;

class MyThread14 extends Thread{
	
	@Override
	public void run() {
		System.out.println("run start");
	
		System.out.println("run end");
	}
}

public class Test22_yield {
	public static void main(String[] args) {
		System.out.println("main start");
		MyThread14 mt = new MyThread14();
		mt.start();
		
		//pause
		Thread.yield(); //requesting JVM to pause this currently running thread
						//JVM may ignore this request
		
		System.out.println("main end");
		
	}
}