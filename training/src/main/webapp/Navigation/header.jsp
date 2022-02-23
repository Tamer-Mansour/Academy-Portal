<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ"
	crossorigin="anonymous"></script>
<link href="/css/style.css" rel="stylesheet" />
<title>Insert title here</title>
</head>
<body>
	<nav class="navbar navbar-light" style="background-color: #e6e6e8;">

		<a class="nav-item nav-link text-color-axsos" href="/">Home Page</a> <a
			class="nav-item nav-link text-color-axsos" href="/cohorts">Cohorts
			Dashboard</a> <a class="nav-item nav-link text-color-axsos"
			href="/student/add">Add Student</a> <a
			class="nav-item nav-link text-color-axsos" href="/applicant/add">Add
			Applicant</a> <a
			class="nav-item nav-link text-color-axsos" href="/applicants">
			Applicants</a>

		<c:out value="${currentUser.name}"></c:out>
		<form class="form-inline my-2 my-lg-0" id="logoutForm" method="POST"
			action="/logout">
			<input class="form-control mr-sm-2" type="hidden"
				name="${_csrf.parameterName}" value="${_csrf.token}" /> <input
				class="form-control mr-sm-2" type="submit" value="Logout!" />
		</form>

	</nav>
</body>
</html>
