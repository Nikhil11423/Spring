<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
	<style>
	 body {
        background-color: blue;
        }
        
      .center{
         position:absolute;
         top: 50%;
         left: 50%;
         transform : translate(-50%, -50%);
         width: 500px;
         background: White;
         border-radius: 10px; 
         background-color: transparent;
   
}
        .data {
            text-align: center;
            padding-top: 20px;
            color: rgb(7, 10, 1);
        }

        h1 {
            text-align: center;
            color: orange;
            padding-top: 20px;
        }
        h2 {
	text-align: center;
	color: green;
	padding-top: 10px;
}

h3 {
	text-align: center;
	color: red;
	padding-top: 10px;
}
label{
color: white;

}
.data input{
        align-self: auto;
        width: 240px;
        height: 35px;
        background: transparent;
        background-color : 4px solid orange;
        border-top: none;
        border-right: none;
        border-left: none;
        color: white;
        font-size: 15px;
        letter-spacing: 1px;
        font-family: sans-serif;
        
  }
  .glow-on-hover {
    width: 120px;
    height: 40px;
    border: none;
    outline: none;
    color: #fff;
    background: #111;
    cursor: pointer;
    position: relative;
    z-index: 0;
    border-radius: 10px;
}

.glow-on-hover:before {
    content: '';
    background: linear-gradient(45deg, #ff0000, #ff7300, #fffb00, #48ff00, #00ffd5, #002bff, #7a00ff, #ff00c8, #ff0000);
    position: absolute;
    top: -2px;
    left:-2px;
    background-size: 400%;
    z-index: -1;
    filter: blur(5px);
    width: calc(100% + 4px);
    height: calc(100% + 4px);
    animation: glowing 20s linear infinite;
    opacity: 0;
    transition: opacity .3s ease-in-out;
    border-radius: 10px;
}

.glow-on-hover:active {
    color: #000
}

.glow-on-hover:active:after {
    background: transparent;
}

.glow-on-hover:hover:before {
    opacity: 1;
}

.glow-on-hover:after {
    z-index: -1;
    content: '';
    position: absolute;
    width: 100%;
    height: 100%;
    background: #111;
    left: 0;
    top: 0;
    border-radius: 10px;
}
</style>
<title>Registration</title>
</head>
<body>
<div class="center">
	<form action="save" method="post">
<h1>SignUp</h1>
<h3>${repeat}</h3>
<h3>${samePassword}</h3>   
<label>Full Name</label> <br>
<input type="text" name="fullName" value="${fname}"><div>
<label>UserID</label>  <br>  
<input type="text" name="userId" value="${userId}"><div>
<label>Email</label>  <br>   
<input type="email" name="email"><div>
<label>Password</label>  <br>
<input type="password" name="password"><div>
<label>ConfirmPassword</label>  <br>
<input type="password" name="confirmPassword" ><div>
<br>
<button class="glow-on-hover" type="submit" value="Register">Register</button>
</div>
</form>
</body>
</html>