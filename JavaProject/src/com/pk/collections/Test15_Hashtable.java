package com.pk.collections;

import java.util.Hashtable;

public class Test15_Hashtable {
	public static void main(String[] args) {
		Hashtable<Object, Object> ht = new Hashtable<>();
		ht.put("a", 1);
		ht.put("b", 2);
		ht.put(97, 3);
		ht.put(98, 4);
		System.out.println(ht);

		//ht.put(null, 4);
		//ht.put("c", null);
		
	}
}