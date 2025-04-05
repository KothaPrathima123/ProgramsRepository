package com.pk.beans;

public class Bank {
	public float calIntrAmt(float pamt,float time) {
		System.out.println("Bank.calIntrAmt()");
		return pamt*time*2.0f/100;
	}

}
