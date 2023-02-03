<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body{
margin: 0;
padding: 0;
font-family: montserrat;
background-repeat: no-repeat;
background-size: cover;
}
h1{
text-align: center;
color: Red;
}
.center{
position:absolute;
top: 50%;
left: 50%;
transform : translate(-70%, -50%);
width: 500px;
background: white;
border-radius: 10px; 
background-color: orange;
   
}
.center form{
 padding: 0 40px;
 box-sizing: border-box;
 text-align: center;
 color: blue;
}
</style>
</head>
<body>
<div class="center">
<form action="save.do">
<h1>Personal Details</h1>
<h3>${same}</h3>
<h3>${samePassword}</h3>

<label>Name</label> <br>
<input type="text" name="Name"><div>
<label>Photo</label> <br>
<input type="image" name="photo"><div>
<label>EmailId</label>  <br>   
<input type="email" name="email" placeholder="example@gmail.com"><div>
<label>Password</label>   <br>
<input type="password" name="password" placeholder="password"><div>
<label>MobileNo</label> <br>
<input type="text" name="mobileNo"><div>
<label>DOB</label> <br>
<input type="date" name="dob"><div>

<input type="submit" value="register">

</form>
</div>
</body>
</html>