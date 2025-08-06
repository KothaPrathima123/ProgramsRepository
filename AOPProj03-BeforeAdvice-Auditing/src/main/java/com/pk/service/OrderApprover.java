package com.pk.service;

import java.util.Calendar;

public class OrderApprover {
	public String approveOrder(int orderId) {
		Calendar cal=Calendar.getInstance();
		int month=cal.get(Calendar.MONTH);
		if(month>=7&&month<=10)
			return orderId+" order is not approved";
		else
			return orderId+" order is approved";
	}

}
