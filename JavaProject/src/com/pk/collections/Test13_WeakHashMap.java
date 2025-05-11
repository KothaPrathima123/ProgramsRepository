package com.pk.collections;

import java.util.HashMap;

public class Test13_WeakHashMap {
	public static void main(String[] args) {
		//WeakHashMap<Object, Object> whm = new WeakHashMap<>();
		HashMap<Object, Object> whm = new HashMap<>();
		Ex e1 = new Ex(5,  6); 
		Ex e2 = new Ex(6,  7);
		whm.put(e1, 1);
		whm.put(e2, 2);
		whm.put(new Ex(7, 8), 3);
		whm.put(new Ex(8, 9), 4);
		
		System.out.println(whm);
		System.gc();
		System.out.println(whm);
		
		
	}
}