package com.pk.oops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
	private double balance;

	public void setBalance(double balance) 
		              throws IllegalArgumentException{

		if(balance == 0)
			throw new IllegalArgumentException("Donot pass Zero");
		
		if(balance < 0)
			throw new IllegalArgumentException("Donot pass -ve amount");
		
		this.balance = balance;
	}

	public double getBalance(){
		return balance;
	}
}
class BankAccount{
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Bank acc1 = new Bank();

		while(true){
			try{
				System.out.print("\nEnter Balance: ");
				double balance = scn.nextDouble();    scn.nextLine();   
				acc1.setBalance(balance);
				System.out.println("current balance: "+ acc1.getBalance());
				break;
			}catch (InputMismatchException e)	{
				System.out.println("Enter only number");
				scn.nextLine(); //removing wrong data from Scanner object
			}catch (IllegalArgumentException e)	{
				System.out.println(e.getMessage());
			}
		}//while end
	}
}