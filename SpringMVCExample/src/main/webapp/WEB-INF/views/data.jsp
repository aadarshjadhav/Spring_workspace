<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- <%
String name= (String)request.getAttribute("person.getName()");
out.print("Name:"+name);
out.print(request.getAttribute("person.age"));
out.print(request.getAttribute("person.email"));
%> -->

<p>Name: ${person.name}</p>
<p>Age: ${person.age }</p>
<p>Email: ${person.email }</p>
</body>
</html>