package com.pk.stringhandling;

public class Test26_SBCapacityControlling_setLength {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("abc");
		System.out.println("capacity: "+sb.capacity());
		//System.out.println(String.valueOf(sb.charAt(3)));
		sb.trimToSize();
		sb.append("def");
		System.out.println("capacity: "+sb.capacity());
		StringBuffer sb2=new StringBuffer(7);
		sb2.append("abc");
		System.out.println("capacity: "+sb2.capacity());
		sb2.setLength(5);
		sb2.setLength(2);
		sb2.setLength(5);
		sb2.setLength(0);
		System.out.println("chars: "+sb2.length());
		//sb2.setLength(-5);//SIOOBE
		
	}
}
