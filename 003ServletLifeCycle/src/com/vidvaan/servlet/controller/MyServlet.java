package com.vidvaan.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet implements Servlet {

	@Override
	public void destroy() {
		System.out.println("Servlet is destroyed...");
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("Servlet config object created...");
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method invoked...");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service method invoked....");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("Servlet service interface...");
	}

}
