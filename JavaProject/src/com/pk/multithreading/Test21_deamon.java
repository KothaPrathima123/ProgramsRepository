package com.pk.multithreading;

class MyThread13 extends Thread{
	
	@Override
	public void run() {
		System.out.println("run start");
		System.out.println(getName() +" started as "+ isDaemon());
		for(int i=0; i<=20; i++) {
			System.out.println("run: "+ i);
		}
		System.out.println("run end");
	}
}

public class Test21_deamon {
	public static void main(String[] args) {
		
		System.out.println("main start");

		MyThread13 mt = new MyThread13();
		//mt.setDaemon(true);
		
		mt.start(); //thread is read-to-execute as non-daemon thread
		
		//mt.setDaemon(true); //RE: ITSE
		
		System.out.println("main end");
		
	}
}