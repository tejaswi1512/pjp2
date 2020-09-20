package com.sapient.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapient.service.Product;
import com.sapient.service.ProductException;
import com.sapient.service.ProductService;
import com.sapient.service.ProductServiceImpl;



@WebServlet("/getproduct")
public class getProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       ProductService service=new ProductServiceImpl(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Integer productId=Integer.parseInt(request.getParameter("productId"));
			Product product=service.getProductById(productId);
		request.setAttribute("product", product);
		request.getRequestDispatcher("WEB-INF/views/show-product.jsp").forward(request, response);
		
		}
		catch(ProductException e) {
			e.printStackTrace();
			request.setAttribute("error", e);
			request.getRequestDispatcher("WEB-INF/views/show-product.jsp").forward(request, response);
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
