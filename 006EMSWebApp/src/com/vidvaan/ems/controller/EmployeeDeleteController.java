package com.vidvaan.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vidvaan.ems.service.EmployeeServiceImpl;
 
public class EmployeeDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		int eid = Integer.parseInt(request.getParameter("eid"));
		service.delete(eid);
		request.getRequestDispatcher("findAll").forward(request, response);
	}

}
