package com.pk.stringhandling;

public class Test05_StringProb_SolutionStringBuffer {
	public static void main(String[] args) {
		String s1="hare";
		System.out.println("Before concat: "+s1);
		s1.concat("krishna");
		System.out.println("After concat: "+s1);
		System.out.println();
		String s2=s1.concat("hare");
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		System.out.println();
		s1=s1.concat("krishna");
		System.out.println("s1: "+s1);//if we modify string obj for 1m times the 1m times new obj is created
		StringBuffer sb1=new StringBuffer();
		System.out.println("sb1: "+sb1);
		sb1.append("krishna");
		System.out.println("sb1: "+sb1);
	}
}
