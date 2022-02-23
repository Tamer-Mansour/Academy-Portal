<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Cohort</title>
</head>
<body>
	<%@ include file="/Navigation/header.jsp"%>

	<h1>Create new cohort</h1>

	<form:form method="POST" action="/cohort/add" modelAttribute="cohort">

		<form:label path="startDate">Start Date Of The Cohort</form:label>
		<form:errors path="startDate" />
		<form:input type="Date" path="startDate" />
		<p>
			<form:label path="endDate">End Date Of The Cohort</form:label>
			<form:errors path="endDate" />
			<form:input type="Date" path="endDate" />
		<p>
		<p>
			<form:label path="location">Cohort Location</form:label>
			<form:errors path="location" />
			<form:input path="location" />
		</p>
		<br>
		<input type="submit" value="Add" />
		<a href="/"> Cancel </a>
	</form:form>
	<form style="text-align: right;" id="logoutForm" method="POST"
		action="/logout">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" /> <input type="submit" value="Logout!" />
	</form>
</body>
</html>