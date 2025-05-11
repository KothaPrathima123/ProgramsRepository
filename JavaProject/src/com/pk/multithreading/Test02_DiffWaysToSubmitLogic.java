package com.pk.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Approach #1:
class MyThread02 extends Thread {
	@Override
	public void run() {
		System.out.println("MyThread run");
	}
}

//Approach #2:
class MyRunnable02 implements Runnable{
	@Override
	public void run() {
		System.out.println("MyRunnable run");
	}
}

//Approach #3:
class MyCallable2 implements Callable<String>{
	@Override
	public String call() {
		System.out.println("MyCallable run");
		return "CJ";
	}
}

public class Test02_DiffWaysToSubmitLogic {
	public static void main(String[] args) {
		
		MyThread02 mt1 = new MyThread02();
		mt1.start();
		
		Thread th2 = new Thread( new MyRunnable02());
		th2.start();
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		service.submit(new MyCallable2());
		
//Approach #4:		
		new Thread() { 
			@Override
			public void run() {
				System.out.println("Thread AIC run");
			}
		}.start();
		
//Approach #5:		
		new Thread(
			new Runnable() { 
				@Override
				public void run() {
					System.out.println("Runnable AIC run");
				}
			}
		).start();
		
//Approach #5:		
		service.submit(
		  new Callable<Double>() {
			@Override
			public Double call() throws Exception {
				System.out.println("Callble AIC call");
				return 10.5;
			}
		  }
		);

//Approach #7:		
		new Thread(
				() -> {
					System.out.println("Runnable LE run");
				}
		).start();
		
//Approch #8:
		service.submit(() -> { 
			System.out.println("Callable LE call");
			return 5L;
		});
		
//Approach #9:		
		new Thread(
				Example::m1
		).start();

		new Thread(
				new Example()::m2
		).start();
	
		new Thread(
				Example::new
		).start();
		
//Approach #10: 
		service.submit(new Example()::m3);
		
	}
	
}

class Example {
	Example(){
		System.out.println("Runnable NPCR run");
	}
	static void m1() {
		System.out.println("Runnable SMR run");
	}
	
	void m2() {
		System.out.println("Runnable NSMR run");
	}
	
	String m3() {
		System.out.println("Callable SMR call");
		return "abc";
	}
}