<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee management system</title>
<style type="text/css">
body {
	background-image: url("ems.jpg");
	background-position: center;
	background-repeat: no-repeat, repeat;
	height: 500px;
	background-size: 300px 100px;
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #e57373;
}

li {
	float: left;
}

li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 16px;
	text-decoration: none;
}

li a:hover {
	background-color:#e1bee7;
}
</style>
</head>
<body>
	<h1>Employee Management System</h1>
	<ul>
		<li><a href="newEmp.jsp">New Employee</a></li>
		<li><a href="./findAll">Select All Employees</a></li>
		<li><a href="FindById.jsp">Select Employee</a></li>
		
        <li><a href="update.jsp">Update</a></li>

        <li><a href="delete.jsp">Delete</a></li>
	</ul>
</body>
</html>