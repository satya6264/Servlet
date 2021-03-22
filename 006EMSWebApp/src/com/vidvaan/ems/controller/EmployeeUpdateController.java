package com.vidvaan.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vidvaan.ems.model.Employee;
import com.vidvaan.ems.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeUpdateController
 */
public class EmployeeUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 EmployeeServiceImpl service = new EmployeeServiceImpl();
		int eid = Integer.parseInt(request.getParameter("eid"));
		String ename = request.getParameter("ename");
		double esal = Double.parseDouble(request.getParameter("esal"));
		Employee employee = new Employee(eid, ename, esal);
		service.update(employee);
		request.getRequestDispatcher("findAll").forward(request, response);

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		int eid = Integer.parseInt(req.getParameter("eid"));
		Employee employee=service.findById(eid);
		req.setAttribute("employee", employee);
		req.getRequestDispatcher("update.jsp").forward(req, resp);

	}

}
