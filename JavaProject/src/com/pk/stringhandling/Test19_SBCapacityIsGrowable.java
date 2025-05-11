package com.pk.stringhandling;

public class Test19_SBCapacityIsGrowable {
	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer();
		System.out.println("sb1 capacity: "+sb1.capacity());//16
		System.out.println("sb1 length: "+sb1.length());//0
		System.out.println("sb1 chars: "+sb1);
		sb1.append("a");
		sb1.append("b");
		sb1.append("c");
		System.out.println("sb1 capacity: "+sb1.capacity());//16
		System.out.println("sb1 size: "+sb1.length());//3
		System.out.println("sb1 chars: "+sb1);//abc
		sb1.append("d");
		System.out.println("sb1 capacity: "+sb1.capacity());//16
		System.out.println("sb1 size: "+sb1.length());//4
		System.out.println("sb1 chars: "+sb1);//abcd
		sb1.append("efghi");
		System.out.println("sb1 capacity: "+sb1.capacity());//16
		System.out.println("sb1 size: "+sb1.length());//9
		System.out.println("sb1 chars: "+sb1);//abcdefghi
		StringBuffer sb2=new StringBuffer(2);
		System.out.println("sb2 capacity: "+sb2.capacity());//2
		System.out.println("sb2 size: "+sb2.length());//0
		System.out.println("sb2 chars: "+sb2);
		sb2.append("abcdefg");
		System.out.println("sb2 capacity: "+sb2.capacity());//7
		System.out.println("sb2 size: "+sb2.length());//7
		System.out.println("sb2 chars: "+sb2);//abcdefg
	}
}
