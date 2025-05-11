package com.pk.nullpointer;

public class Example01 {
	int x = 10;
	int y = 20;
	
	static Example e2;
	public static void main(String[] args){
		
		Example e1 = null; 

			System.out.println(e1.x);//npe
			if(e1 != null)
				System.out.println(e1.x);
			System.out.println(e2.x);
			
	}
};
