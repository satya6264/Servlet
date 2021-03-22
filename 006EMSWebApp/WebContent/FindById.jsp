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
	background-color: lightgreen;
	padding: 50px;
	border: medium;
}
</style>
</head>
<body>
	<h1 align="center">Register Employee</h1>
	<form action="./FindById" method="get">
		<table align="center">
		
				
		
			<tr>
				<td>Eid:</td>
				<td><input type="text" name="eid" placeholder="Enter eid" required
					></td>
			</tr>


			<tr>
				<td></td>
				<td><input type="submit" value="Find"></td>
			</tr>
		</table>
	</form>
	
	<a class="w3-btn w3-red"  href="index.jsp">HOME</a>

</body>
</html>