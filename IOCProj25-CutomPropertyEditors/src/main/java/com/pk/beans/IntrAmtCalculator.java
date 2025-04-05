package com.pk.beans;

public class IntrAmtCalculator {
	private IntrAmtDetails details;
	public void setDetails(IntrAmtDetails details) {
		this.details=details;
	}
	public float calIntrAmt() {
		return (details.getPrinciple()*details.getRate()*details.getTime())/100.0f;
	}
}
