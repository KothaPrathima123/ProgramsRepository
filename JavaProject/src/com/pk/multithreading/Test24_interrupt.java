package com.pk.multithreading;

class MyThread16 extends Thread{
	
	@Override
	public void run() {
		System.out.println("run start");
		
		try {
			Thread.sleep(5000);	//if this thread is interrupted begore 5000 ms
		} catch (InterruptedException e) {	//it throws IE, then catch will catch
			System.out.println("IE raised");	//this exception
		}
		
		System.out.println("run end");
	}
}

public class Test24_interrupt {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		
		MyThread16 mt = new MyThread16();
		mt.start();
		
		mt.interrupt(); //it interrupts the paused thread 		
						//and brings it into read-to-run state
		
		System.out.println("main end");
		
	}
		

}