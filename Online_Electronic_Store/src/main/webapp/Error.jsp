<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h1>
<%
  String msg=(String)request.getAttribute("msg");
  response.sendError(HttpServletResponse.SC_BAD_REQUEST, msg);
%>
<%=msg %><br><br>
<a href="AddProducts.html" id="link">AddProducts</a><br><br>
<a href="view1" id="link">View Products</a><br><br>
<a href="logout" id="link">Logout</a><br><br>
</h1></center>
</body>
</html>