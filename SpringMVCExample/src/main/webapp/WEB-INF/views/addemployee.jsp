<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
  href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
  rel="stylesheet">
</head>
<body>
this is addemployee

<h1 class="text-center mt-5">Employee Form</h1>
<form action="save" method="post">
	<div class="container">
		<div class="mb-3">
			<label for="empid" class="form-label">Enter ID</label>
				<input type="text" class="form-control" id="empid" name="empid" placeholder="Enter id">
				
		</div>
		
		<div class="mb-3">
			<label for="empname" class="form-label">Enter Name</label>
				<input type="text" class="form-control" id="empname" name="empname" placeholder="Enter Name">
				
		</div>
		<div class="mb-3">
			<label for="empsal" class="form-label">Enter Salary</label>
				<input type="text" class="form-control" id="empsal" name="empsal" placeholder="Enter Sal">
				
		</div>
		 <button type="submit" class="btn btn-primary">Submit</button>
 
	</div>
</form>
</body>
</html>