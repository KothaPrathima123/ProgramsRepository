package com.pk.oops;

interface Pendrive {
	void copyAndPaste();
	void delete();
}  

//HPPendrive.java
class HPPendrive implements Pendrive {
	@Override
	public void copyAndPaste(){ 
		System.out.println("Files are cAp from HP Pendrive");
	}

	@Override
	public void delete(){ 
		System.out.println("Files are deleted from HP Pendrive");
	}
}

//ScanDiskPendrive.java
class ScanDiskPendrive implements Pendrive {
	@Override
	public void copyAndPaste(){ 
		System.out.println("Files are cAp from ScanDisk Pendrive");
	}

	@Override
	public void delete(){ 
		System.out.println("Files are deleted from ScanDisk Pendrive");
	}
}


//SamsungPendrive.java
class SamsungPendrive implements Pendrive {
	@Override
	public void copyAndPaste(){ 
		System.out.println("Files are cAp from Samsung Pendrive");
	}

	@Override
	public void delete(){ 
		System.out.println("Files are deleted from Samsung Pendrive");
	}
}

//Laptop.java
class Laptop {
	void connect(Pendrive pd){
		pd.copyAndPaste();
		pd.delete();
	}
}

//User.java
class User {
	public static void main(String[] args) {
		
		Laptop laptop = new Laptop();
		laptop.connect(new HPPendrive());
	}
}