package com.pk.bo;

public class CustomerBO extends BaseBO{
	private float BillAmt;
	public CustomerBO() {
		System.out.println("CustomerBO::0-param constructor");
	}
	public void setBillAmt(float BillAmt) {
		this.BillAmt=BillAmt;
	}
	public float getBillAmt() {
		return BillAmt;
	}
}
