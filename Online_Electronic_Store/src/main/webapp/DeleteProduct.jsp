<%@page import="pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Product - Admin Login</title>
<style type="text/css">
  .div1{
   background-color:#f4f4f4;
   padding:13px 70px 70px 70px;
   border-radius:12px;
  }
  .div2{
  font-weight:bold;
  font-size:30px;
  text-align:center;
  }
  .div3{
  text-align:center;
  
  }
  
  body{display: flex;
  justify-content: center; 
  align-items: center; }
  #link{
    display:inline-block;
    text-decoration: none;
    color: white;
    background-color: #007bff;
    padding: 10px 10px;
    margin: 6px 0;
    border-radius: 7px;
    font-weight: bold;
    font-size: 1em;
    transition:background-color 0.5s;
    box-shadow:5px 5px 5px rgba(0,0,0,0.6);
    width:140px;
  }
  #link:hover{
  background-color:green;
  }
  
  
</style>
</head>
<body>
<div class="div1">
<div class="div2">
<%
AdminBean abean=(AdminBean)session.getAttribute("abean");
String msg=(String)request.getAttribute("msg");
out.println("Hello Mr."+abean.getFname()+"<br><br>");
out.println(msg+"<br><br>");
%>
</div>
<div class="div3">
<a href="AddProducts.html" id="link">AddProducts</a><br><br>
<a href="view1" id="link">View Products</a><br><br>
<a href="logout" id="link">Logout</a><br><br>
</div>
</div>
</body>
</html>