package com.pk.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.pk.model.Employee;
@Repository("empDao")
public class EmpDAO implements IEmpDAO{
	
	private static final String GET_EMP_BY_EMPNO="SELECT EMPNO,ENAME,JOB,SALARY FROM EMPLOYEE WHERE EMPNO=?"; 
	private static final String GET_EMPS_BY_DESGS="SELECT EMPNO,ENAME,JOB,SALARY FROM EMPLOYEE WHERE JOB IN(?,?,?)";
	@Autowired
	private JdbcTemplate jt;
	/*@Override
	public Employee getEmpDetailsById(int eno) {
		Employee e=jt.queryForObject(GET_EMP_BY_EMPNO, 
				(rs,rownum)->{
						Employee emp=new Employee();
						emp.setEmpno(rs.getInt(1));
						emp.setEname(rs.getString(2));
						emp.setJob(rs.getString(3));
						emp.setSal(rs.getFloat(4));
						return emp;
						},
						eno);
		return e;
	}*/
	@Override
	public List<Employee> getEmpDetails(String desg1, String desg2, String desg3) {
		List<Employee> empsList=jt.query(GET_EMPS_BY_DESGS, 
				rs->{
					//copy the multiple records of RS to list of model class objs
					List<Employee> listEmps=new ArrayList<Employee>();
					while(rs.next()) {
						Employee emp=new Employee();
						emp.setEmpno(rs.getInt(1));
						emp.setEname(rs.getString(2));
						emp.setJob(rs.getString(3));
						emp.setSal(rs.getFloat(4));
						listEmps.add(emp);
						
					}
					return listEmps;
				}
				,desg1,desg2,desg3);
		return empsList;
	}
	
	@Override
	public Employee getEmpDetailsById(int eno) {
		Employee emp=jt.queryForObject(GET_EMP_BY_EMPNO,new RowMapper<Employee>() {
			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee emp=new Employee();
				emp.setEmpno(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setJob(rs.getString(3));
				emp.setSal(rs.getFloat(4));
				return emp;
			}//method
		}//anonymous inner class 
		, eno);
		return emp;
	}

	private class EmployeeMapper implements RowMapper<Employee>{

		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee emp=new Employee();
			emp.setEmpno(rs.getInt(1));
			emp.setEname(rs.getString(2));
			emp.setJob(rs.getString(3));
			emp.setSal(rs.getFloat(4));
			return emp;
		}
	}
		
	}


	

	

