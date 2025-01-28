<%@ page isELIgnored="false" import="java.util.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1 style="color:red;text-align:center">Resut Page</h1>
<c:if test="${!empty seasonName }">
<h2 style="color:red;text-align:center">Season name::${seasonName}</h2>
</c:if>
<br>
<br><br>
<c:if test="${!empty name and !empty age}">
<b>Simple Model attributes are::${name},${age}</b>
</c:if>
<br><br><br>
<c:if test="${!empty nickNames and !empty friends and !empty phoneNumbers and !empty idDetails }">
<b>Colection attributes are </b><%=Arrays.toString(((String[])request.getAttribute("nickNames"))) %>
<br>,${friends},<br>${phoneNumbers},<br>${idDetails}
</c:if>
<br><br><br>
<c:if test="${!empty empData}">
<b>Model class obj as model attribute value::${empData}</b>
</c:if>
<br><br>
<c:if test="${!empty empInfo}">
<b>Emp Information: ${empInfo.eno},${empInfo.ename},${empInfo.salary},${empInfo.vaccinated}</b>
</c:if>
<br><br>
<a href="./">home</a>