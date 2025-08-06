<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"  %>
<link rel="stylesheet"
href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
<style media="all">
body{
background-color:pink;
}
span{
color:red;
}
</style>
<h1  style="color:red;text-align:center">Register Employee</h1>

<frm:form    modelAttribute="emp">
<!-- <p style="color:red;text-align:center">
<form:errors path="*"/>
</p> -->
<table align="center"  border="0" bgcolor="cyan">
  <%-- <tr>
  <td>Employee number</td>
  <td><frm:input type="text" path="eno"/></td>
  <tr> --%>
    <td> Employee name  </td>
    <td> <frm:input type="text" path="ename"/><frm:errors path="ename"/></td>
  </tr>
  <tr>
    <td> Employee job </td>
    <td> <frm:input type="text" path="job"/><frm:errors path="job"/></td>
  </tr>
  <tr>
    <td> Employee salary  </td>
    <td> <frm:input type="text" path="sal"/><frm:errors path="sal"/></td>
  </tr>
  <tr>
    <td>  <input type="submit"  value="Add Employee">   </td>
    <td> <input  type="reset"  value="cancel"/> </td>
  </tr>
</table>


</frm:form>