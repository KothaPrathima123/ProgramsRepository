package com.pk.service;

import java.util.List;

import com.pk.entity.Employee;

public interface IEmployeeMgmtService {
    public Iterable<Employee>  showAllEmloyees();
    public  String   registerEmployee(Employee  emp);
    public   Employee   fetchEmployeeByNo(int no);
    public   String   updateEmployee(Employee emp);
    public  String    deleteEmployeeById(int  eno);
}
