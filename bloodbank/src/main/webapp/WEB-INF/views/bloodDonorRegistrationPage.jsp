<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Blood Donor Registration</p>
<form action="createBloodDonorRegistration" method="post" commandName="person">
			<table style="with: 50%">
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>Age</td>
					<td><input type="text" name="age" /></td>
				</tr>
				<tr>
					<td>Mobile No</td>
					<td><input type="text" name="mobileno" /></td>
				</tr>
			</table>
			<input type="submit" value="Submit" /></form>
</body>
</html>