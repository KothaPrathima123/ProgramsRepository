package com.pk.stringhandling;

public class Test09_StringPooling {
	public static void main(String[] args) {
		//case1: literal
		String s1="SriKrishna";
		String s2="SriKrishna";
		System.out.println(s1==s2);//true
		System.out.println();
		//case2: new kwyword & const
		String s3=new String("Ram");
		String s4=new String("Ram");
		System.out.println(s3==s4);//false
		System.out.println(s3.equals(s4));//true
		System.out.println();
	}
}
