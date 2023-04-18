<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<h2>Register Product</h2>
	<form action="savePro" method="post">
	<pre>
	PName<input type="text" name="pName"/>
	Quant<input type="text" name="quant"/>
	Quality<input type="text" name="quality"/>
	<input type="submit" value="save"/>
	</pre>
	</form>
	
</body>
</html>