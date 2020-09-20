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
		<form action="valuesModified" method="post" class="container1" >
			<h2 align="center">Product Registration</h2>
			
			<!-- <label for="product"><b>Enter Product Name</b></label>  -->
			<input type="text" placeholder="${product.productId}" value="${product.productId}" id="productname"  readonly name="productid" >
			<input type="text" placeholder="${product.productName}"  value="${product.productName}"  id="productname"   name="productname" " >
			<!-- <label for="description"><b>Enter Description</b></label>  -->
			<input type="text"placeholder="${product.description}" value="${product.description}"  id="description" name="description">
			<!-- <label for="expirydate"><b>Enter Expiry Date</b></label>  -->
			<input type="text" placeholder="${product.expiryDate}" size=30  id="expirydate" name="expirydate" >
			<!-- <label for="price"><b>Enter Price</b></label>  -->
			<input type="text" placeholder="${product.productPrice}" id="price" size=30 name="price"  onblur="isValidPrice()">
			
			<br>
			<input type="submit" value="modify">		
		</form>
	</div>	
</body>
</html>




