package com.pk.collections;

import java.util.ArrayList;

public class Test27_forEach_method {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>();
		al.add("a");
		al.add(5);
		al.add("b");
		al.add(6);
		al.add("c");
		al.add(7);
		
		System.out.println(al);
		//logical programming style
		//explicit cursor
		for(Object obj : al) {
			System.out.println(obj);
		}

		System.out.println();
		
		//object-orieted programming style(method calls) 
		//with functional programing (passig logic as argument directly))
		//with the help of Functional Interface and LE
		//implicit cursor - with concise code
		al.forEach(obj -> System.out.println(obj)); //LE
		al.forEach(System.out::println); //MR
		
		
	}
}