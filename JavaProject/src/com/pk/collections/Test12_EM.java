package com.pk.collections;

import java.util.EnumMap;

public class Test12_EM {
	public static void main(String[] args) {
		
		EnumMap<FoodItem, Double> em = new EnumMap<>(FoodItem.class);
		em.put(FoodItem.IDLY, 30.0);
		em.put(FoodItem.DOSA, 45.0);
		System.out.println(em);
	}
}