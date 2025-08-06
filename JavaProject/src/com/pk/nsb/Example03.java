package com.pk.nsb;

public class Example03 {
		static int a ;
		static int b ;

		static{ //static field a intialization logic
			a = 10;
		}

		static { //static field b intialization logic
			b = 20;
		}

		public static void main(String[] args) {
			System.out.println(a);
			System.out.println(b);
		}
}
