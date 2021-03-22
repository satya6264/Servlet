package com.vidvaan.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vidvaan.ems.model.Employee;
import com.vidvaan.ems.service.EmployeeServiceImpl;

public class EmployeeFindAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		List<Employee> employees = service.getAll();
		request.setAttribute("emps", employees);
		request.getRequestDispatcher("emp.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);

	}
}
