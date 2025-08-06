package com.pk.multithreading;

class Addition1 {
	private static int x;
	private static int y;
	
	//public static void add(int x, int y) {
	public static synchronized void add(int x, int y) {
		Addition1.x = x;
		Addition1.y = y;
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int res = Addition1.x + Addition1.y;
		System.out.println(Thread.currentThread().getName()+ " res "+ res);
	}
}
class Thread3 extends Thread {
	@Override
	public void run() {
		Addition1.add(50, 60);
	}
}

class Thread4 extends Thread {
	@Override
	public void run() {
		Addition1.add(70, 80);
	}
}


public class Test27_sync {
	public static void main(String[] args) {
		Thread3 th1 = new Thread3();
		Thread4 th2 = new Thread4();
		th1.start();
		th2.start();
	}
}