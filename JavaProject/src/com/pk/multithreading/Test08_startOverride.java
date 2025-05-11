package com.pk.multithreading;

class MyThread4 extends Thread {
	@Override
	public void run() {
		System.out.println("run executed");
	}
	
	@Override
	public void start() {
		System.out.println("start executed"); //our own logic to be executed
											//before custom thread is started
		super.start(); //for starting cutom thread
	}
}

public class Test08_startOverride {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread4 mt = new MyThread4();
		mt.start(); 
		
		System.out.println("main end");
	}
}