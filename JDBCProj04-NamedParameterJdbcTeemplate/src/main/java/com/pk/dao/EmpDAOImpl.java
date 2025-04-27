package com.pk.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pk.Employee.Employee;

@Repository("empDAO")
public class EmpDAOImpl implements IEmployeeDAO {
	
	private static final String GET_EMP_NAME_BY_NO="SELECT ENAME FROM EMPLOYEE WHERE EMPNO=:empno";
	private static final String GET_EMPS_BY_DESG="SELECT EMPNO,ENAME, JOB,SALARY FROM EMPLOYEE WHERE JOB IN(:desg1,:desg2,:desg3)";
	private static final String INSERT_EMPLOYEE="INSERT INTO EMPLOYEE (EMPNO,ENAME,JOB,SALARY) VALUES(:empno,:ename,:job,:sal)";
	@Autowired
	private NamedParameterJdbcTemplate njt;
	@Override
	public String getEmpNameByNo(int no) {
		Map<String,Object> paramMap=Map.of("empno",no);//java 9 feature
		String name=njt.queryForObject(GET_EMP_NAME_BY_NO, paramMap, String.class);
		return name;
	}
	@Override
	public List<Employee> getEmpDetailsByDesgs(String desg1, String desg2, String desg3) {
		MapSqlParameterSource source=new MapSqlParameterSource();
		source.addValue("desg1", desg1);
		source.addValue("desg2", desg2);
		source.addValue("desg3", desg3);
		List<Employee> empsList=njt.query(GET_EMPS_BY_DESG, source,
				rs->{
					List<Employee> list=new ArrayList();
					while(rs.next()) {
						Employee e=new Employee();
						e.setEmpno(rs.getInt(1));
						e.setEname(rs.getString(2));
						e.setJob(rs.getString(3));
						e.setSal(rs.getFloat(4));
						list.add(e);
					}
					return list;
				});
		return empsList;
	}
	@Override
	public int insertEmployee(Employee emp) {
		BeanPropertySqlParameterSource source=new BeanPropertySqlParameterSource(emp);
		int count=njt.update(INSERT_EMPLOYEE, source);
		return count;
	}

}
