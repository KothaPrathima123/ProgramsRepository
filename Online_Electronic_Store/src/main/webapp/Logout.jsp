<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout page</title>
<style>
 
</style>
</head>
<body>
<h1 align="center" style="left-padding:30px;margin-top:10px;">
<%
  session.invalidate();
  out.println("Loggedout Successfully!!");
%>
</h1>
<div style="margin:70px 0px 0 -370px;text-align:center;">
<jsp:include page="index.html"/>
</div>
</body>
</html>