package com.vidvaan.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vidvaan.ems.model.Employee;
import com.vidvaan.ems.queries.EmployeeQueries;
import com.vidvaan.ems.util.ConnectionUtil;

public class EmployeeDaoImpl implements EmployeeDAO {

	@Override
	public List<Employee> findAll() {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet resultSet = null;
		try {
			ps = connection.prepareStatement(EmployeeQueries.FIND_ALL_EMPLOYEE);
			resultSet = ps.executeQuery();
			List<Employee> employees = new ArrayList<>();
			while (resultSet.next()) {
				Employee employee = new Employee();
				employee.setEid(resultSet.getInt(1));
				employee.setEname(resultSet.getString(2));
				employee.setEsal(resultSet.getDouble(3));
				
				employees.add(employee);
			}
			return employees;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	
	}


