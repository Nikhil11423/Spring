<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="onGetOTPSave.vaccine" method="post">
<h1>Change Password</h1>
<h3>${ErrMsg}</h3>
          New Password 
<input type="password" name="new password">
         Confirm Password 
<input type="password" name="confirm password">
<input type="submit" value="Submit">
<input type="reset" value="Reset"><div>
</div>
</form>
</body>
</html>