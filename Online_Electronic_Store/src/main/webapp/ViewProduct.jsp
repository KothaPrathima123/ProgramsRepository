<%@page import="pack1.Image_Paths"%>
<%@page import="java.util.Iterator"%>
<%@page import="pack1.AdminBean"%>
<%@page import="pack1.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Products - Admin Login</title>
<style>
#pcode,#pname,#pcompany,#pprice,#pqty,#addtocart{
display:inline-block;
padding:10px 0px;
margin-right:27px;
width:100%;
text-align:center;
vertical-align:middle;
}
#pcode{
width:90px;
 
}
#pname{
width:180px;
}
#pcompany{
  width:180px;
}
#pprice{
 width:140px;
}
#pqty{
 width:140px;
}
#addtocart{
 width:140px;
 
}
#buy{
  width:140px;
}

#product-record{
border-color:black;
border-style:solid;
border-width:1px;
border-radius:4px;
margin:10px 6px;
padding:7px 0px;
}
#logout{
 text-align:center;
 font-size:37px;}
#logout-button{
  margin-top:20px;
  padding:7px 20px;
  border-color:#004080;
}
#img{
 height:50px;
  width:50px;
 
}
#img-div{
   display:inline-block;
   vertical-align:middle;
   margin-left:10px;
   margin-right:30px;
}
#image{
margin:0px 20px 0px 10px;
}
#code{
margin:0px 77px 0px 5px;
}
#name{
margin:0px 130px 0px 25px;
}
#price{
margin:0px 100px 0px 90px;
}
#edit-link, #delete-link{
 text-decoration:none;font-size:20px;border-color:blue;
}
</style>

</head>
<body bgcolor="blue">
<div style="background-color:white; height:1500px; width:1325px;">
<div style="font-size:30px; text-decoration:underline; text-align:center; color:green;margin-bottom:20px;">
<%
  AdminBean abean=(AdminBean)session.getAttribute("abean");
  ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("ProductsList");
  out.println("Mr."+abean.getFname()+" here are your products details..<br><br>");
  %></div>
  <div style="font-size:30px;">
  <%
  if(al.size()==0)
  {
	  out.println("There are no products available<br><br>");
  }
  else
  {   
	  Iterator<ProductBean> i=al.iterator();
	  out.println("<span id='image'>Image</span><span id='code'>Code</span><span id='name'>Name</span><span id='company'>Company</span><span id='price'>Price</span><span id='quantity'>Quantity</span>");
	  
	  while(i.hasNext())
	  {
		  ProductBean pb=i.next();
		  out.println("<div id='product-record'><div id='img-div'><img id='img'src='"+Image_Paths.imgPath(pb.getPname())+"'></div><div id='pcode'>"+pb.getPcode()+"</div> <div id='pname'>"+pb.getPname()+"</div> <div id='pcompany'> "+pb.getPcompany()+"</div> <div id='pprice'> "+pb.getPprice()+"</div> <div id='pqty'> "+pb.getPqty()+
	  "</div> <div id='addtocart'> <button><a href='edit?pcode="+pb.getPcode()+"' id='edit-link'>Edit</a></button><button> <a href='delete?pcode="+pb.getPcode()+"' id='delete-link'>Delete</a></button></div></div>");
		 
	  }
	
  }
%></div>
<div id="logout"><button id="logout-button"><a href="custlogout" style="text-decoration:none;font-size:20px" >Logout</a></button></div>
</div>
</body>
</html>