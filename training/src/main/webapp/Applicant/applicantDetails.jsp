<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Applicant Details</title>
</head>
<body>

	<%@ include file="/Navigation/header.jsp"%>
	<h1>
		Applicant
		<c:out value="${cohort.name}"></c:out>
		details:
	</h1>
	<p>
		<c:out value="Name : ${applicant.name}" />
	</p>
	<p>
		<c:out value="Email : ${applicant.email}" />
	</p>
	<p>
		<c:out value="City : ${applicant.city}" />
	</p>
	<p>
		<c:out value="Date of Birth : ${applicant.dateOfBirth}" />
	</p>
	<p>
		<c:out value="Phone Number : ${applicant.phoneNumber}" />
	</p>
	<p>
		<c:out value="Gender : ${applicant.gender}" />
	</p>
	<p>
		<c:out
			value="Educational Background : ${applicant.educationalBackground}" />
	</p>

	<p>
		<c:out value="Status : ${applicant.status}" />
	</p>
	<p>
		<c:out value="Cohort : ${applicant.cohort.cohortName}" />
	</p>

	<a href="/applicant/${applicant.personalId}/student"> Turn To Student</a>
</body>
</html>