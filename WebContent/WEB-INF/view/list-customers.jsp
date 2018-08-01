<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of Customers</title>
</head>
<body>
<div id = "wrapper">
<div id = "header">
<h2>CRM - Customer Relational Manager</h2>
</div>
</div>
<div id = "container">

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
</body>
</html>