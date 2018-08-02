<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of Customers</title>

<link type="text/css" rel = "stylesheet" href = "${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>
<div id = "wrapper">
<div id = "header">
<h2 align="center">Customers</h2>
</div>
</div>


<div id = "container">
	<div id = "content">

<table>
	<tr>
		<th> First Name </th>
		<th> Last Name </th>
		<th> Email </th>
	</tr>

		<c:forEach var="tempCustomer" items="${listCustomers}">
			<tr>
		<td> ${tempCustomer.firstName}</td>
		<td> ${tempCustomer.lastName}</td>
		<td> ${tempCustomer.email}</td>
 			</tr>
 		</c:forEach>
 	
 </table>
 
 </div>
 </div>
</body>
</html>