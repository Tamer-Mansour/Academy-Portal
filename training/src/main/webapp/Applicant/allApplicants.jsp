<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show all applicants</title>
</head>
<body>
	<%@ include file="/Navigation/header.jsp"%>
	<h1>Applicants</h1>

	<p>
		<c:forEach items="${applicants}" var="applicant">
			<a href="/applicant/${applicant.personalId}"> <c:out
					value="Applicant Number:  ${applicant.personalId}  ${applicant.name} " />
			</a>

			<br>
		</c:forEach>
	</p>

	<a href="/applicant/add">Add A New Applicant</a>
</body>
</html>