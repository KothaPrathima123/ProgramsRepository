<%@ page isELIgnored="false"%>
<%-- <%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"  %> --%>
<%@taglib uri="http://www.springframework.org/tags" prefix="sp" %>
<%-- <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>


<h2 style="color:blue;text-align:center"><sp:message code="home.title"/>

<a href="register"><h2 style="color:blue;text-align:center"><sp:message code="home.link"/>
<br><br>
<%-- <h1>Current active locale is: "${pageContext.response.locale}" </h1>
<frm:setLocale value="${pageContext.response.locale}" />
<jsp:useBean id="dt" class="java.util.Date"/>
<fmt:formatDate var="fdt" value="${dt}" type="date" dateStyle="SHORT"/>
<b>formatted date:: ${dt}</b>
<frm:formatDate var="ftime" value="${dt}" type="time" timeStyle="FULL"/>
<b>formatted time: ${ftime}</b>
<frm:formatNumber var="fnumber" value="100000" type="number"/>
<b>formatted time: ${fnumber}</b>
<frm:formatNumber var="fcurrency" value="100000" type="currency"/>
<b>formatted time: ${fcurrency}</b>

<frm:formatNumber var="fpercentage" value="0.87" type="PERCENT"/>
<b>formatted time: ${fpercentage}</b>
 --%><br><br>
<p align="center">
<a href="?lang=fr_FR">French</a>&nbsp;&nbsp;
<a href="?lang=de_DE">German</a>&nbsp;&nbsp;
<a href="?lang=en_US">English</a>
</p>