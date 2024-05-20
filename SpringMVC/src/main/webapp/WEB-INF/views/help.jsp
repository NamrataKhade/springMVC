<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is Help Page</title>
</head>
<body>
<h1>This is Help Page</h1>
<%
String name=(String)request.getAttribute("name");
LocalDateTime time=(LocalDateTime)request.getAttribute("time");


%>

<h1>Hello My name is <%=name %></h1>
<h1>Date  & Time is <%=time.toString() %></h1>
</body>
</html>