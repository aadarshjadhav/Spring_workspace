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
  
  <style>
        /* Custom CSS */
        .navbar {
            background-color: #f8f9fa; /* Light gray background */
        }
        body {
            font-family: 'Arial', sans-serif; /* Fallback font */
        }
        .page-title {
            text-align: center;
            font-size: 40px;
            margin:30px;
            
            color: #343a40; /* Dark text color */
            
        }
   </style>
</head>
<body>
<h2 class="page-title">Customer Manager Application</h2>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
  
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" aria-current="page" href="#">AboutUs</a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link" href="addcustomer">Register</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="showcustomerslist">CustomersList</a>
        </li>
        
      </ul>
    </div>
  </div>
</nav>
</body>
</html>