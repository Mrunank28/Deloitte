<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User List</title>
</head>
<body style="background-color: pink">
	<c:choose>
		<c:when test="${elist.size()>0 }">

			<h2>
				<center>User List</center>
			</h2>
			<table border="2" align="center" bgcolor="white">
				<tr>
					<td><b>User Id</b></td>
					<td><b>Age</b></td>
					<td><b>Email</b></td>
					<td><b>Gender</b></td>
					<td><b>Mobile</b></td>
					<td><b>User Name</b></td>

				</tr>
				<c:forEach var="elist" items="${elist}">
					<tr>
					<tr>
						<td>${elist.id}</td>
						<td>${elist.age}</td>
						<td>${elist.email}</td>
						<td>${elist.gender}</td>
						<td>${elist.mobile}</td>
						<td>${elist.name}</td>

					</tr>
				</c:forEach>
			</table>
			<br>
		</c:when>
		<c:otherwise>
			<h3>
				<center>No Data Found</center>
			</h3>
		</c:otherwise>
	</c:choose>
	<center>
		<a href="goHome.obj">Go Home</a>
	</center>
	<br>
	<br>
</body>
</html>