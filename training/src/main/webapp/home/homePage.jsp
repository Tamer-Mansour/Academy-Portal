<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<%@ include file="/Navigation/header.jsp"%>
	<h1>
		Welcome Back,
		<c:out value="${currentUser.name}"></c:out>!
	</h1>

</body>
</html>