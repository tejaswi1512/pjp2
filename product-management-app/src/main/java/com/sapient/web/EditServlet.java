package com.sapient.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapient.service.Product;
import com.sapient.service.ProductService;
import com.sapient.service.ProductServiceImpl;

@WebServlet("/modify-product")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ProductService service= 
			new ProductServiceImpl();
   
    public EditServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			int productId=Integer.parseInt(request.getParameter("productid"));
			Product p=service.getProductById(productId);
			request.setAttribute("product", p);
			request.getRequestDispatcher("WEB-INF/views/editProductJsp.jsp").forward(request, response);
			
			
			
		}
		catch(Exception e) {
			      e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
