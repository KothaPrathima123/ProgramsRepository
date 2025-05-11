package com.pk.multithreading;

class AddThread extends Thread {
	@Override
	public void run() {
		int sum=1;
		for(int i=2; i<=3; i++) {
			sum = sum + i;
			System.out.println("summation: "+ sum);
		}
	}
}

class SubThread extends Thread {
	@Override
	public void run() {
		int sub=1;
		for(int i=2; i<=3; i++) {
			sub = sub - i;
			System.out.println("subtraction: "+ sub);
		}
	}
}

class MulThread extends Thread {
	@Override
	public void run() {
		int mul=1;
		for(int i=2; i<=3; i++) {
			mul = mul * i;
			System.out.println("subtraction: "+ mul);
		}
	}
}
public class Test11_multipleCTs_withDiffLogic {
	public static void main(String[] args) {
		AddThread add = new AddThread();
		SubThread sub = new SubThread();
		add.start();
		sub.start();
	}
}