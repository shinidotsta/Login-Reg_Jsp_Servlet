<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action="/FaceBook/LoginServlet" method="post">
<h1>login</h1>
Username:
<input type="text" name="username"><br><br>
password :
<input type="text" name="Password"><br><br>
<input type="submit" value="Login"><br><br>

<p style="color:red;">${data1}</p>
</form>
</body>
</html>