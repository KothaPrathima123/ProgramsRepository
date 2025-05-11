package com.pk.multithreading;

public class Test02_ConcurrentFlow {
	public static void main(String[] args) {
		System.out.println("main start");
		
		Thread th1 = new Thread();
		th1.start(); //thread is ready to execute
					//it will not be executed immediately
		
		System.out.println("main end");
	}
}
