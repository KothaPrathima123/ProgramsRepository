package com.pk.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Test23_Iterator_Rules {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>();

			Iterator<Object> itr1 = al.iterator();
		
		//Rule: we can not call next() on empty collection or on empty location
		//System.out.println(itr1.next()); //RE: NoSuchElementException
		al.add("a");

			Iterator<Object> itr2 = al.iterator();
			System.out.println(itr2.next());
			//System.out.println(itr2.next()); //RE: NSEE

		al.add(5);
		al.add("b");
		al.add(6);
		al.add("c");
		al.add(7);
		System.out.println(al);
		
			Iterator<Object> itr3 = al.iterator();
			System.out.println(itr3.next());//a
			
		al.add("d");
		System.out.println(al);
		
		//Rule #2: after collection object is modified structurally
		//either by adding new objects or by removing exising objects
		//by using collectin methods, we can not continue same cursor
		//then next() method call thoses RE: java.util.ConcurrentModificationException
			//System.out.println(itr3.next());//RE: CME
		
		//Rule #3: we cannot call remove() method without calling 
		//next() method and also we must not call remove() method
		//multiple times after one next() method call
		//it leads to RE: java.lang.IllegalStateException
			Iterator<Object> itr = al.iterator(); 
			//itr.remove(); //RE: ISE
			
			itr.next();
			itr.remove();
			//itr.remove(); //RE: ISE
		
		
	}
}