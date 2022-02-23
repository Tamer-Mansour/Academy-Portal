<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="/Navigation/header.jsp"%>
	<!-- view to display details info and list all students for selected cohort  -->
	<h1>
		<c:out value="${cohort.cohortName}" />
	</h1>
	<p>
		<c:out value="Start Date : ${cohort.startDate}" />
	</p>
	<p>
		<c:out value="End Date : ${cohort.endDate}" />
	</p>
	<p>
		<c:out value="Location : ${cohort.location} " />
	</p>
	<p>
		<c:out value="Total Number of students : ${cohort.students.size()}" />
	</p>
	<a href="/empty-attendance-day/${cohort.id}">Take Attendance</a>
	<p>
		<c:out value="${cohort.cohortName} Students :" />
	</p>
	<ul>
		<c:forEach items="${cohort.students}" var="student">
			<li><a href="/student/${student.personalId}"> <c:out
						value="${student.personalId} ${student.name} email: ${student.email} phoneNumber: ${student.phoneNumber}" />
			</a></li>
			<br>
		</c:forEach>
	</ul>

</body>
</html>