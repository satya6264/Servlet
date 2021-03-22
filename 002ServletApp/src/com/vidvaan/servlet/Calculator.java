package com.vidvaan.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		int num1 = Integer.parseInt(req.getParameter("number1"));
		int num2 = Integer.parseInt(req.getParameter("number2"));
		out.print("total of two numbers = " + (num1 + num2));
		out.close();
	}

}
