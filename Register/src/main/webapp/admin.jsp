<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
	<style>
        body {
            background-color: rgb(193, 221, 221);
            text-align: center;
            padding-top: 30px;
            color: rgb(7, 10, 1);
        }
        </st</style>
<title>Admin Page</title>
</head>
<body>
<h1>Admin Page</h1>
<form action="user.do" method="get">
<label>Admin Login</label><br>
<input type="text" name="userId"><br>
<label>Password</label><br>
<input type="password" name="password"><br>
<br>
<input type="submit" value="SignUp">	
</form>
</body>
</html>