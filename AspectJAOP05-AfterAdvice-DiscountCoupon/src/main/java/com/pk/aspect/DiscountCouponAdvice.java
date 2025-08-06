package com.pk.aspect;

import java.io.FileWriter;
import java.io.IOException;

import org.aspectj.lang.JoinPoint;

public class DiscountCouponAdvice {
	public void generateCoupon(JoinPoint jp,float  billAmt) throws Throwable {
		String couponMsg=null;
		if(billAmt>=50000)
			couponMsg="Avail 30% Discount on next purchase";
		else if(billAmt>=30000)
			couponMsg="Avail 20% Discount on next purchase";
		else
			couponMsg="Avail 10% Discount on next purchase";
		FileWriter fw=new FileWriter("e:\\cupon.txt");
		fw.write(couponMsg);
		fw.flush();
		fw.close();
	}
}
