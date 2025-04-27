<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"  %>
<h1 style="color:red;text-align:center">Politician Register</h1>
<frm:form method="POST" modelAttribute="pp">
<table border="0" bgcolor="cyan" align="center">
<tr>
<td>Politician name:</td>
<td><frm:input path="pname"/></td>
</tr>
<tr>
<td>Politician Party name:</td>
<td><frm:input path="party"/></td>
</tr>
<tr>
<td>Politician DOB:</td>
<td><frm:input path="dob" type="date"/></td>
</tr>
<tr>
<td>Politician DOJ:</td>
<td><frm:input path="doj" type="date"/></td>
</tr>
<tr>
<td>Has ConstitutionPost?:: </td>
<td><frm:radiobutton path="consPost" value="true"/>yes &nbsp;&nbsp;
	<frm:radiobutton path="consPost" value="false"/>no &nbsp;&nbsp;
</td>
<tr>
<td colspan="2"><input type="submit" value="register"></td>
</tr>
</table>
</frm:form>