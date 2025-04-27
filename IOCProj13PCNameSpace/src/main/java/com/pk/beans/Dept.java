package com.pk.beans;

import java.util.Date;

public class Dept {
	private int deptno;
	private String name;
	private Date dop;
	public int getDeptno() {
		return deptno;
	}
	public Dept() {
		System.out.println("Dept.DEpt()");
	}
	public Dept(int deptno, String name, Date dop) {
		super();
		this.deptno = deptno;
		this.name = name;
		this.dop = dop;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDop() {
		return dop;
	}
	public void setDop(Date dop) {
		this.dop = dop;
	}
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", name=" + name + ", dop=" + dop + "]";
	}
	

}
