package com.pk.oops;

class Volvo extends Bus {
	@Override
	public void engine(){
		System.out.println("Volvo engine capacity 110 KMPH");
	}

	@Override
	public void breaks(){
		System.out.println("Volvo needs powerful beaks");
	}
}