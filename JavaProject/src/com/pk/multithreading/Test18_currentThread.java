package com.pk.multithreading;

public class Test18_currentThread {
	public static void main(String[] args) {
		Thread th = Thread.currentThread();
		
		System.out.println(th.threadId());
		System.out.println(th.getName());
		System.out.println(th.getPriority());
		System.out.println();
		
		th.setName("My Cute Main thread");
		th.setPriority(10);
		
		System.out.println(th.threadId());
		System.out.println(th.getName());
		System.out.println(th.getPriority());
		System.out.println();
		
		Ex.m1();
		MyThread12 mt = new MyThread12();
		
		mt.run();
		System.out.println();
		
		mt.start();
	}
}
class Ex {
	static void m1() {
		System.out.println("\nFrom m1 start");
		Thread th = Thread.currentThread();
		
		System.out.println(th.threadId());
		System.out.println(th.getName());
		System.out.println(th.getPriority());
		
		System.out.println("From m1 end");
		System.out.println();
	}
}

class MyThread12 extends Thread {
	@Override
	public void run() {
		System.out.println("\nFrom run start");
		Thread th = Thread.currentThread();
		
		System.out.println(th.threadId());
		System.out.println(th.getName());
		System.out.println(th.getPriority());
		System.out.println();
		
		Ex.m1();
		System.out.println("\nFrom run end");
	}
}