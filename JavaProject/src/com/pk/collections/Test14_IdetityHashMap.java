package com.pk.collections;

import java.util.IdentityHashMap;

public class Test14_IdetityHashMap {
	public static void main(String[] args) {
		IdentityHashMap<Object, Object> ihm = new IdentityHashMap<>();
		ihm.put(new Sa(5,6), 1);
		System.out.println(ihm);
	}
}