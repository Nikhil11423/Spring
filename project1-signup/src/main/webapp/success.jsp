<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
	<style>
	body{
     background-image: url("nikhil.jpg");
     background-size: cover;
     width: 1000px;
     height: 800px;  
     }

h2 {
	text-align: center;
	color: blue;
	padding-top: 15px;
}

h3 {
	text-align: center;
	color: green;
	padding-top: 30px;
}
</style>
	
<title>Registration</title>
</head>
<body>
<h2>${success}</h2><br>
<form action="save.do" method="post">
<div class="form-group">

<h3> fullName :- ${data.fullName}</h3>
<h3> Email    :- ${data.email}</h3>
<h3> UserId   :- ${data.userId}</h3>
</div>
</form>
</body>
</html>