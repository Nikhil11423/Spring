<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display the Details</title>
<style>
label{
color: Blue;
}
h1{
text-align: center;
color: Blue;
}
.center{
position:absolute;
top: 50%;
left: 50%;
transform : translate(-50%, -50%);
width: 400px;
background: white;
border-radius: 10px; 
    opacity: 61%;
}

body{
margin: 0;
padding: 0;
font-family: montserrat;
background-image: url("cake.jpg");
background-repeat :none;
text-align: center;
font-weight:bold;
text-decoration: none;
color: black;
}
</style>
</head>
<body>
<div class="center">
<h1>${msg}</h1>
Item Name: ${data.name}
<br>
Item Price: ${data.price}
<br>
Item Quantity: ${data.quantity}
<br>
Total Price:${data.price*data.quantity}
</div>
</body>
</html>