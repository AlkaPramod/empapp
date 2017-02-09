package com.google.empapp.dao;

import com.google.empapp.model.EMPLOYEE;

public class TestEmployeeDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	EMPLOYEE employee=new EMPLOYEE();
	employee.setNAME("renu");
	employee.setDESIGNATION("producer");
	
	
	EmployeeDAO dao=new EmployeeDAO();
	dao.save(employee);
	
	

	}

}
