package com.pk.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test25_ListIterator {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>();
		al.add("a");
		al.add(5);
		al.add("b");
		al.add(6);
		al.add("c");
		al.add(7);
		System.out.println(al);
		
		ListIterator<Object> litr = al.listIterator();
		while(litr.hasNext()) {
			System.out.print(litr.next() +" ");
		}
		System.out.println();
		
		while(litr.hasPrevious()) {
			System.out.print(litr.previous() +" ");
		}
		System.out.println();

		while(litr.hasNext()) {
			Object obj = litr.next();
			if(obj instanceof String s) {
				litr.set(s.toUpperCase());
			}
			
			if(obj instanceof Integer) {
				litr.add(20);
			}
		}
		System.out.println();
		System.out.println(al);
		
		
		
	}
}