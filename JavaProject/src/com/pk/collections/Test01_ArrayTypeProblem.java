package com.pk.collections;

public class Test01_ArrayTypeProblem {
	public static void main(String[] args) {
		
		int[] ia1 = new int[5];  //int or int lesser range values
		ia1[0] = 5;
		ia1[0] = 'a';
		//ia1[0] = 5L;
		//ia1[0] = 5.0;
		//ia1[0] = true;

		double[] da1 = new double[5];  //double or double lesser range values
		da1[0] = 5;
		da1[0] = 'a';
		da1[0] = 5L;
		da1[0] = 5.0;
		//da1[0] = true;
		//da1[0] = "abc";

		Student[] sa1 = new Student[5];  //Student or Student Sub types objects
		sa1[0] = new Student();
		//sa1[0] = new Faculty();
		//sa1[0] = new Admin();

		Person[] pa1 = new Person[5];  //Person or Person Sub types objects
		pa1[0] = new Student();
		pa1[0] = new Faculty();
		pa1[0] = new Admin();
		//pa1[0] = new Lion();
		//pa1[0] = new Bus();

		Animal[] aa1 = new Animal[5];  //Person or Person Sub types objects
		aa1[0] = new Lion();
		aa1[0] = new Tiger();
		aa1[0] = new Elephant();
		//aa1[0] = new Student();
		
		Object[] obj = new Object[5]; //we can store both PDT and RDT 
		obj[0] = 5;						//of any type. Hence type problem is 
		obj[0] = 6.7;					//solved
		obj[1] = 'a';
		obj[1] = 5L;
		obj[1] = true;
		obj[1] = "abc";
		obj[1] = new Student();
		obj[1] = new Lion();
		obj[1] = new Lion[5];
		
		
				
	}
	
}