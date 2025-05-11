package com.pk.multithreading;

class MyThread17 extends Thread{
	
	@Override
	public void run() {
		System.out.println("run start");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("run end");
	}
}


public class Test25_join {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		
		MyThread17 mt1 = new MyThread17();
		mt1.start();
		
		//mt1.join();
		//mt1.join(2000);
		//mt1.join(7000);
		mt1.sleep(7000);
		
		System.out.println("main end");
	}
}