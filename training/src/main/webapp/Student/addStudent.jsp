<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
</head>
<body>
	<%@ include file="/Navigation/header.jsp"%>
	<h1>Add New Student:</h1>
	<form:form method="POST" action="/student/add" modelAttribute="student">
		<p>
			<form:label path="name">Name</form:label>
			<form:input path="name" />
		</p>
		<p>
			<form:label path="email">Email</form:label>
			<form:input path="email" />
		</p>
		<p>
			<form:label path="city">City</form:label>
			<form:input path="city" />
		</p>
		<p>
			<form:label path="dateOfBirth">Date Of Birth</form:label>
			<form:input type="date" path="dateOfBirth" />
		</p>

		<p>
			<form:label path="phoneNumber">Phone Number</form:label>
			<form:input path="phoneNumber" />
		</p>
		<p>
			<form:label path="gender">Gender</form:label>
			<form:select path="gender">
				<form:options />
			</form:select>
		</p>
		<p>
			<form:label path="educationalBackground">Educational Background</form:label>
			<form:textarea path="educationalBackground" />
		</p>
		<p>
			<form:label path="emergencyContact">Emergency Contact</form:label>
			<form:input path="emergencyContact" />
		</p>
		<p>
			<form:label path="allergyAndDiet">Allergy and Diet</form:label>
			<form:textarea path="allergyAndDiet" />
		</p>
		<p>
			<form:label path="notes">Notes</form:label>
			<form:textarea path="notes" />
		</p>
		<p>
			<form:label path="status">Status</form:label>
			<form:select path="status">
				<form:options />
			</form:select>
		</p>
		<div>
			<form:label path="cohort">Cohort</form:label>
			<form:errors path="cohort" />
			<form:select path="cohort">
				<c:forEach items="${cohorts}" var="co">
					<form:option value="${co.id}">${co.getCohortName()}</form:option>
				</c:forEach>
			</form:select>
		</div>
		<p>
			<form:label path="firstDay">First Day At The Academy</form:label>
			<form:input type="date" path="firstDay" />
		</p>
		<p>
			<form:label path="githubAccount">Git Hub Account</form:label>
			<form:textarea path="githubAccount" />
		</p>
		<p>
			<form:label path="linkedInProfile">LinkedIn Account</form:label>
			<form:textarea path="linkedInProfile" />
		</p>
		<p>
			<form:label path="technicalExperience">Technical Experience</form:label>
			<form:textarea path="technicalExperience" />
		</p>
		<p>
			<form:label path="technicalsToImprove">Technicals To Improve</form:label>
			<form:textarea path="technicalsToImprove" />
		</p>
		<p>
			<form:label path="personalSkills">Personal Skills</form:label>
			<form:textarea path="personalSkills" />
		</p>
		<p>
			<form:label path="personalToImprove">Personal To Improve</form:label>
			<form:textarea path="personalToImprove" />
		</p>


		<br>
		<input type="submit" value="Add" />
		<input type="reset" value="Cancel" />
	</form:form>

</body>
</html>