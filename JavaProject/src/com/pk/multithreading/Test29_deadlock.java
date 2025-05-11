package com.pk.multithreading;

class MyThread18 extends Thread {
	private MyThread19 mt19;
	
	void setMt19(MyThread19 mt19){
		this.mt19 = mt19;
	}
	
	@Override
	public void run() {
		System.out.println("m18 run start");

		try {mt19.join();} //pausing mt18 for mt19 to complete
		catch (InterruptedException e) {}		
		
		System.out.println("m18 run end");
	}
}

class MyThread19 extends Thread {
	private MyThread18 mt18;
	
	void setMt18(MyThread18 mt18){
		this.mt18 = mt18;
	}
	
	@Override
	public void run() {
		System.out.println("m19 run start");
			
		try {mt18.join();}  //pausing mt19 for mt18 to complete
		catch (InterruptedException e) {}   //then leads to deadlock
		
		System.out.println("m19 run end");
	}
}

public class Test29_deadlock {
	public static void main(String[] args) {
		System.out.println("main start");

		MyThread18 mt18 = new MyThread18();
		MyThread19 mt19 = new MyThread19();
		
		mt18.setMt19(mt19);
		mt19.setMt18(mt18);
		
		mt18.start();
		mt19.start();
		
		System.out.println("main end");
	}
}