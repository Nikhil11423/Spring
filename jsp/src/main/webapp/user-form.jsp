<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Merriweather+Sans:400,700" rel="stylesheet" />
        <link href="https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic" rel="stylesheet" type="text/css" />
        <!-- SimpleLightbox plugin CSS-->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/SimpleLightbox/2.1.0/simpleLightbox.min.css" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
</head>
<body id="page-top">
    <!-- Navigation-->
    <nav class="navbar navbar-expand-lg navbar-light fixed-top py-3" id="mainNav">
        <div class="container px-4 px-lg-5">
            <a class="navbar-brand" href="#page-top">NB</a>
            <button class="navbar-toggler navbar-toggler-right" type="button" data-bs-toggle="collapse" data-bs-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
          
           <ul class ="navbar-nav">
           <li><a href="<%=request.getContextPath() %>/list"
           class="nav-link">Users</a></li>
           </ul>
           </nav>
</div>
<c:if test ="${user !=null}">
<from action="update" method="post">
</c:if>
<c:if test ="${user ==null}">
<from action="update" method="post">
</c:if>
<caption>
<h2>
<c:if test ="${user !=null}">
Edit User
</c:if>
<c:if test ="${user ==null}">
Add New User
</c:if>
</h2>
</caption>
<c:if test ="${user !=null}">
<input type="hidden" name="id" value="<c:out value='${user.id}'/>"/>
</c:if>

<filedset class="form-group">
<lable>Name</lable>
<input type="text" value="<c:out value='${user.name}'/> class="form-control"
name="name" required"> 
</filedset>

<filedset class="form-group">
<lable>Photo</lable>
<input type="text" value="<c:out value='${user.photo}'/> class="form-control"
name="photo" required"> 
</filedset>

<filedset class="form-group">
<lable>EmailId</lable>
<input type="text" value="<c:out value='${user.emailId}'/> class="form-control"
name="emailId" required"> 
</filedset>

<filedset class="form-group">
<lable>Password</lable>
<input type="text" value="<c:out value='${user.password}'/> class="form-control"
name="password" required"> 
</filedset>

<filedset class="form-group">
<lable>MobileNo</lable>
<input type="text" value="<c:out value='${user.mobileNo}'/> class="form-control"
name="mobileNo" required"> 
</filedset>
<button type="submit" class="btn btn-success">Save</button>
</from>
</head>
<body>

</body>
</html>