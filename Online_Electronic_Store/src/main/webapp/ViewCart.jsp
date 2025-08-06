<%@page import="pack1.Image_Paths"%>
<%@page import="java.util.Iterator"%>
<%@page import="pack1.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pack1.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Cart - Customer Login</title>
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
 font-size:20px;
 padding-bottom:10px;
 }
#logout-button{
  margin-top:20px;
  padding:7px 20px;
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
#buy{
 margin-left:40px;
 display:inline-block;
}
#buy-link, #remove-link{
 text-decoration:none;font-size:20px;border-color:blue;
}
</style>
</head>
<body bgcolor="blue">
<div style="background-color:white; height:2000px; width:1325px;">
<div style="font-size:30px; text-decoration:underline; text-align:center; color:green;margin-bottom:20px;">
<%
CustomerBean cbean=(CustomerBean)session.getAttribute("cbean");
ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("CartList");
out.println("Hello Mr."+cbean.getFname()+"<br><br>");
%></div>
<div style="font-size:30px;">
<% 
if(al.size()==0)
{
	out.println("Cart is Empty!!<br><br>");
}
else
{
	out.println("Here are the products added to cart..<br><br>");
	Iterator<ProductBean> i=al.iterator();
	ProductBean pb=null;
	 out.println("<span id='image'>Image</span><span id='code'>Code</span><span id='name'>Name</span><span id='company'>Company</span><span id='price'>Price</span><span id='quantity'>Quantity</span>");
	
		while(i.hasNext())
		{
			pb=i.next();
			out.println("<div id='product-record'><div id='img-div'><img id='img'src='"+Image_Paths.imgPath(pb.getPname())+"'></div><div id='pcode'>"+pb.getPcode()+"</div><div id='pname'>"+pb.getPname()+"</div><div id='pcompany'> "+pb.getPcompany()+"</div><div id='pprice'> "+pb.getPprice()+"</div><div id='pqty'> "+pb.getPqty()+
					  "</div><div id='buy'><button> <a href='buy?pcode="+pb.getPcode()+"' id='buy-link'>Buy</a></button><button> <a href='removeCart?pcode="+pb.getPcode()+"' id='remove-link'>Remove</a></button></div></div><br>");
			
		}
		
}
%>
</div>
<div>
<div id="logout"><button><a href="view2" style="text-decoration:none;font-size:20px">View Products</a><br><br></button></div>
<div id="logout"><button><a href="custlogout" style="text-decoration:none;font-size:20px">Logout</a><br><br></button></div>
</div>
</div>
</body>
</html>