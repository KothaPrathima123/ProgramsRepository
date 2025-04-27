package com.pk.service;

import com.pk.bo.CustomerBO;
import com.pk.bo.StudentBO;
import com.pk.dao.CustStudDAO;

public abstract class CustStudService {
private CustStudDAO dao;
public CustStudService() {
	System.out.println("CustStudService:0-param constructor");
}
public abstract StudentBO getStudentBO();
public abstract CustomerBO getCustomerBO();
public void setDao(CustStudDAO dao) {
this.dao = dao;
}
public void processStudent(int id,String name,String course){
System.out.println("Procesing Student Info");
StudentBO stbo=getStudentBO();
stbo.setId(id); stbo.setName(name); stbo.setCourse(course);
//use dao
dao.insertData(stbo);
}
public void processCustomer(int id,String name,float billAmt){
System.out.println("Procesing Customer Info");
CustomerBO custbo=getCustomerBO();
custbo.setId(id); custbo.setName(name); custbo.setBillAmt(billAmt);
//use dao
dao.insertData(custbo);
}
}
