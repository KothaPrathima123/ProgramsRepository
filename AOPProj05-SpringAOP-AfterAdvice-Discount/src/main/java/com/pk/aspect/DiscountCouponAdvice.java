package com.pk.aspect;

import java.io.FileWriter;
import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class DiscountCouponAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		float billAmt=(Float)returnValue;
		billAmt=billAmt+100;
		returnValue=billAmt;
		String msg=null;
		if(billAmt>=50000)
			msg="Avail 50% discount on next purchase";
		else if(billAmt>=30000)
			msg="Avail 20% discount on next purchase";
		else
			msg="Avail 10% discount on next purchase";
		FileWriter fw=new FileWriter("E:\\cupon.txt");
		fw.write(msg);
		fw.flush();
		fw.close();
	}
	
}
