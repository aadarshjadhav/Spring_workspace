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


<h1 class="text-center mt-5">Customer Form</h1>
<form action="save" method="post">
	<div class="container">
		
		<div class="mb-3">
			<label for=cname class="form-label">Enter Name</label>
				<input type="text" class="form-control" id="cname" name="cname" placeholder="Enter Name">	
		</div>	
		
		<div class="mb-3">
			<label for="email" class="form-label">Enter email</label>
				<input type="text" class="form-control" id="email" name="email" placeholder="Enter email">		
		</div>
		
		<div class="mb-3">
			<label for="contact" class="form-label">Enter contact</label>
				<input type="text" class="form-control" id="contact" name="contact" placeholder="Enter contact">		
		</div>
		
		<div class="mb-3">
			<label for="address" class="form-label">Enter address</label>
				<input type="text" class="form-control" id="address" name="address" placeholder="Enter address">		
		</div>
		
		<button type="submit" class="btn btn-primary">Submit</button>
 
	</div>
</form>
</body>
</html>