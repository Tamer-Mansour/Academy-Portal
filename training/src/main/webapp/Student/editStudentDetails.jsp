<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Student Details</title>
</head>
<body>
	<%@ include file="/Navigation/header.jsp"%>
	<form:form action="/student/${student.personalId}" method="post"
		modelAttribute="student">
		<input type="hidden" name="_method" value="put">

		<p>
			<form:label path="name">Name</form:label>
			<form:errors path="name" />
			<form:input path="name" />
		</p>
		<p>
			<form:label path="email">Email</form:label>
			<form:errors path="email" />
			<form:input path="email" />
		</p>
		<p>
			<form:label path="city">City</form:label>
			<form:errors path="city" />
			<form:input path="city" />
		</p>
		<p>
			<form:label path="dateOfBirth">Date Of Birth</form:label>
			<form:errors path="dateOfBirth" />
			<form:input type="date" path="dateOfBirth" />
		</p>

		<p>
			<form:label path="phoneNumber">Phone Number</form:label>
			<form:errors path="phoneNumber" />
			<form:input type="number" path="phoneNumber" />
		</p>
		<p>
			<form:label path="gender">Gender</form:label>
			<form:errors path="gender" />
			<form:select path="gender">
				<form:options />
			</form:select>
		</p>
		<p>
			<form:label path="educationalBackground">Educational Background</form:label>
			<form:errors path="educationalBackground" />
			<form:textarea path="educationalBackground" />
		</p>
		<p>
			<form:label path="emergencyContact">Emergency Contact</form:label>
			<form:errors path="emergencyContact" />
			<form:input type="number" path="emergencyContact" />
		</p>
		<p>
			<form:label path="allergyAndDiet">Allergy and Diet</form:label>
			<form:errors path="allergyAndDiet" />
			<form:input path="allergyAndDiet" />
		</p>
		<p>
			<form:label path="notes">Notes</form:label>
			<form:errors path="notes" />
			<form:input path="notes" />
		</p>
		<p>
			<form:label path="status">Status</form:label>
			<form:errors path="status" />
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
			<form:errors path="firstDay" />
			<form:input type="date" path="firstDay" />
		</p>
		<p>
			<form:label path="githubAccount">Git Hub Account</form:label>
			<form:errors path="githubAccount" />
			<form:input path="githubAccount" />
		</p>
		<p>
			<form:label path="linkedInProfile">LinkedIn Account</form:label>
			<form:errors path="linkedInProfile" />
			<form:input path="linkedInProfile" />
		</p>
		<p>
			<form:label path="technicalExperience">Technical Experience</form:label>
			<form:errors path="technicalExperience" />
			<form:input path="technicalExperience" />
		</p>
		<p>
			<form:label path="technicalsToImprove">Technicals To Improve</form:label>
			<form:errors path="technicalsToImprove" />
			<form:input path="technicalsToImprove" />
		</p>
		<p>
			<form:label path="personalSkills">Personal Skills</form:label>
			<form:errors path="personalSkills" />
			<form:input path="personalSkills" />
		</p>
		<p>
			<form:label path="personalToImprove">Personal To Improve</form:label>
			<form:errors path="personalToImprove" />
			<form:input path="personalToImprove" />
		</p>

		<br>
		<input type="submit" value="Edit" />
		<a href="/"> Cancel </a>
	</form:form>

</body>
</html>