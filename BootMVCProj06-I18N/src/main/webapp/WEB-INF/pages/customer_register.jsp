<%@ page isELIgnored="false" contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"  %>
<%@taglib uri="http://www.springframework.org/tags" prefix="sp" %>
<h1  style="color:red;text-align=center"><sp:message code="cust.registration.title"/></h1>
<br><br>
<frm:form  modelAttribute="cust">
<table align="center"  border="0" bgcolor="cyan">
  
    <td><sp:message code="cust.registration.name"></sp:message></td>
    <td> <frm:input type="text" path="cname"/></td>
  </tr>
  <tr>
    <td><sp:message code="cust.registration.addrs"></sp:message> </td>
    <td> <frm:input type="text" path="caddrs"/></td>
  </tr>
  <tr>
    <td><sp:message code="cust.registration.billAmt"></sp:message><</td>
    <td> <frm:input type="text" path="billAmount"/></td>
  </tr>
  <tr>
    <td>  <input type="submit"  value="<sp:message code="cust.btn.register"></sp:message><">   </td>
  </tr>
</table>


</frm:form>
<br><br>
<p align="center">
<a href="?lang=fr_FR">French</a>&nbsp;&nbsp;
<a href="?lang=de_DE">German</a>&nbsp;&nbsp;
<a href="?lang=fr_FR">English</a>
</p>
