<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 style="color:green">${msg }</h1>
<hr>
	<h3>Welcome, ${user.uname }</h3>
	<h3>Your Email Address is ${user.email }</h3>
	<h3>Your Password is ${user.password}</h3>

</body>
</html>