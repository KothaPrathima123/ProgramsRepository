package com.pk.multithreading;

class MyThread3 extends Thread {
	@Override
	public void run() {
		System.out.println("run executed");
	}
}

public class Test07_runCall {
	public static void main(String[] args) {
		System.out.println("main start");
		MyThread3 mt = new MyThread3();
		mt.start(); //requesting JVM to executed run() concurrently
		mt.run(); //forcing JVM to execute run() method immediately sequentally
		System.out.println("main end");
	}
}