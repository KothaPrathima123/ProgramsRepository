package com.pk.service;

import java.util.Random;

public class PinGenerator {
	public int generatePin(int cardNo) {
		Random radom=new Random();
		int pin=radom.nextInt();
		return pin;
	}
}
