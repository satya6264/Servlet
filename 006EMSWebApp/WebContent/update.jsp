<!--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body {
	background-image: url("ems.jpg");
	background-repeat: no-repeat;
}

table {
	background-color: lightblue;
	padding: 50px;
	border: medium;
}

.success{
background-color: green;
}
</style>

</head>
<body>

	<h1 align="center">Update Employee</h1>
	<form action="./update" method="post">
		<table align="center">
			<tr>
				<td>Eid:</td>
				<td><input type="text" name="eid" value="${employee.eid}" readonly="readonly"></td>
				<td><input type="text" name="eid" value="${employee.eid}" ></td>
			</tr>

			<tr>
				<td>Ename:</td>
				<td><input type="text" name="ename" value="${employee.ename}"></td>
			</tr>

			<tr>
				<td>Esal:</td>
				<td><input type="text" name="esal" value="${employee.esal}"></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="update"></td>
			</tr>
		</table>
	</form>
	
	<a href="index.jsp">HOME</a>

</body>
</html>