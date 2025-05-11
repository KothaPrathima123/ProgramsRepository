package com.pk.collections;

import java.util.LinkedList;

public class Test03_LinkedList {
	public static void main(String[] args) {
		
		LinkedList<Object> ll = new LinkedList<>();
		System.out.println(ll.size());
		System.out.println(ll);
		System.out.println();
		
		ll.add("a");
		ll.add("b");
		ll.add(5);
		ll.add(6.7);
		ll.add('p');
		ll.add(null);
		ll.add(new Ex(5,6));
		ll.add("a");
		ll.add(5);
		ll.add(6.7);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println();
		
		System.out.println(ll.get(0));
		System.out.println(ll.get(3));
		System.out.println(ll.get(7));
		
		for(int i=0; i<ll.size(); i++) {
			System.out.print(ll.get(i)+ " ");
		}
		
		
	}
}