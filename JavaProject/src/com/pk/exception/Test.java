package com.pk.exception;

class  Test{
	public static void main(String[] args) {
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a/b;
			System.out.println("Result: "+c);
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
			System.out.println("Please enter only integers, two integers");
		}catch(ArithmeticException e){
			System.out.println("Please donot pass ZERO as second value");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
