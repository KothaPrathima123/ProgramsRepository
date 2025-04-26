package com.pk.multithreading;

class Addition {
	
	private int x;
	private int y;
	
	//void add(int x, int y) {
	synchronized void add(int x, int y) {
		
		this.x = x;
		this.y = y;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		int res = this.x + this.y;
		System.out.println(
				Thread.currentThread().getName() + " res: "+ res);
	}

}

class Thread1  extends Thread {
	private Addition a;
	
	public Thread1(Addition a) {
		this.a = a;
	}

	@Override
	public void run() {
		a.add(50, 60);
	}
}

class Thread2  extends Thread {
	private Addition a;
	
	public Thread2(Addition a) {
		this.a = a;
	}
	
	@Override
	public void run() {
		a.add(70, 80);
	}
}

public class Test26_Sync {
	public static void main(String[] args) {
		
		System.out.println("main start");
		Addition a = new Addition();
		
		Thread1 th1 = new Thread1(a);
		Thread2 th2 = new Thread2(a);
		
		th1.start();
		th2.start();
		
		System.out.println("main end");
	}
}