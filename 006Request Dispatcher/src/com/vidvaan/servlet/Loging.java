package com.vidvaan.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Loging extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/hitml");
		 PrintWriter out = resp.getWriter();
		 
		 String n=req.getParameter("userName");
		 String p = req.getParameter("userPass");
		 
//		 out.print("<html><body><h1>FaceBook</h1></body></html>");
		 
		 if (p.equals("satya")&n.equals("satya")) {

		        RequestDispatcher rd=req.getRequestDispatcher("servlet2"); 
		        rd.forward(req, resp);
			
		}
		 else {
			out.print("Sorry userName or password error!...");
	        RequestDispatcher rd=req.getRequestDispatcher("/index.html");
	        rd.include(req, resp);

			
		}
	}

}
