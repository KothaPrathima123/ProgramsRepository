<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration - OnlineElectronicStore</title>
</head>
<body>
<h1 align="center" style="margin-top:10px;">
<%--
  String message=(String)request.getAttribute("msg");
  out.println(message);
--%>
<div style="text-align:center;color:white;font-weight:bold;font-size:32px;background-color:hwb(120 2% 70%);">
<%
  String message=(String)request.getAttribute("msg");
  out.println(message);
  %>
</div>

</h1>
<div style="margin:70px 0px 0 -450px;text-align:center;">
<jsp:include page="CustomerLogin.html"/>
</div>
</body>
</html>