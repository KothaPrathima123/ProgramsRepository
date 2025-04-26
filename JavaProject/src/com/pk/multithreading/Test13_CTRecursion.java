package com.pk.multithreading;

class MyThread9 extends Thread {
	@Override
	public void run() {
		System.out.println(getName() + " start");
		MyThread9 mt = new MyThread9();
		mt.start();
		System.out.println(getName() + " end");
		while(true) {/* System.out.println(getName() + " back in execution"); */}
	}	
}

public class Test13_CTRecursion {
	public static void main(String[] args) {
		MyThread9 mt = new MyThread9();
		mt.start();
	}
}