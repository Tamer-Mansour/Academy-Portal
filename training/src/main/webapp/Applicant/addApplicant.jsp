<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Applicant</title>
</head>
<body>

	<%@ include file="/Navigation/header.jsp"%>
	<h1>Add New Applicant</h1>
	<form:form method="POST" action="/applicant/add"
		modelAttribute="applicant">
		<p>
			<form:label path="name">Name</form:label>
			<form:input path="name" />
		</p>
		<p>
			<form:label path="email">Email</form:label>
			<form:input path="email" />
		</p>
		<p>
			<form:label path="city">City</form:label>
			<form:input path="city" />
		</p>
		<p>
			<form:label path="dateOfBirth">Date Of Birth</form:label>
			<form:input type="date" path="dateOfBirth" />
		</p>

		<p>
			<form:label path="phoneNumber">Phone Number</form:label>
			<form:input path="phoneNumber" />
		</p>
		<p>
			<form:label path="gender">Gender</form:label>
			<form:select path="gender">
				<form:options />
			</form:select>
		</p>
		<p>
			<form:label path="educationalBackground">Educational Background</form:label>
			<form:input path="educationalBackground" />
		</p>

		<p>
			<form:label path="status">Status</form:label>
			<form:select path="status">
				<form:options />
			</form:select>
		</p>
		<div>
			<form:label path="cohort">Cohort</form:label>
			<form:errors path="cohort" />
			<form:select path="cohort">
				<c:forEach items="${cohorts}" var="co">
					<form:option value="${co.id}">${co.getCohortName()}</form:option>
				</c:forEach>
			</form:select>
		</div>


		<br>
		<input type="submit" value="Add" />
		<a href="/"> Cancel </a>
	</form:form>
</body>
</html>