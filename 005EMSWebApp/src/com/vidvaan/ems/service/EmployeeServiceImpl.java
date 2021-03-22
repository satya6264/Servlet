package com.vidvaan.ems.service;

import java.util.List;

import com.vidvaan.ems.dao.EmployeeDaoImpl;
import com.vidvaan.ems.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	EmployeeDaoImpl dao=new EmployeeDaoImpl();
	
	@Override
	public List<Employee> getAll() {
		return dao.findAll();
	}

}
