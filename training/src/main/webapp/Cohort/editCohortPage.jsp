<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- jsp file supports put method by hidden method and isErrorPage , displays cohort edit form  -->
	<%@ include file="/Navigation/header.jsp"%>
	<h1>
		Edit Cohort:
		<c:out value="${cohort.name}"></c:out>
	</h1>
	<form:form action="/cohort/${cohort.id}" method="post"
		modelAttribute="cohort">
		<input type="hidden" name="_method" value="put">
		
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
			<form:textarea path="location" />
		</p>
		<br>
		<input type="submit" value="Edit" />
		<a href="/"> Cancel </a>
	</form:form>

</body>
</html>