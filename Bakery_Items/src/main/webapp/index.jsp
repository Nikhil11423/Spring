<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello Spring MVC</title>
<style>
label{
font-weight:bold;
color: Blue;
}

body{
margin: 0;
padding: 0;
font-family: montserrat;
background-image: url("breakfast-wallpaper-thumb.jpg");
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
transform : translate(-50%, -50%);
width: 400px;
background: white;
border-radius: 10px; 
    opacity: 61%;
}
.center form{
 padding: 0 40px;
 box-sizing: border-box;
 text-align: center;
}
</style>
</head>
<body>
<div class="center">
<form  action="add.do" method="post">
<h1>Bakery Items Details</h1>
<h3>${msg}</h3>
<pre>
<label>Item Name</label>
<input type="text" name="name">
<label>Item Price</label>
<input type="text" name="price">
<label>Item Quantity</label>
<input type="text" name="quantity">
<label>Vendor</label>
<input type="text" name="vendor">
<label>Veg</label>
<input type="text" name="veg">
<input type="submit" value="Save"> 
</pre>
</form>
</div>
</body>
</html>