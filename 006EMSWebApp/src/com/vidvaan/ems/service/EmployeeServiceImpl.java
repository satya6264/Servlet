package com.vidvaan.ems.service;

import java.util.List;

import com.vidvaan.ems.dao.EmployeeDaoImpl;
import com.vidvaan.ems.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	 static EmployeeDaoImpl dao = new EmployeeDaoImpl();

	@Override
	public List<Employee> getAll() {
		return dao.findAll();
	}

	@Override
	public void save(Employee employee) {
		dao.save(employee);

	}

	@Override
	public void update(Employee employee) {
		dao.update(employee);
	}

	@Override
	public void delete(int id) {
		dao.delete(id);
	}

	public Employee findById(int eid) {
		return dao.getById(eid);
		
	}

}
