package com.google.empapp.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.google.empapp.model.EMPLOYEE;
import com.google.empapp.util.ConnectionUtil;

public class EmployeeDAO {

	private JdbcTemplate jdbcTemplate=ConnectionUtil.getJdbcTemplate();

	public void save(EMPLOYEE employee) 
	{
	String sql="insert into EMPLOYEE (NAME,DESIGNATION)values(?,?)";
	Object[] params={employee.getNAME(),employee.getDESIGNATION()};
	int rows=jdbcTemplate.update(sql,params);
	System.out.println(+rows);
	}
	
}
