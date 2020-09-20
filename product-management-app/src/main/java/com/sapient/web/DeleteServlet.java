package com.sapient.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

//import com.audintel.ams.ui.App;
import com.sapient.service.Product;
import com.sapient.service.ProductService;
import com.sapient.service.ProductServiceImpl;

public class DeleteServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static ProductService service= 
							new ProductServiceImpl();
   
	public static Logger webLogger= Logger.getLogger(DeleteServlet.class);
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		try {
			String productId=request.getParameter("productid");
			
			Integer res=service.deleteProduct(Integer.parseInt(productId));
			if(productId!=null) {
				out.println("<h2>Product Deleted</h2>");
			}else {
				out.println("<h2>Product Not deleted</h2>");
				
			}
			request.getRequestDispatcher("WEB-INF/views/all-products.jsp").include(request, response);
		}catch(Exception e) {
			
			webLogger.error("Unable to perform delete", e);
			response.sendError(HttpServletResponse.SC_NOT_ACCEPTABLE,
					e.getMessage());
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
