<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<!-- write some condition to display error message -->


<body>
<h1>${param.error}</h1>
<c:if test="${param.error != null}">
	Invalid login or password
</c:if>

	<h1>My Custom Login Page</h1>
	<%-- <form:form action="login-process" method="POST"> --%>
	<form:form action="login-process" method="POST">
		Username : <input type="text" name="username">
		<br>
	    Password : <input type="password" name="password">
	    <br>
	    Submit : <input type="submit" value="Login">
	</form:form>
	
</body>
</html>