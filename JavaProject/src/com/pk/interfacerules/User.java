package com.pk.interfacerules;

public class User {
	public static void main(String[] args) {
		Laptop laptop=new Laptop();
		laptop.connect(new ScanDiskPendrive());
	}
}
