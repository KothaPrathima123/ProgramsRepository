package com.pk.oops;

public class Docomo implements SIM{

	private double balance;
	
	public void recharge(double amt){
		this.balance = this.balance + amt;
		System.out.println("Docomo SIM is recharged");
		currentBalance();
	}

	public void currentBalance(){
		System.out.println("Docomo SIM existing balance: "+ balance);
	}

	public String call(long mn){
		return "Docomo: The number you are dialing is currently switched off. \nPlease dial after some time";
	}
	
	public String sms(long mn, String msg){
		return "Docomo: Your message send successfully";
	}
}