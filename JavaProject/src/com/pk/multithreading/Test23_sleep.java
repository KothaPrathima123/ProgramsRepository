package com.pk.multithreading;

class MyThread15 extends Thread{
	
	@Override
	public void run() {
		System.out.println("run start");
	
		System.out.println("run end");
	}
}

public class Test23_sleep {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		
		MyThread15 mt = new MyThread15();
		mt.start();
		
		//pause
		Thread.sleep(3000); //forcing JVM to pause this currently running thread
						//for the given time [1000ms = 1sec]
			//Thread will be moved to Non-Runnable state [TIMED_WAITING]
			//after given time is completed, thread will be moved to 
			//Read-to-Run state, once it got it turn to execute, enteres into Running state
		
		for(int i=1; i<=20; i++) {
			System.out.println(i);
			Thread.sleep(500);
		}
		
		System.out.println("main end");
		
	}
}