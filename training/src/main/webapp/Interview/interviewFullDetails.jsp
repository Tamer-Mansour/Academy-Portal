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
	<h1>
		Interview For Student
		<c:out value="${interview.student.name}"></c:out>
	</h1>
	<p>
		Interview Name :
		<c:out value="${interview.name}" />
	</p>
	<p>
		Type :
		<c:out value="${interview.type}" />
	</p>
	<p>
		Interviewer :
		<c:out value="${interview.interviewer}" />
	</p>
	<p>
		Interview Date :
		<c:out value="${interview.date}" />
	</p>
	<p>
		Location :
		<c:out value="${interview.location}" />
	</p>
	<p>
		Grade:
		<c:out value="${interview.grade}" />
	</p>

	<table id="table">
		<thead>
			<tr>
				<th>Question</th>
				<th>Answer</th>
				<th>Notes</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="q" items="${interview.questions}" varStatus="counter">
				<tr>
					<td><c:out value="${q.questionText }" /></td>
					<td><c:out value="${q.answer}" /></td>
					<td><c:out value="${q.notes}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<p>
		General Notes :
		<c:out value="${interview.generalNotes}"></c:out>
	</p>
</body>
</html>