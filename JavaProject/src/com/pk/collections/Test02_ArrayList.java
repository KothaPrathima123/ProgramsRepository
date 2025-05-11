package com.pk.collections;

import java.util.ArrayList;

public class Test02_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		System.out.println("size: "+ al.size()); 	//0
		System.out.println("eles: "+ al); 			//[]
		System.out.println(); 	
		
		al.add("a");
		al.add("b");
		al.add(5);
		al.add(6.7);
		al.add('p');
		al.add(true);
		al.add(null);
		al.add(new Ex(5, 6));
		al.add("a");
		al.add(5);
		
		System.out.println("eles: "+ al); 			//[]
		System.out.println("size: "+ al.size()); 	//0
		System.out.println();
		
		al.add(6.7);

		System.out.println("eles: "+ al); 			//[]
		System.out.println("size: "+ al.size()); 	//0
		System.out.println();
		
		Object obj = al.get(6);
		System.out.println(obj);
		System.out.println();
		
		for(int i=0; i<al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}
	}
}