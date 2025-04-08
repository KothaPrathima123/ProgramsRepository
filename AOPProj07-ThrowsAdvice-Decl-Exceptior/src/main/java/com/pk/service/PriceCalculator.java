package com.pk.service;

public class PriceCalculator {
	public float calcPrice(float price,float qty) {
		if(price==0.0f||qty==0.0f)
			throw new IllegalArgumentException("price and qty must not be zero");
		return price*qty;
	}

}
