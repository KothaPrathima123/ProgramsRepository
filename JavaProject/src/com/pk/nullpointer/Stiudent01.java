package com.pk.nullpointer;

class Student01 {
	int		sno;
	String	sname;
	Address1	addr;

	void setSno(int snum){
		sno = snum;
	}

	void setSname(String name){
		sname = name;
	}

	void setAddress(Address1 addrs){
		addr = addrs;
	}
	
	public void display(){
		System.out.println("sno  : "+ sno);
		System.out.println("sname: "+ sname);
		System.out.println("addr : "+ addr);
		//System.out.println("addr strNum : "+addr.strnum);
		System.out.println("addr city  : "+addr.city);
	}
}