package com.pk.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test21_Iterator {
	public static void main(String[] args) {

		ArrayList<Object> al = new ArrayList<>();
		al.add("a");
		al.add(5);
		al.add("b");
		al.add(6);
		al.add("c");
		al.add(7);
		System.out.println(al);
		
		Iterator<Object> itr = al.iterator();
		while (itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj);
		}
//===================================================================
		LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add(5);
		lhs.add("b");
		lhs.add(6);
		lhs.add("c");
		lhs.add(7);
		System.out.println(lhs);
		
		Iterator<Object> itr2 = lhs.iterator();
		while (itr2.hasNext()) {
			Object obj = itr2.next();
			System.out.println(obj);
		}

		System.out.println();	
		
	//short cut code - with reusability
	/*ArrayList<Object> al2 = new ArrayList<>();
	CollectionUtility.initialize(al2);
	CollectionUtility.printViaIterator(al2);
	System.out.println();
	
	LinkedHashSet<Object> lhs2 = new LinkedHashSet<>();
	CollectionUtility.initialize(lhs2);
	CollectionUtility.printViaIterator(lhs2);
			*/
	}
}