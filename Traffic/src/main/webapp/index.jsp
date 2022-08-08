<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
label{
font-weight:bold;
color: Blue;
}

body{
margin: 0;
padding: 0;
font-family: montserrat;
background-image: url("traffic-police.webp");
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
width: 500px;
background: orange;
border-radius: 10px; 
    opacity: 51%;
   
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
<form action="display.do" method="post">
<h1>Info Of Traffic Violation</h1>
<h2>${failMessage}</h2>
VehicleRegNo :<input type="text" name="vehicleRegNo"> 
<br><br>
Place :<input type="text" name="place"><br><br>
Date and Time :<input type="datetime-local" name="dateAndTime"><br><br>
Violation : <select  id="violation" name="violation">
<option value="Bike">Select</option>
<option value="Driving/Ridding Without Licence">Driving/Ridding Without Licence</option>
<option value="Driving without Hetme">Driving without Hetmet</option>
<option value="Driving without Insurance">Driving without Insurance</option>
<option value="Driving without Registration">Driving without Registration</option>
<option value="Dangerous Driving">Dangerous Driving</option>
<option value="Over Speeding">Over Speeding</option>
</select><br><br>
Image to Upload : <input type="file" name="image">
<br>
<br>
<input type="submit" value="Submit">
<br>
</form>
</div>
</body>
</html>