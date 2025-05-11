package com.pk.interfacerules;

public class ScanDiskPendrive implements Pendrive{

	@Override
	public void copyAndPaste() {
		System.out.println("files are copy and pasted from ScanDiskPendrive");
	}

	@Override
	public void delete() {
		System.out.println("files are deleted from ScanDiskPendrive");
	}

}
