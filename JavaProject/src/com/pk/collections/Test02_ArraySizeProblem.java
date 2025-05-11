package com.pk.collections;

public class Test02_ArraySizeProblem {
	public static void main(String[] args) {
		
		String[] sa = new String[5];
		sa[0] = "a";
		sa[1] = "b";
		sa[2] = "c";
		sa[3] = "d";
		sa[4] = "e";
		//sa[5] = "f"; //RE: AIOOBE
		
		System.out.println("values are stored in array");
		
		String[] sa2 = new String[10];
		for(int i=0; i<sa.length; i++) {
			sa2[i] = sa[i];		
		}
		
		sa = sa2;
		System.out.println(sa+" "+sa2);
		sa[5] = "f"; 
		
		System.out.println("values are stored in array");
		
	}
}