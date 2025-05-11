package com.pk.exception;

public class Test30_CatchWithMultipleExceptions {
	public static void main(String[] args) {
		try {}
		//catch(ArrayIndexOutOfBoundsException aioobe|NumberFormatException nfe) {}
		catch(ArrayIndexOutOfBoundsException |NumberFormatException nfe) {}
		try {}
		catch(Exception e) {}
		//catch(NumberFormatException nfe|Exception e) {}//ce: The exception NumberFormatException is already caught by the alternative Exception 
	}													//we cannot take super and subclasses only siblings are allowed
}

