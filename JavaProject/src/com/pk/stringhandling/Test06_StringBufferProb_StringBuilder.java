package com.pk.stringhandling;

public class Test06_StringBufferProb_StringBuilder {
	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer();
		StringBuilder sb2=new StringBuilder();
		long time1,time2;
		time1=System.nanoTime();
		for(int i=1;i<=100000;i++) {
			sb1.append(new Integer(i));
		}
		time2=System.nanoTime();
		System.out.println(time2-time1);
		for(int i=1;i<=100000;i++) {
			sb2.append(new Integer(i));
		}
		time2=System.nanoTime();
		System.out.println(time2-time1);
	}
}
