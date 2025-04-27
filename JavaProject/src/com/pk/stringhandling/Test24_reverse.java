package com.pk.stringhandling;

public class Test24_reverse {
	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("abcdef");
		System.out.println("Sb chars: "+sb1);
		sb1.reverse();
		System.out.println("Sb1 chars: "+sb1);
		StringBuffer sb2=sb1.reverse();
		System.out.println(sb1==sb2);
		
	}
}
