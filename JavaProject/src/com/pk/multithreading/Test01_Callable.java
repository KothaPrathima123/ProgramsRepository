package com.pk.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyRunnable01 implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Runnable implementation task");
	}
}

class MyCallable implements Callable<Integer>{
	@Override
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName() + " Callable implementaion task");
		return 5/0;
	}
}


public class Test01_Callable {
	public static void main(String[] args) {
		System.out.println("main start");
		
			//Thread th1 = new Thread(new MyRunnable());	//not reusable
			//th1.start();							//it is one time execution
				//here created and terminated
								
			//ExecutorService service = Executors.newSingleThreadExecutor(); //created once
			ExecutorService service = Executors.newFixedThreadPool(5); //created once
			//ExecutorService service = Executors.newCachedThreadPool(); //created once
			
//			service.submit(new MyRunnable());	//and reused again and again
//			service.submit(new MyRunnable());	
//			service.submit(new MyRunnable());	
//			service.submit(new MyRunnable());	
//			service.submit(new MyRunnable());	
//			service.submit(new MyRunnable());	
			
//			service.submit(new MyCallable());	
//			service.submit(new MyCallable());	
//			service.submit(new MyCallable());	
//			service.submit(new MyCallable());	
//			service.submit(new MyCallable());	
//			service.submit(new MyCallable());	
//			service.submit(new MyCallable());
			
//			for(int i=1; i<=50; i++) {
//				service.submit(new MyCallable());
//			}
//			
//			service.shutdown();	
			//service.shutdownNow();	
			
			ExecutorService service2 = Executors.newSingleThreadExecutor();
			//Future<?> runnableFuture = service2.submit(new MyRunnable());
			//Object runnableResult;

			Future<Integer> runnableFuture = service2.submit(new MyCallable());
			int runnableResult;
			try {
				runnableResult = runnableFuture.get();
				System.out.println("runnableResult: "+ runnableResult);
				
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
			
		System.out.println("main end");
	}
}
