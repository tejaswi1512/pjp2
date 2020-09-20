<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>
	<!--<jsp:useBean id="product" class="com.sapient.service.Product"
			 scope="request"/>-->
			
	<div class="container" class="bg-img">
				  	<h2>Product Details</h2>
				  
				  <table class="table">
					    <thead>
						      <tr>
						        <th>Product Id</th>						        
						        <th>Product Name</th>
						        <th>Product Description</th>
						         <th>Expiry Date</th>
						        <th>Product Price</th>						        
						      
						      </tr>
					    </thead>
					    <tbody>					    	
					    	
						      <tr class="success">
						        <td>${product.productId}</td>				        
						        <td>${product.productName}</td>
						        <td>${product.description}</td>
						        <td>${product.expiryDate}</td>
						        <td>${product.productPrice}</td>						        				        
						       
						      </tr>      
						   
					    </tbody>
				  </table>
			</div>
</body>
</html>