package com.pk.oops;

//LivingThing.java		
interface LivingThing {	//Interface and Abstaction
	void move();
}

//Person.java
class Person01 implements LivingThing { //class and Inheritance
										//Encapulation
	public void move() {					//Polymorphism
		System.out.println("Person is moving by walking");
	}
}

//Animal.java
class Animal implements LivingThing {
	public void move(){ 
		System.out.println("Animal is moving by running");
	}
}


//Bird.java
class Bird implements LivingThing {
	public void move(){ 
		System.out.println("Bird is moving by flying");
	}
}

//Zoo.java
class Zoo {		//User class
	void allow(LivingThing lt){  //LC (super class type ref var)
		lt.move();	//RP	//executing called method from diff implementation class	
	}						//based on the argument object or runtime object passed

	public static void main(String[] args){

		Zoo Zoo = new Zoo();

		//Zoo.allow(new Person());	//message passing
		Zoo.allow(new Animal());
		Zoo.allow(new Bird());
		Zoo.allow(new Fish());

	}	
}

//Fish.java
class Fish implements LivingThing {
	public void move() { 
		System.out.println("Fish is moving by swimming");
	}
}