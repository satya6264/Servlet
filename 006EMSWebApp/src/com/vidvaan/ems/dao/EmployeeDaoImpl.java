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
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet resultSet = null;
		try {
			connection = ConnectionUtil.getConnection();
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

		ConnectionUtil.close(ps, connection);
		return null;
	}

	@Override
	public void save(Employee employee) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			connection = ConnectionUtil.getConnection();
			ps = connection.prepareStatement(EmployeeQueries.INSERT_EMP);
			ps.setInt(1, employee.getEid());
			ps.setString(2, employee.getEname());
			ps.setDouble(3, employee.getEsal());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectionUtil.close(ps, connection);

	}

	@Override
	public void update(Employee employee) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			connection = ConnectionUtil.getConnection();
			ps = connection.prepareStatement(EmployeeQueries.UPDATE_EMP);
			ps.setInt(3, employee.getEid());
			ps.setString(1, employee.getEname());
			ps.setDouble(2, employee.getEsal());
			int rws=ps.executeUpdate();
			System.out.println("updated rows:"+ rws);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectionUtil.close(ps, connection);

	}

	@Override
	public void delete(int id) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			connection = ConnectionUtil.getConnection();
			ps = connection.prepareStatement(EmployeeQueries.DELETE_BY_ID);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Employee getById(int eid) {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet resultSet = null;
		try {
			ps = connection.prepareStatement(EmployeeQueries.FIND_BY_ID_EMPLOYEE);
			ps.setInt(1, eid);
			resultSet = ps.executeQuery();
			Employee employee = new Employee();
			if (resultSet.next()) {
				employee.setEid(resultSet.getInt(1));
				employee.setEname(resultSet.getString(2));
				employee.setEsal(resultSet.getDouble(3));
			}
			return employee;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(ps, connection);
		}
		return null;
	}
}