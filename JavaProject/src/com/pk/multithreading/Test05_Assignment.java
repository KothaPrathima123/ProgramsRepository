package com.pk.multithreading;

class MyThread2 extends Thread {
	@Override
	public void run() {
		//task #2
		for(int i=20; i>=1; i--) {
			System.out.println("run: "+ i);
		}
	}
}
public class Test05_Assignment {
	public static void main(String[] args) {
		
		MyThread2 mt = new MyThread2();
		mt.start();
		
		//task #1
		for(int i=1; i<=20; i++) {
			System.out.println("main: "+ i);
		}
	}
}