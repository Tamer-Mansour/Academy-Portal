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
	<table>
		<thead>
			<tr>
				<th>Intreview Name</th>
				<th>Type</th>
				<th>By</th>
				<th>Date</th>
				<th>Location</th>
				<th>Grade</th>
				<th>View</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${interviews}" var="interview">
				<tr>
					<td><c:out value="${interview.name}" /></td>
					<td><c:out value="${interview.type}" /></td>
					<td><c:out value="${interview.interviewer}" /></td>
					<td><c:out value="${interview.date}" /></td>
					<td><c:out value="${interview.location}" /></td>
					<td><c:out value="${interview.grade}" /></td>
					<td><a href="/interview/${interview.id}"><c:out value="view details" /></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>