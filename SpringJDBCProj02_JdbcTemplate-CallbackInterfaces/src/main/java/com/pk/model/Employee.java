package com.pk.model;

public class Employee {
	
	private int empno;
	private String ename;
	private String job;
	private float sal;
	//private int dept;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	/*public int getDept() {
		return dept;
	}
	public void setDept(int dept) {
		this.dept = dept;
	}*/
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", job=" + job + ", sal=" + sal + "]";
	}
}
