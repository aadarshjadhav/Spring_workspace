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


<div class="container">
<!-- 
<p>Cus Id : ${cus.cid }</p>
<p>Cus Name : ${cus.cname }</p>
<p>Cus age : ${cus.age }</p>
<p>Cus Mail : ${cus.email }</p>
 -->

	<div class="container mt-5">
		<table class="table">
			
			<c:forEach items="${list}" var="e">
				<tr>
					<td>${e.cid}</td>
					<td>${e.cname}</td>
					<td>${e.age}</td>
					<td>${e.email}</td>
					<td>${e.gender}</td>
					
				</tr>
			</c:forEach>
		</table>

	</div>
	
</div>
</body>
</html>