<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
      <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>update product details</h2>
	<form action="update" method="post"/>
	<pre>
	PName<input type="text" name="pName" value="${products.pName}"/>
	Quant<input type="text" name="quant" value="${products.quant}"/>
	Quality<input type="text" name="quality" value="${products.quality}"/>
	<input type="submit" value="update" />
	</pre>
	</form>
</body>
</html>