package com.pk.multithreading;
class MyRunnable2 extends Exception implements Runnable{
	@Override
	public void run() {
		//task #2
		for(int i=20; i>=1; i--) {
			System.out.println("run: "+ i);
		}
	}
}
public class Test06_Assignment {
	public static void main(String[] args) {
		
		MyRunnable2 mr = new MyRunnable2();
		
		Thread th = new Thread(mr);
		th.start();
		
		//task #1
		for(int i=1; i<=20; i++) {
			System.out.println("main: "+ i);
		}
	}
}