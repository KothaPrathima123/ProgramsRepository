package com.pk.interfacerules;

class Person implements LivingThing{
	@Override
	public void move() {
		System.out.println("Person.move()");
	}
}
class Animal implements LivingThing{
	@Override
	public void move() {
		System.out.println("Animal.move()");
	}
}
class Bird implements LivingThing{
	@Override
	public void move() {
		System.out.println("Bird.move()");
	}
}
class Fish implements LivingThing{
	@Override
	public void move() {
		System.out.println("Fish.move()");
	}
}
public class Zoo {
 void allow(LivingThing lt) {//loose coupling
	 lt.move();//runtime polymorphism
 }
 public static void main(String[] args) {
	Zoo zoo=new Zoo();
	//message passing
	zoo.allow(new Person());
	zoo.allow(new Animal());
	zoo.allow(new Bird());
	zoo.allow(new Fish());
	}
}
