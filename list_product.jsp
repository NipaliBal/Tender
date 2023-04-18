<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List</title>
</head>
<body>
	<h2>ProductsList</h2>
	<table>
	<tr>
	<th>PId</th>
	<th>PName</th>
	<th>Quant</th>
	<th>Quality</th>
	<th>Update</th>
	<th>Delete</th>
	<th>imageData</th>
	</tr>
	<c:forEach var="pros" items="${products}">
	<tr>
		<td>${pros.pid}</td>
		<td>${pros.pName}</td>
		<td>${pros.quant}</td>
		<td>${pros.quality}</td>
		<td>${pros.imageData}</td>
		<td><a href=deleteId?pid="${pros.pid}">delete</a></td>
		<td><a href=deleteId?pid="${pros.pid}">delete</a></td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>