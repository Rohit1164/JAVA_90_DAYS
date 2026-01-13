<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> JSP Started</title>
</head>
<body>
<h2>Current Date:</h2>
<p><%= new Date() %></p>
<h1>Hello dosto! , kya hal hai </h1>
<h2> Numbers </h2>
<%
for(int i = 0 ; i <= 5 ; i++){
%>
	<p><%= i %></p>
<% 
	 }
%>
<p><%= request.getAttribute("msg") %></p>

</body>
</html>