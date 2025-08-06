<%@ page isELIgnored="false" import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>model attributes data is</h1>
<b>fav colors are:</b><br>
<c:forEach var="color" items="${favColors}">
	${color},
</c:forEach>
<br>
<b>nick names are:</b>
<c:forEach var="name" items="${nickNames}">
	${name},
</c:forEach>
<br>
<b>phone numbers:</b><br>
<c:forEach var="ph" items="${phoneNumbers}">
	${ph},
</c:forEach>
<br>
<b>id details are:</b><br>		
<c:forEach var="id" items="${idDetails}">
	${id.key},${id.value}<br>
</c:forEach>
