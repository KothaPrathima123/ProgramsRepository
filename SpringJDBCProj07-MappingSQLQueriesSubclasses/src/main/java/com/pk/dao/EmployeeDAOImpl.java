package com.pk.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.stereotype.Repository;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO{
	private static final String GET_EMP_NAME_BY_NO="SELECT ENAME FROM EMPLOYEE WHERE EMPNO=?";
	
	private DataSource ds;
	private EmployeeSelector1 selector1;
	@Autowired
	public EmployeeDAOImpl(DataSource ds) {
		System.out.println("EmployeeDAOImpl.EmployeeDAOImpl()");//this constructor is called for one time to initialize ds,query 
		this.ds=ds;
		selector1=new EmployeeSelector1(ds, GET_EMP_NAME_BY_NO);
	}
	@Override
	public String getEmpNameByNo(int no) {
		String name=selector1.findObject(no);
		return name;
	}
	
	private static class EmployeeSelector1 extends MappingSqlQuery<String>{
		
		public EmployeeSelector1(DataSource ds,String query) {
			super(ds,query);//calling super class method 
			System.out.println("EmployeeDAOImpl.EmployeeSelector1.EmployeeSelector1()");
			super.declareParameter(new SqlParameter(Types.INTEGER));
			super.compile();//this method is called for one time to compile the query
		}

		@Override
		protected String mapRow(ResultSet rs, int rowNum) throws SQLException {
			System.out.println("EmployeeDAOImpl.EmployeeSelector1.mapRow()");
			String name=rs.getString(1);
			return name;
		}//this method is called for many times to execute the query
		
	}
	
	

}
