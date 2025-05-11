package com.pk.toString;


public class  Example02 {
	int x = 10;
	int y = 20;

	/*
	 * @Override public String toString(){ return "Example("+x+", "+ y +")"; }
	 */

	public String toString(){
		return "Hi";
	}
	
	public static void main(String[] args) 	{
		Example02 e1 = new Example02();
		Example02 e2 = null;
		Example02 e3;

		System.out.println(e1.toString());  //Hi
		System.out.println(e2);  //null
		//System.out.println(e3);ce:The local variable e3 may not have been initialized 
		//System.out.println(e3.toString());ce:The local variable e3 may not have been initialized
		System.out.println(e1);//null
	}
}