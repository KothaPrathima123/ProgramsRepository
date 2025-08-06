package com.pk.multithreading;

public class Test19_group {
	public static void main(String[] args) {
		
		Thread th1= new Thread();
		System.out.println(th1.getThreadGroup().getName());
		
		Thread th2 = new Thread();
		System.out.println(th2.getThreadGroup().getName());
		
		Thread th3 = Thread.currentThread();
		System.out.println(th3.getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
		ThreadGroup grpA = new ThreadGroup("Group A");
		Thread th4 = new Thread(grpA, "Child-1");
		Thread th5 = new Thread(grpA, "Child-2");
		System.out.println(th4.getThreadGroup().getName());
		System.out.println(th5.getThreadGroup().getName());
		
		
	}
}
