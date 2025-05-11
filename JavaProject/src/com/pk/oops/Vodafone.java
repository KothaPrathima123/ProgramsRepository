package com.pk.oops;

public class Vodafone implements SIM{

	private double balance;
	
	public void recharge(double amt){
		this.balance = this.balance + amt;
		System.out.println("Vodafone SIM is recharged");
		currentBalance();
	}

	public void currentBalance(){
		System.out.println(
			"Vodafone SIM existing balance: "+ balance);
	}

	public String call(long mn){
		return "Vodafone: The number you are dialing is unrechable. \nPlease dial after some time";
	}
	
	public String sms(long mn, String msg){
		return "Vodafone: Your message send successfully";
	}
}