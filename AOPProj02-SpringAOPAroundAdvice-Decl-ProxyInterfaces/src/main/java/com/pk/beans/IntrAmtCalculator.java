package com.pk.beans;

public class IntrAmtCalculator implements IIntrAmtCalculator{
	public float calIntrAmt(float principle,float rate,float time) {
		System.out.println("Target class method");
		
		return principle*rate*time/100.0f;
	}

}
