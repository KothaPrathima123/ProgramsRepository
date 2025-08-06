<%@page import="pack1.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Customer Homepage - Customer Login</title>
<style type="text/css">
  .div1{
   background-color:#f4f4f4;
   padding:13px 70px 90px 70px;
   border-radius:12px;
  }
  .div2{
  font-weight:bold;
  font-size:30px;
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
    margin: 9px 0;
    border-radius: 7px;
    font-weight: bold;
    font-size: 1em;
    transition:background-color 0.5s;
    box-shadow:5px 5px 5px rgba(0,0,0,0.6);
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
  CustomerBean cbean=(CustomerBean)session.getAttribute("cbean");
  out.println("Welcome Mr."+cbean.getFname()+"!!<br><br>");
%>
</div>
<div class="div3">
<a href="view2" id="link">View Products</a><br>
<a href="viewCart" id="link">View Cart</a><br>
<a href="custlogout" id="link">Logout</a><br>
</div>

</div>
</body>
</html>