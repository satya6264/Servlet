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
	<form action="./save" method="post">
		<table align="center">
			<tr>
				<td>Eid:</td>
				<td><input type="text" name="eid" placeholder="Enter eid" required
					></td>
			</tr>

			<tr>
				<td>Ename:</td>
				<td><input type="text" name="ename" placeholder="Enter name" required
					></td>
			</tr>

			<tr>
				<td>Esal:</td>
				<td><input type="text" name="esal" placeholder="Enter salary" required
					></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="save"></td>
			</tr>
		</table>
	</form>

</body>
</html>