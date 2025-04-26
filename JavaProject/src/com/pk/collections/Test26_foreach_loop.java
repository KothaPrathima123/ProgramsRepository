package com.pk.collections;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Test26_foreach_loop {
	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		al.add("a");
		al.add(5);
		al.add("b");
		al.add(6);
		al.add("c");
		al.add(7);
		System.out.println(al);
		
		for(int i=0; i<al.size(); i++) {
			Object obj = al.get(i);
			System.out.print(obj + "  " );			
		}
		System.out.println();
		System.out.println();

		Iterator<Object> itr = al.iterator();
		while(itr.hasNext()) {
			Object obj = itr.next();
			System.out.print(obj + "  " );			
		}
		System.out.println();
		System.out.println();
	
			
		for(Object obj : al) {
			System.out.println(obj + "  " );
		}
		System.out.println();
//=======================================================================		
		LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add(5);
		lhs.add("b");
		lhs.add(6);
		lhs.add("c");
		lhs.add(7);
		System.out.println(lhs);
		
		for( Object obj : lhs ) {
			System.out.println(obj + " ");
		}
		System.out.println();
		
//==========================================================================		
		HashMap<Object, Object> hm = new HashMap<>();
		hm.put("a", 1);
		hm.put(5, 2);
		hm.put("b", 3);
		hm.put(6, 4);
		hm.put("c", 5);
		hm.put(7, 6);
		System.out.println(hm);
		
		//for(Object entry : hm) { } //CE: because Map is not Iterable
		
		Set<Object> keySet = hm.keySet();
		for(Object key : keySet) { 
			System.out.println(key + "  ");
		}
		System.out.println();
		
//Rule #1: object type must be either array or Iterable interface sub type 
		int[] ia = {3, 4, 5};
		for( int i: ia ) { System.out.println(i);} System.out.println();

		String[] sa = {"a", "b", "c"};
		for( String s: sa ) { System.out.println(s);} System.out.println();

		String s = "Hari"; //String is neither array nor Iterable 
		//for( char ch: s ) { } CE:

		LinkedList<String> ll = new LinkedList<>(); //LL is Iterable type so allowed 
		for(String ele : ll) { } 
		
		Iterator<String> iterator = ll.iterator();
		//for(String ele: iterator) { } //CE: because Itertor is not Iterable type
		
		enum Color{ };
		EnumMap<Color, Object> eM = new EnumMap<>(Color.class);
		//for(Color c: eM) { } //CE: Map is not Iterable
		
//Rule #2: the variable type must the the Iterator.next() method type
		ArrayList<Object> al2 = new ArrayList<>();
		al2.add("Ram");
		al2.add("Balayya");
		al2.add("Pavan Kalayan");
		
		for(Object name : al2) {
			System.out.println(name);
		}
		
		/*
		 * for(Iterator<String> itr = al2.iterator(); itr.hashNext() ; ){
		 * 		Object name = itr.next();
		 * 		System.out.println(name);
		 * }
		 */
		
		//for(String obj : al2) { }
		
//Rule #3: the variable name must not be the local variable declared 
		//in the method in prvious lines
		Object obj = 10;
		//for(Object obj : al2) { }
		for(Object obj2 : al2) { }
		Object obj2 = 20;

//Rule #4: the separator must be colon (:) but not ; or ,
		//for(Object obj ; al2) { }
		//for(Object obj , al2) { }

	}
		
	}