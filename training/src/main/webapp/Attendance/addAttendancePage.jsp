<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Attendance</h1>
	<form:form method="post" action="/attendance/add"
		modelAttribute="attendanceDay">

		<ul>
			<c:forEach items="${attendanceDay.attendances}" var="attendance" varStatus="counter">
				<li><form:checkbox path="attendances[${counter.index}].present" /> <c:out
						value="${attendance.student.name}" /> 
						<form:input type="hidden" path="attendances[${counter.index}].student" value="${student.personalId }"/>
						<form:input type="hidden" path="attendances[${counter.index}].attendanceDay" value="${attendanceDay.id }"/>
						<form:input type="hidden" path="cohort"/>
				</li><br>
			</c:forEach>
		</ul>
		<input type="submit" value="submit" />
	</form:form>
</body>
</html>