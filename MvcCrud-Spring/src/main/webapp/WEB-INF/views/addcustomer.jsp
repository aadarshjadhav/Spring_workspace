<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>      

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
    
<html>
<head>
<meta charset="UTF-8">
<title>Customer Form</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<style>
/* Internal CSS */
.container {
    max-width: 500px;
    margin: auto;
    padding-top: 50px;
}
.form-group {
    margin-bottom: 1.5rem;
}
</style>

</head>


<body>
<jsp:include page="header.jsp"></jsp:include>

<!-- 
<div class="container">
    <h1 class="text-center mt-5">Customer Form</h1>
    <form action="save" method="post">
        <div class="form-group">
            <label for="name">Enter Name</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="Enter Name">
        </div>
        
        <div class="form-group">
            <label for="email">Enter Email</label>
            <input type="email" class="form-control" id="email" name="email" placeholder="Enter Email">
        </div>
        
        <div class="form-group">
            <label for="contact">Enter Contact</label>
            <input type="text" class="form-control" id="contact" name="contact" placeholder="Enter Contact">
        </div>
        
        <div class="form-group">
            <label for="address">Enter Address</label>
            <input type="text" class="form-control" id="address" name="address" placeholder="Enter Address">
        </div>
        
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div> -->

<div class="container">
	<form:form action="save" method="post" modelAttribute="customer">
            <table border="0" cellpadding="5">
                <tr>
                    <td>Name: </td>
                    <td><form:input path="name" /></td>
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
                    <td colspan="2"><input type="submit" value="Save"></td>
                </tr>                    
            </table>
       </form:form>
       
</div>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
