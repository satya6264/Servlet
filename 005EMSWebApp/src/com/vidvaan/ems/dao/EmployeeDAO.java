package com.vidvaan.ems.dao;

import java.util.List;

import com.vidvaan.ems.model.Employee;

public interface EmployeeDAO {
	void save(Employee employee);

	void update(Employee employee);

	List<Employee> findAll();

	void delete(int id);

}


