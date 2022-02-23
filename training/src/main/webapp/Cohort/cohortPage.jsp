<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Cohorts</title>
</head>
<body>
	<%@ include file="/Navigation/header.jsp"%>
	<h1>Cohorts</h1>
	<!-- forEach loop to go over all cohorts and display info -->
	<p>
		<c:forEach items="${cohortList}" var="cohort">
			<a href="/cohort/view/${cohort.id}"> <c:out
					value="Cohort${cohort.id}|${cohort.students.size()} students |${cohort.startDate} until | ${cohort.endDate}" />
			</a>
			<a href="/cohort/${cohort.id}/edit">Edit</a>
			<br>
		</c:forEach>
	</p>
	<!-- go add new cohort -->
	<a href="/cohort/add">Add new Cohort</a>
</body>
</html>