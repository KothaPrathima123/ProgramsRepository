<%@page import="pack1.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Cancelled - Customer Login</title>
<link rel="stylesheet" href="OrderConfirmation.css">
</head>
<body>
<div class="div1">
<div class="div2">
<%
CustomerBean cbean=(CustomerBean)session.getAttribute("cbean");
out.println("Hello Mr."+cbean.getFname()+"<br><br>");
  out.println(request.getAttribute("msg")+"<br><br>");
%>
</div>
<div class="div3">
<a href="view2" id="link">View Products</a><br><br>
<a href="viewCart" id="link">View Cart</a><br><br>
<a href="custlogout" id="link">Logout</a><br><br>
</div>
</div>
</body>
</html>