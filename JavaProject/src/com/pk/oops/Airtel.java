package com.pk.oops;

public class Airtel implements SIM{

	private double balance;
	
	public void recharge(double amt){
		this.balance = this.balance + amt;
		System.out.println("Airtel SIM is recharged");
		currentBalance();
	}

	public void currentBalance(){
		System.out.println(
			"Airtel SIM existing balance: "+ balance);
	}

	public String call(long mn){
		return "Aritel: The number you are dialing is currently busy. \nPlease dial after some time";
	}
	
	public String sms(long mn, String msg){
		return "Aritel: Your message send successfully";
	}
}