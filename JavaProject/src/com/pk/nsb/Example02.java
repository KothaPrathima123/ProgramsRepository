package com.pk.nsb;

public class Example02 {
	/*
	 * Example02(final Example02 this) { super(); }
	 */
	  public static void main(java.lang.String[] args) {
		java.lang.System.out.println("main");
	  }

	  static {
		{
			java.lang.System.out.println("SB1");
		}

		{
			java.lang.System.out.println("SB2");
		}

		{
			java.lang.System.out.println("SB3");
		}
	  }
}
