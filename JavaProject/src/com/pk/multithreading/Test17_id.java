package com.pk.multithreading;

public class Test17_id {
	public static void main(String[] args) {
		
		Thread th1 = new Thread("Child1");
		Thread th2 = new Thread("Child1");
		
		System.out.println(th1.getId()  + "  " + th1.getName());
		System.out.println(th2.getId()  + "  " + th2.getName());
	}
}