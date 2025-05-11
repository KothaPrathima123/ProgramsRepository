package com.pk.oops;

public class Voter {
	private int age;
	private String name;

	public void setAge(int age) throws IllegalArgumentException{

		if(age < 18 || age > 120)
			throw new IllegalArgumentException(
								"You are not eligible for voting");
	
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}

	public void setName(String name){

		this.name = name;
	}

	public String getName(){
		return this.name;
	}
}
