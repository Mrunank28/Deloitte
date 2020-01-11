<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<%
String user = (String)session.getAttribute("user");
if(user == null || !user.equals("admin")) {
%>
<h2>You are not logged in</h2>
<a href = "index.html">Log in</a>
<%
}
else {
%>
${usertype}
<br><h1>Create User</h1>
<form action="create" method="post">
Login<input type="text" name="login" value="" /><br>
Password<input type="password" name="pswd" value="" /><br>
User type<input type="text" name="type" value="" /><br>
<input type="submit" value="CREATE USER" />
</form>

<a href="logout">Log Out</a>
<%
}
%>
</body>
</html>