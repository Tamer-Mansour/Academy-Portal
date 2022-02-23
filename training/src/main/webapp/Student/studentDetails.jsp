<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
	<%@ include file="/Navigation/header.jsp"%>
	<h1>
		<c:out value="${student.name}" />
	</h1>
	<a href="/student/${student.personalId}/edit">Edit </a>

	<p>
		<c:out value="name : ${student.name}" />
	</p>
	<p>
		<c:out value="email : ${student.email}" />
	</p>
	<p>
		<c:out value="city : ${student.city}" />
	</p>
	<p>
		<c:out value="date : ${student.dateOfBirth}" />
	</p>
	<p>
		<c:out value="Phone Number : ${student.phoneNumber}" />
	</p>
	<p>
		<c:out value="Gender : ${student.gender}" />
	</p>
	<p>
		<c:out
			value="Educational Background : ${student.educationalBackground}" />
	</p>
	<p>
		<c:out value="Emergency Contact : ${student.emergencyContact}" />
	</p>
	<p>
		<c:out value="Allergy and Diet : ${student.allergyAndDiet}" />
	</p>
	<p>
		<c:out value="Notes : ${student.notes}" />
	</p>
	<p>
		<c:out value="Status : ${student.status}" />
	</p>
	<p>
		<c:out value="Cohort : ${student.cohort.cohortName}" />
	</p>
	<p>
		<c:out value="Github Account : ${student.githubAccount}" />
	</p>
	<p>
		<c:out value="LinkedIn Profile : ${student.linkedInProfile}" />
	</p>
	<p>
		<c:out value="Technical Experience : ${student.technicalExperience}" />
	</p>
	<p>
		<c:out value="First Day : ${student.firstDay}" />
	</p>
	<p>
		<c:out value="Technicals To Improve : ${student.technicalsToImprove}" />
	</p>
	<p>
		<c:out value="Personal To Improve : ${student.personalToImprove}" />
	</p>
	<p>
		<c:out value="Personal Skills : ${student.personalSkills}" />
	</p>
	<a href="/interview?id=${student.personalId}&type=3">Start First
		Interview </a>
	<br>
	<a href="/interview?id=${student.personalId}&type=0">Start
		Technical Interview </a>
	<br>
	<a href="/interview?id=${student.personalId}&type=1">Start Personal
		Interview </a>
	<br>
	<a href="/interview?id=${student.personalId}&type=2">Start One-One
		Interview </a>
	<br>
	<a href="/student/interview/${student.personalId}">Interviews
		Dashboard</a>

</body>
</html>