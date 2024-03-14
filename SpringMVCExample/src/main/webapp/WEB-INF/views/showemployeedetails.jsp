<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ page import="com.config.Employee" %>
    <%@ page import="java.util.ArrayList" %>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>This is showdetails eployee</h1>
<p>Name: ${emplist}</p>


<table border="1">
    <tr>
        <th>Name</th>
        <th>Age</th>
        <th>Salary</th>
    </tr>
    
    <% 
        ArrayList<Employee> emplist = (ArrayList<Employee>)request.getAttribute("emplist");
        for(Employee e : emplist) { 
    %>
    <tr>
        <td><%= e.getEmpid()%> </td>
        <td><%= e.getEmpname()%> </td>
        <td><%= e.getEmpsal()%></td>
    </tr>
    <% } %>
</table>

</body>
</html>