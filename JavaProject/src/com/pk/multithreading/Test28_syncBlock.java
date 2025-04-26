package com.pk.multithreading;

/*
 * synchronized(this) 			=> currnet object is locked
 * synchronized(Addition.class) => Addition class is locked
 * synchronized(Example.class)	=> Example class is locked
 * synchronized(s1) 			=> s1 argument object is locked
 * 
 * synchronized(this) {
 *      synchronized(Addition.class) {
 *      	syncronized(s1) {
 *     
 *      	}      
 *      }
 * }
 */


class Addition2 {
	private static int x;
	private static int y;
	
	//public static void add(int x, int y) {
	//public static synchronized void add(int x, int y) {
	
	public static void add(int x, int y) {
		//---------
		//---------		concurrently
		//---------
		//---------
		synchronized(Addition2.class){
			Addition2.x = x;
			Addition2.y = y;
			
			try {									//sequentially
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			int res = Addition2.x + Addition2.y;
			System.out.println(Thread.currentThread().getName()+ " res "+ res);
		}
		//---
		//---	concurrently
		//---
		//---
	}
}
class Thread5 extends Thread {
	@Override
	public void run() {
		Addition2.add(50, 60);
	}
}

class Thread6 extends Thread {
	@Override
	public void run() {
		Addition2.add(70, 80);
	}
}


public class Test28_syncBlock {
	public static void main(String[] args) {
		Thread5 th1 = new Thread5();
		Thread6 th2 = new Thread6();
		th1.start();
		th2.start();
	}
}