<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<title>Insert title here</title>
</head>
<body>
<form action="edit.do" method="post">
            <br>Name <input type="text" name="Name" value="${data.name}" > <br>
			<br>Photo<input type="text" name="photo" value="${data.photo}"> <br>
			<br>EmailID <input type="text" name="emailId" value="${data.emailId}"> <br>
						<br>Password <input type="password" name="emailId" value="${data.password}"> <br>
		    <input type="submit" value="Save"><br>
</form>
</body>
</html>