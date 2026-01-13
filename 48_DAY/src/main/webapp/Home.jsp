<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>

<div>
	<p>User: <%= request.getAttribute("user") %></p>
	<p>Message: <%= request.getAttribute("msg") %></p>
</div>

</body>
</html>
