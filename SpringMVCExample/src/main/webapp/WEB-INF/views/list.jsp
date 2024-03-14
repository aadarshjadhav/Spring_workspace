<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <!-- AddED JSTL -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body>

	<div class="container mt-5">
		<table class="table">
			<tr>
				<th>Employee Id</th>
				<th>Employee Name</th>
				<th>Employee Salary</th>

			</tr>
			<c:forEach items="${emp}" var="e">
				<tr>
					<td>${e.empid }</td>
					<td>${e.empname }</td>
					<td>${e.empsal }</td>
				</tr>
			</c:forEach>
		</table>

	</div>
</body>
</html>