<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="http://localhost:8085/product-management-app/css/style1.css" rel="stylesheet">
<script type="text/javascript" src="http://localhost:8085/product-management-app/js/product-validate.js"></script>
</head>
<body>
	<div class="bg-img" >
		<form action="getproduct" method="get" class="container1" >
			<h2 align="center">Product Asking</h2>
			
			<!-- <label for="product"><b>Enter Product Name</b></label>  -->
			<input type="text" placeholder="Enter Product Id"  id="productId" name="productId" required  >
			
			<br>
			<input type="submit" value="Register">		
		</form>
	</div>	
</body>
</html>