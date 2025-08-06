<%@page import="pack1.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Product - Admin Login</title>
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
<div style="text-align:center;color:green;font-weight:bold;font-size:32px;background-color:hwb(120 2% 70%);">
<% 
 AdminBean abean=(AdminBean)session.getAttribute("abean");
//ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("ProductsList");
ProductBean pb=(ProductBean)request.getAttribute("pbean");
out.println("Edit Product");
%>
</div>
<div class="div3">
<form action="update" method="post">
<label>Product Price</label><br><br>
<label>Product Quantity</label><br><br>
</div>
<div class="div4">
<input type="text" name="pprice" value="<%=pb.getPprice() %>"><br><br>
<input type="text" name="pqty" value="<%=pb.getPqty() %>"><br><br>
<input type="hidden" name="pcode" value="<%=pb.getPcode()%>">
<input type="submit" value="Update Product Details">
</form>
</div>
</div>

</body>
</html>