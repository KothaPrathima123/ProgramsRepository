package com.pk.collections;

import java.util.LinkedList;

public class Test05_LinkedList_Internals {
		public static void main(String[] args) {
			
			LinkedList<Object> ll = new LinkedList<>();
			
			//OP #1: adding object
			ll.add("a");
			ll.add("b");
			ll.add(5);
			ll.add(6.7);
			ll.add('p');
			ll.add(null);
			ll.add(new Ex(5,6));
			ll.add(new Sa(5,6));
			
			//Op #2: counting object
			System.out.println(ll.size());
			
			//Op #3: printing 
			System.out.println(ll);
			
			//Op #4:
			System.out.println(ll.contains("a")); //LSA

			//Op #5:
			System.out.println(ll.indexOf("a")); //LSA

			//Op #6:
			System.out.println(ll.get(4)); //BSA

			//Op #7:
			System.out.println(ll.remove("a")); //LSA
			System.out.println(ll.remove(5)); //BSA
			System.out.println(ll.remove(new Ex(5,6))); //LSA
			
			//Op #8:
			ll.add(5, "x"); //BSA

			//Op #9:
			ll.set(3, "y"); //BSA
		}
}
