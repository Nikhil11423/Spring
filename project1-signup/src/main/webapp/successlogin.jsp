<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>${log}</h2>
<form action="edit" method="post">
<input type="text" name="userId" value="${data.userId}">
<input type="password" name="password">
<input type="submit" value="Submit">
</form>
</body>
</html>