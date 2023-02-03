<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
<style>
body{
margin: 0px;
padding: 0px;
font-family : sans-serif;
background-color: #f5f5f5;

}
.login-box{
width: 280px;
position: absolute;
top: 50%;
left: 50%;
transform: translate(-50%,-50%);
}
.login-box h1{
text-align :center;
float: none;
font-size: 40px;
margin-bottom: 30px;
padding : 10px;
position: center;
}
.login-box h3{
float: left;
margin-bottom: 2px;
padding : 10px;
color: red;
}
.textbox{
width: 100%;
overflow: hidden;
font-size: 20px;
padding: 8px 0;
margin: 8px 0;
border-bottom: 2px solid blue;
}

.textbox i{
width: 26px;
float: left;
text-align: center;
color: orange;
}
.textbox input{
border: none;
outline: none;
background: none;
color: black;
font-size: 18px;
width: 80%;
float: left;
margin: 0 10px;
}
  .glow-on-hover {
    width: 200px;
    height: 30px;
    border: none;
    padding :1px;
    margin-top : 10px;
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
<title>Login Page</title>
</head>
<body>
<div class="login-box">
<form action="login" method="post">
<h1>Login</h1>
<h2>${log}</h2>
<h3>${error}</h3>
<h4>${forget}</h4>
<div class="textbox">
<i class="fa fa-user" aria-hidden="true"></i>
<input type="text" placeholder="UserId" name="userId" value="${data.userId}">
</div>
<div class="textbox">
<i class="fa fa-lock" aria-hidden="true"></i>
<input type="password" placeholder="${error} Password" name="password"></div>
<input type="checkbox" >Remender Me<br>
<button class="glow-on-hover" type="submit" value="Register">Sign in</button>
<div>
<br>

<a href="forgetpassword.jsp">ForgetPassword?</a>
<h5>${restpassword}</h5>
</form>
  </div>
</body>
</html>