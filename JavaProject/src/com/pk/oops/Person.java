package com.pk.oops;

	public class Person {
		
		private static int eyes;
		private static int ears;
		private static int hands;
		private static int legs;
		
		private String name;
		private double height;
		private double weight;
		
		static{
			eyes	= 2;
			ears	= 2;
			hands	= 2;
			legs	= 2;
		}
	/*	
		public Person(String name, double height, double weight) {
			this.name = name;
			this.height = height;
			this.weight = weight;
		}
	*/
		public static int getEyes() {
			return eyes;
		}
		public static void setEyes(int eyes) {
			Person.eyes = eyes;
		}
		public static int getEars() {
			return ears;
		}
		public static void setEars(int ears) {
			Person.ears = ears;
		}
		public static int getHands() {
			return hands;
		}
		public static void setHands(int hands) {
			Person.hands = hands;
		}
		public static int getLegs() {
			return legs;
		}
		public static void setLegs(int legs) {
			Person.legs = legs;
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		public double getWeight() {
			return weight;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}
		
		public void eat() {
			System.out.println(name + " is eating"); 
		}
		
		public void sleep() { 
			System.out.println(name + " is deep sleeping");
		}
		
		@Override
		public String toString() {
			return	(" eyes\t\t: "	+ eyes) +"\n" +
					(" ears\t\t: "	+ ears) +"\n" +
					(" hands\t\t: "	+ hands) +"\n" +
					(" legs\t\t: "	+ legs ) +"\n" +
					(" name\t\t: "	+ name) +"\n" +
					(" height\t\t: "+ height) +"\n" +
					(" weight\t\t: "+ weight);
		}
			
}
