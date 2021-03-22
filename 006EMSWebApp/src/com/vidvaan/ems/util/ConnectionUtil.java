package com.vidvaan.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionUtil {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mydb", "satya");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void close(Connection connection) {

		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void close(PreparedStatement ps, Connection connection) {

		try {
			if (ps != null) {
				ps.close();
			}
			close(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void close(ResultSet resultSet, PreparedStatement ps, Connection connection) {

		try {
			if (resultSet != null) {
				resultSet.close();
			}
			close(ps, connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		System.out.println(ConnectionUtil.getConnection());
		
	}

}

