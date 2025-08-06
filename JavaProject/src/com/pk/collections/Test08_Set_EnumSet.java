package com.pk.collections;

import java.util.EnumSet;

enum FoodItem {
	IDLY(30), DOSA(40), PURI(40), VADA(45), BONDA(45), PONGAL(30), UPMA(30)
								;
	private double price;
	
	private FoodItem(double price) {
		this.price = price;
	}
	
	public double price() {
		return price;
	}
}

public class Test08_Set_EnumSet {
	public static void main(String[] args) {
		System.out.println(FoodItem.IDLY); //toString()
		System.out.println(FoodItem.DOSA); //toString()

		System.out.println("S.No\tName\tPrice");
		System.out.println("====================================");
		FoodItem[] foodItems = FoodItem.values();
		for(int i=0; i<foodItems.length; i++) {
			FoodItem foodItem = foodItems[i];
			System.out.print(foodItem.ordinal()+1+"\t");
			System.out.print(foodItem.name()+"\t");
			System.out.print(foodItem.price()+"\t");
			System.out.println();
		}
		System.out.println("====================================");
		
		EnumSet<FoodItem> es1 = EnumSet.noneOf(FoodItem.class);
		EnumSet<FoodItem> es2 = EnumSet.allOf(FoodItem.class);
		EnumSet<FoodItem> es3 = EnumSet.of(FoodItem.IDLY, FoodItem.DOSA, FoodItem.PURI);
		EnumSet<FoodItem> es4 = EnumSet.copyOf(es3);
		EnumSet<FoodItem> es5 = EnumSet.complementOf(es3);
		EnumSet<FoodItem> es6 = EnumSet.range(FoodItem.DOSA, FoodItem.BONDA);

		System.out.println(es1);
		System.out.println(es2);
		System.out.println(es3);
		System.out.println(es4);
		System.out.println(es5);
		System.out.println(es6);
		System.out.println();
		
		es1.add(FoodItem.IDLY);
		es1.add(FoodItem.IDLY);
		es1.add(FoodItem.BONDA);
		es1.add(FoodItem.PURI);
		es1.add(FoodItem.DOSA);
		es1.add(FoodItem.PONGAL);
		//es1.add(null);
		//es1.add("a");
		System.out.println(es1);
		es1.remove(FoodItem.IDLY);
		System.out.println(es1);
		
		genereateBill(es1);
	}
	
	//static void genereateBill(FoodItem food) {
	//static void genereateBill(FoodItem[] food) {
	static void genereateBill(EnumSet<FoodItem> food) {
		//logic for retrieving each named constant, its price
		//finding total price
		
		
	}
}