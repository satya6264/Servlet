<!--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>-->
<!--<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>-->
<%@page import="com.vidvaan.ems.util.ConnectionUtil"%>
<%@page import="com.vidvaan.ems.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
#customers {
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #2196f3;
	color: white;
}
</style>

</head>
<body>
	<table id="customers">
		<tr>
			<th>EID</th>
			<th>ENAME</th>
			<th>SALARY</th>
			<th>UPDATE</th>
			<th>DELETE</th>
		</tr>
<%-- 		<c:forEach var="emp" items="${emp}"> --%>
<%-- 		<c:forEach var="emp" items="${emp}"> --%>

<%
Employee e1 = (Employee)request.getAttribute("emp");
out.println(e1);

%>

			<tr>
				<td>${employee.eid}</td>
				<td>${employee.ename}</td>
				<td>${employee.esal}</td>
				
				<td><a href="./update?eid=${employee.eid}"><i class="fa fa-refresh" aria-hidden="true"></i></a></td>
				<td><a href="./delete?eid=${employee.eid}"><i class="fa fa-trash" aria-hidden="true"></i></a></td>
			</tr>

<!-- 		</c:forEach> -->
	</table>
	<a class="w3-btn w3-red"  href="index.jsp">HOME</a>
	<a class="w3-btn w3-red"  href="newEmp.jsp">ADD</a>

</body>
</html>