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
			<label for="cid" class="form-label">Enter ID</label>
				<input type="text" class="form-control" id="cid" name="cid" placeholder="Enter cid">
				
		</div>
		
		<div class="mb-3">
			<label for=cname class="form-label">Enter Name</label>
				<input type="text" class="form-control" id="cname" name="cname" placeholder="Enter Name">
				
		</div>
		<div class="mb-3">
			<label for="age" class="form-label">Enter age</label>
				<input type="text" class="form-control" id="age" name="age" placeholder="Enter age">
				
		</div>
		
		<div class="mb-3">
			<label for="email" class="form-label">Enter email</label>
				<input type="text" class="form-control" id="email" name="email" placeholder="Enter email">
				
		</div>
		
		<div class="mb-3">
  
   <label for="gender" class="form-label"> Gender</label>
	
	 <div class="form-check">
	            <input class="form-check-input" type="radio" name="gender" id="gender" value="Male">
	            <label class="form-check-label" for="male">
	                Male
	            </label>
	        </div>
	        <div class="form-check">
	            <input class="form-check-input" type="radio" name="gender" id="gender" value="Female">
	            <label class="form-check-label" for="female">
	                Female
	            </label>
	        </div>
     </div>

		 <button type="submit" class="btn btn-primary">Submit</button>
 
	</div>
</form>
</body>
</html>