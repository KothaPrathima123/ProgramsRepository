<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Invalid Admin credentials - Admin Login</title>
<style>
 h1{
  color:red;
  align:center;
  
 }

</style>
</head>
<body>
<h1 style="display:inline-block;">
<%
 out.println(request.getAttribute("msg")+"<br><br>");
%>
</h1>
<div style="margin:70px 0px 0 -400px;text-align:center;" >
<jsp:include page="AdminLogin.html"/>
</div>
</body>
</html>