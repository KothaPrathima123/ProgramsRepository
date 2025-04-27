package com.pk.service;

public class IntrAmtCalculator{
	public float calsimpleIntrAmt(float p,float t,float r) {
		return (p*t*r)/100.0f;
	}
	public float calCompoundIntrAmt(float p,float t,float r) {
		return (float)(p*Math.pow((1+r/100.0f), t)-p);
	}
	
}
