package com.sapient.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	public static Logger webLogger= Logger.getLogger(HttpServlet.class); 
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		try {
			String userid=request.getParameter("userid");
			String password=request.getParameter("password");
			if(userid.equals("admin") && password.equals("admin@123")) {
				HttpSession session=request.getSession();
				session.setAttribute("userid", userid);
				ServletContext sc=this.getServletContext();
				sc.setAttribute("akhil", "Reddy");
				out.println("<h1>Welcome To PMS,"+
								session.getAttribute("userid")+"<h/>");
				request.getRequestDispatcher("WEB-INF/views/menu.jsp")
				.forward(request,response);
			}else {
				out.println("<h1>Invalid Credentials</>");
				webLogger.error("Invalid credentials");
				request.getRequestDispatcher("login.html")
										.include(request,response);
			}
		}catch(Exception e) {
			
			webLogger.error("Unable to login", e);
			response.sendError(HttpServletResponse.SC_NOT_ACCEPTABLE,
									e.getMessage());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
