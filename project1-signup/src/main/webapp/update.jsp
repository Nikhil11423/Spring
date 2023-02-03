<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="">
<label>First Name</label> <br>
<input type="text" name="firstName" value="${fname}"><div>
<label>Middel Name</label>  <br>  
<input type="text" name="middelName" value="${mname}"><div>
<label>Last Name</label>  <br>
<input type="text" name="lastName" value="${lname}"><div>
<label>Mother Name</label>  <br>
<input type="text" name="motherName" value="${mother}"><div>
<label>MobileNo</label>  <br>
<input type="number" name="mobileNo" value="${mobile }"> <div>
<label>Gender</label>  <br>
<input type="checkbox" name="gender">Male
<input type="checkbox" name="gender">FeMale<div>
<label>MarialStatus</label>  <br>
<input type="checkbox" name="marialStatus">Single
<input type="checkbox" name="marialStatus">Married<div>
<br>
<input type="submit" value="Update"><div>
</div>
</form>
</body>
</html>