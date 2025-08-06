<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Invalid Customer credentials - Customer Login</title>
<style>
 h1{
  color:red;
  align:center;
  
 }
 
</style>
</head>
<body>
<h1>
<%
 out.println(request.getAttribute("msg")+"<br><br>");
%>
</h1>
<div style="margin:70px 0px 0 -240px;text-align:center;">
<jsp:include page="CustomerLogin.html"/>
</div>
</body>
</html>