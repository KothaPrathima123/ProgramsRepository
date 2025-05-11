package com.pk.multithreading;

class FirstClass {
	  synchronized void m1(SecondClass sc) {  //th1 (fc is locked)
		  String name = Thread.currentThread().getName();
		  System.out.println(name +" m1 execution is started");
		  	try {
		  		System.out.println(name +" m1 execution is paused");
		  		Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		  	System.out.println(name +" m1 execution is resumed");
		  	System.out.println(name +" m1 is calling sc.m4();");
		 sc.m4(); //paused 
		 System.out.println(name +" sc.m4() execution is completed");
		 System.out.println(name +" m1 execution is ended");
	  }
	  
	  synchronized void m2() {
		  System.out.println("m2 is executed");
	  }
}

class SecondClass {
	synchronized void m3(FirstClass fc) { //th2 (sc object is locked
		
		  String name = Thread.currentThread().getName();
		  System.out.println(name +" m3 execution is started");
	  	try {
	  		System.out.println(name +" m3 execution is paused");
	  		Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  	System.out.println(name +" m3 execution is resumed");
	  	System.out.println(name +" m3 is calling fc.m21();");
		 fc.m2(); //paused 
		 System.out.println(name +" fc.m2() execution is completed");
		 System.out.println(name +" m3 execution is ended");
	}
	
	synchronized void m4() {
		System.out.println("m4 is executed");
	}
	
}

class FCThread extends Thread {
	
	private FirstClass fc;
	private SecondClass sc;
	
	public FCThread(FirstClass fc, SecondClass sc) {
		this.fc = fc;
		this.sc = sc;
	}
	
	@Override
	public void run() {
		fc.m1(sc);
	}
}

class SCThread extends Thread {
	private FirstClass fc;
	private SecondClass sc;
	
	public SCThread(SecondClass sc, FirstClass fc) {
		this.sc = sc;
		this.fc = fc;
	}
	
	@Override
	public void run() {
		sc.m3(fc);
	}
}

public class Test30_dealock {
	public static void main(String[] args) {
		FirstClass fc = new FirstClass();
		SecondClass sc = new SecondClass();
		
		FCThread fct = new FCThread(fc, sc);
		SCThread sct = new SCThread(sc, fc);
		
		fct.start();
		sct.start();
	}
}