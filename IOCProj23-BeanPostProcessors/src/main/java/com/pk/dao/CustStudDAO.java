package com.pk.dao;

import com.pk.bo.CustomerBO;
import com.pk.bo.StudentBO;

public class CustStudDAO {
		public CustStudDAO() {
		System.out.println("CustStudDAO:0-param constructor");
		}
		public void insertData(StudentBO stbo){
		System.out.println("Student Data is ");
		System.out.println(stbo.getId()+" "+stbo.getName()+" "+stbo.getCourse()+" "+stbo.getDoj());
		}
		public void insertData(CustomerBO custbo){
		System.out.println("Customer Data is");
		System.out.println(custbo.getId()+" "+custbo.getName()+" "+custbo.getBillAmt()+" "+custbo.getDoj());
		}

}
