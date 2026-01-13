<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.Date" %>
<%@ page errorPage="Error.jsp" %>
<html>
<head>
<meta charset="UTF-8">
<title>Second page</title>
</head>
<body>
<%@ include file="Header.jsp" %>
	<h1>Hello dosto</h1>
	<h2><%= new Date().getDate() %></h2>
	<h2><%= new Date().getHours() %></h2>
	<%@ include file="Home.jsp" %>
	
	<h2>Error Demo</h2>

<%
	int a = 10 / 0;   // Divide by zero
%>
	
<%@ include file="Footer.jsp" %>
</body>
</html>