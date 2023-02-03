<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
<link href="https://cdnjs.cloudflare.com/ajax/libs/SimpleLightbox/2.1.0/simpleLightbox.min.css" rel="stylesheet" />
<meta name="viewport" content="width-device-width, initial-scale=1.0>
</head>
<body>
<div class="container">
<input type="checkbox" id="flip">
<div class="cover">
<div class="front">
<img src="" alt="">
<div class="text">
<span class="text-1">Every new friend is a <br> new adveture</span>
<span class="text-2">Let's get connected</span>
</div>
</div>
<div class="back">
<img class="backImg"  src="" alt="">
<div class="text">
<span class="text-1">Complete miles of journey<br> with one step</span>
<span class="text-2">Let's get started</span>
</div>
</div>
</div>
<form action="#">
<div class="form-content">
<div class="login-form">
<div class="title">Login</div>
<div class="input-boxes"></div>
<div class="input-box"></div>
<i class="fas fa-envelope"></i>
<input type="text" placeholder="Enter your email" required>
</div>
<div class="text"><a href="#">Forget Password?</a></div>
<div class="input-box">
<i class="fas fa-lock"></i>
<input type="password" placeholder="Enter your password" required>
<input type="submit" value="Submit">
</div>
<div class="text sign-up-text" >Don't have an account? <label for="flip">Signup now</label></div> 
</div>
</div>
<div class="signup-form">
<div class="title">Signup</div>
<div class="input-boxes"></div>
<div class="input-box"></div>
<i class="fas fa-user"></i>
<input type="text" placeholder="Enter your name" required>
</div>
<div class="input-box"></div>
<i class="fas fa-envelope"></i>
<input type="text" placeholder="Enter your email" required>
</div>
<div class="input-box">
<i class="fas fa-lock"></i>
<input type="password" placeholder="Enter your password" required>
<input type="submit" value="Submit">
</div>
<div class="text sign-up-text" >Already have an account? <label for="flip">Login now</label></div> 
</div>
</div>
</div>