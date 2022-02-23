<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Interview</h1>
	<form:form method="POST" action="/interview/add"
		modelAttribute="interview">

		<p>
			<form:label path="type">Type</form:label>
			<form:input path="type" value="${interview.type}" />
		</p>
		<p>
			<form:label path="name">Name</form:label>
			<form:input path="name" />
		</p>
		<p>
			<form:label path="interviewer">Interviewer</form:label>
			<form:input path="interviewer" />
		</p>
		<p>
			<form:label path="date"> Date</form:label>
			<form:input type="date" path="date" />
		</p>
		<p>
			<form:label path="location">Location</form:label>
			<form:input path="location" />
		</p>
		<form:input type="hidden" path="student"
			value="${interview.student.personalId}" />

		<table id="table">
			<thead>
				<tr>
					<th>Question</th>
					<th>Answer</th>
					<th>Notes</th>
				</tr>
			</thead>
			<tbody>
				<!-- 	looping over question list to add them to db  -->
				<c:forEach var="q" items="${interview.questions}"
					varStatus="counter">
					<tr>
						<td><form:input
								path="questions[${counter.index}].questionText"
								value="${q.questionText }" /></td>
						<td><form:input path="questions[${counter.index}].answer"
								value="${q.answer}" /></td>
						<td><form:input path="questions[${counter.index}].notes"
								value="${q.notes}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<p>
			<form:label path="grade">Grade</form:label>
			<form:select path="grade">
				<form:options />
			</form:select>
		</p>
		<p>
			<form:label path="generalNotes"> general Notes</form:label>
			<form:textarea path="generalNotes" />
		</p>


		<input type="submit" value="Submit" />
		<a href="/"> Cancel </a>
	</form:form>
</body>
</html>