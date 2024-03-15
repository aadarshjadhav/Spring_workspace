<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">      
    
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<style>
    /* Custom CSS for form */
    .container {
        min-width: 400px;
        max-width: 400px;
        margin: auto;
        padding-top: 20px;
    }
    table {
        width:400px ;
        margin: auto;
        
        background-color: #e6f5f5; /* Very light teal background color */
        border-radius: 10px;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1); /* Shadow effect */
    }
    td {
        padding: 15px;
        vertical-align: top;
    }
    .form-group {
        margin-bottom: 20px;
    }
    input[type="text"],
    input[type="email"] {
        width: 400px;
        padding: 8px;
        border-radius: 5px;
        border: 1px solid #ced4da;
    }
    input[type="submit"] {
        background-color: #007bff;
        color: #fff;
        padding: 10px 20px;
        border-radius: 5px;
        border: none;
        cursor: pointer;
    }
    input[type="submit"]:hover {
        background-color: #0056b3;
    }
</style>

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
    
<div class="container">
	<form:form action="save" method="post" modelAttribute="customer">
            <table border="0" cellpadding="5">
            	<tr>
                    <td>Id: </td>
                    <td>${customer.id}<form:hidden path="id"/></td>
                </tr>
                <tr>
                    <td>Name: </td>
                    <td><form:input path="name"/></td>
                </tr>
                <tr>
                    <td>Email: </td>
                    <td><form:input path="email" /></td>
                </tr>
                <tr>
                    <td>Contact: </td>
                    <td><form:input path="contact" /></td>
                </tr>
                <tr>
                    <td>Address: </td>
                    <td><form:input path="address" /></td>
                </tr>    
                <tr>
                    <td colspan="2"><input type="submit" value="Update"></td>
                </tr>                    
            </table>
       </form:form>
       
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>