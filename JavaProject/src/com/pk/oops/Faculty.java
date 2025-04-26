package com.pk.oops;

public class Faculty extends Person{

	private static String institute;
	
	private int eno;
	private String dept;
	private String subject;
	private double sal;
/*
	public Facutly(String name, double height, double weight,
						int eno, String dept, String subject, double sal) {
		super(name, height, weight);
		this.eno		= eno;
		this.dept		= dept;
		this.subject	= subject;
		this.sal		= sal;
	}
*/	
	public static String getInstitute() {
		return institute;
	}

	public static void setInstitute(String institute) {
		Faculty.institute = institute;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public void teach() { 
		System.out.println(getName() + " is teching "+ subject);
	}
	
	public void prepareMaterial() { 
		System.out.println(getName() + " is preparing "+ subject + " material");
	}
	
	@Override
	public String toString(){
		
		return	super.toString()					+ "\n" +
				(" institute\t: "	+ institute)	+ "\n" +
				(" eno\t\t: "		+ eno)			+ "\n" +
				(" dept\t\t: "		+ dept)			+ "\n" +
				(" subject\t: "		+ subject)		+ "\n" +
				(" sal\t\t: "		+ sal) ;
	}
}
