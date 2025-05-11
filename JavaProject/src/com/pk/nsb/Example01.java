package com.pk.nsb;

public class Example01 {
		static {
			System.out.println("SB1");
		}

		static {
			System.out.println("SB2");
		}

		public static void main(String[] args) {
			System.out.println("main");
		}

		static {
			System.out.println("SB3");
		}
}
