package com.vidvaan.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String n = req.getParameter("userName");
        out.print("<html><body><h1>FaceBook</h1></body></html>");
		out.print("welcome "+n);
        out.print("<html><body><br></body></html>");

		out.print("<a href='index.html'>Logout</a>");	
	}
	

}
