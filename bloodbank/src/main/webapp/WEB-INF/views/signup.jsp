<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Sign Up form</h1>



<form:form action="signup-process" method="POST" modelAttribute="signupdto">

	User name : <form:input path="username" />
	<br>
	Password : <form:input path="password" />
	<br>
	Submit : <input type="submit" value="signup">
</form:form>	    
</body>
</html>