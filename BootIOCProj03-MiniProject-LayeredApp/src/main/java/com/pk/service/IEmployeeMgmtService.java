package com.pk.service;

import java.util.List;

import com.pk.model.Employee;

public interface IEmployeeMgmtService {
   public  List<Employee>  searchEmployeesByDesgs(String desg1,String desg2,String desg3)throws Exception;
}
