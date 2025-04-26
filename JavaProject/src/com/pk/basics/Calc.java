package com.pk.basics;
class Calc {
	public static void main(String[] args) {
		try{		
			int res = Addition.add(-10, 20);
			System.out.println("Result: "+ res);
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}

	}
}