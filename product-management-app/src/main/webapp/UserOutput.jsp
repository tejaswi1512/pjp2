<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> <font color=blue>Welcome to my home page</font> </h1>
<%! int count=0; %>

<h4>number of hits : <%=count %></h4>

<%count=count+1; %>


</body>
</html>