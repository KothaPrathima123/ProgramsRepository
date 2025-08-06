<%@page import="pack1.ProductBean"%>
<%@page import="pack1.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Buy Product - Customer Login</title>
<style>
 .div1{
   background-color:#f4f4f4;
   height:1000px;
  
   
 }
.div2{
  text-align:center;
  color:green;
  font-weight:bold;
  font-size:20px;
  
}
.div3,.div4{
margin-top:40px;
  display:inline-block;
  height:100px;
  vertical-align:middle;
  font-size:25px;
  
}
.div3{
 margin-left:520px;
}
.div4{
  margin-left:13px;
  
  
}
</style>
</head>
<body>
<div class="div1">
<div class="div2">
<%
 CustomerBean cbean=(CustomerBean)session.getAttribute("cbean");
 ProductBean pb=(ProductBean)request.getAttribute("pb");
 out.println("Hello Mr."+cbean.getFname()+"!!!<br><br>Please enter the number of items that you want to buy<br><br>");
%>
</div>
<div class="div3">
<form action="updateprod" method="post">
<lable>Product code</lable><br><br>
<label>Product name</label><br><br>
<label>Product company</label><br><br>
<label>Product Price</label><br><br>
<label>Available qty</label><br><br>
<label>Required qty<label><br><br>
</div>
<div class="div4">
<input type="text" value="<%=pb.getPcode() %>" readonly><br><br>
<input type="text" value="<%=pb.getPname() %>" readonly><br><br>
<input type="text" value="<%=pb.getPcompany() %>" readonly><br><br>
<input type="text" value="<%=pb.getPprice() %>" readonly><br><br>
<input type="text" value="<%=pb.getPqty() %>" readonly><br><br>
<input type="number"  name="reqqty" autofocus required>&nbsp;<span style="color:red;">*</span><br><br>
<input type="hidden" name="pcode" value="<%=pb.getPcode() %>">
<input type="submit" value="Buy Product"><br><br>
</form>
</div>
</div>
</body>
</html>