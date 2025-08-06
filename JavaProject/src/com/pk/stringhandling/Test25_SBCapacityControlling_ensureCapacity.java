package com.pk.stringhandling;

public class Test25_SBCapacityControlling_ensureCapacity {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer(3);
		System.out.println(sb.capacity());
		sb.ensureCapacity(4);
		System.out.println(sb.capacity());
		sb.ensureCapacity(20);
		System.out.println(sb);
		sb.ensureCapacity(15);
		System.out.println(sb);
		sb.ensureCapacity(0);
		System.out.println(sb);
		sb.ensureCapacity(-5);
		System.out.println(sb);
		System.out.println(sb.append("abcd"));
		sb.trimToSize();
		System.out.println(sb);
	}
}
