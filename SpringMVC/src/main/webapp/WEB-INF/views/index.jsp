<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is Home Page</h1>
	<h1>Called By Home Controller</h1>
	<h1>url /home</h1>

	<%
	String name=(String)request.getAttribute("name");
	Integer id=(Integer)request.getAttribute("id");
	List<String> friends=(List<String>)request.getAttribute("f");
	%>
	<h1>Name is <%=name%></h1>
	<h1>Id id <%=id %></h1>
	
	<%
	for(String s:friends)
	{%>
	<h3>Friend List:<%=s%></h3>
	<%
	}
	%>
	
</body>
</html>