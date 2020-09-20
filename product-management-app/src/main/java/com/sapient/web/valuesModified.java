package com.sapient.web;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapient.service.Product;
import com.sapient.service.ProductService;
import com.sapient.service.ProductServiceImpl;

public class valuesModified extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ProductService service= 
			new ProductServiceImpl();
       
    
    public valuesModified() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try {
			System.out.println(request.getParameter("productid"));    
			int productId=Integer.parseInt(request.getParameter("productid"));
			String productName=request.getParameter("productname");
			String description=request.getParameter("description");
			double price=
					Double.parseDouble(request.getParameter("price"));
			SimpleDateFormat dateFormat=
							new SimpleDateFormat("dd/MM/yyyy");
			java.util.Date expDate=
					dateFormat.parse(request.getParameter("expirydate"));
			Product product =
					new Product(productName,description,expDate,price);
			product.setProductId(productId);
			service.updateProduct(product);
			request.getRequestDispatcher("all-products").forward(request, response);
			
			
			
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
