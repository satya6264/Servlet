package com.vidvaan.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vidvaan.ems.model.Employee;
import com.vidvaan.ems.service.EmployeeServiceImpl;

public class EmployeeFindByIdController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		int eid = Integer.parseInt(request.getParameter("eid"));
//		List<Employee> employees = service.findById(eid);
		Employee emp= service.findById(eid);
//		PrintWriter out=response.getWriter();
//		out.println(emp);
//		request.setAttribute("emp", emp);
//		request.getRequestDispatcher("emp2.jsp").forward(request, response);
		request.setAttribute("empl", emp);
		RequestDispatcher rd = request.getRequestDispatcher("FindById.jsp");
		rd.forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);

	}
}
