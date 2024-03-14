<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <!-- AddED JSTL -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<div class="container">
<!-- 
<p>Cus Id : ${cus.cid }</p>
<p>Cus Name : ${cus.cname }</p>
<p>Cus age : ${cus.age }</p>
<p>Cus Mail : ${cus.email }</p>
 -->

	<div class="container mt-5">
		<table class="table">
			<tr>
				<th>Name</th>
				<th>Email</th>
				<th>Contact</th>
				<th>Address</th>
			</tr>
			<c:forEach items="${clist}" var="e">
				<tr>
					<td>${e.name}</td>
					<td>${e.email}</td>
					<td>${e.contact}</td>
					<td>${e.address}</td>
					
				</tr>
			</c:forEach>
		</table>

	</div>
	
</div>
 <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>