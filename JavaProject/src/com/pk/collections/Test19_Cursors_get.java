package com.pk.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Test19_Cursors_get{
	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		al.add("a");
		al.add(5);
		al.add("b");
		al.add(6);
		al.add("c");
		al.add(7);
		System.out.println(al);
		
		//Retrieving objects Randomly from the passing index
		Object obj1 = al.get(2);
		System.out.println(obj1);
		
		//Retrieving objects sequentially from 0 to size()-1 locations
		//by using for loop and get(i) method
		for(int i=0; i<al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}
		System.out.println();
		System.out.println();
		
		//The limitation of get() method, it works with index
		//get() method can't be used on non-indexed based collections
		
		
		LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add(5);
		lhs.add("b");
		lhs.add(6);
		lhs.add("c");
		lhs.add(7);
		System.out.println(lhs);
		
		//Object obj2 = lhs.get(???);  //LHS in an index based collection
		//System.out.println();		//so we can not use get() method
		
		//Solution is: Cursor objects Enumeration or Iterator
		
				
	}
}