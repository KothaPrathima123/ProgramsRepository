<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<link rel="stylesheet"
href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
<h1  style="color:red;text-align:center">Edit Employee</h1>

<frm:form       modelAttribute="emp">
<%-- <p style="color:red;text-align:center">
<frm:errors path="*"/>
</p> --%>
<table align="center"  border="0" bgcolor="cyan">
  <tr>
    <td> Employee No  </td>
    <td> <frm:input type="text" path="eno" readonly="true"  cssStyle="color:grey"/> </td>
  </tr>
  <tr>
    <td> Employee name  </td>
    <td> <frm:input type="text" path="ename"/><frm:errors cssStyle="color:red" path="ename"/> </td>
  </tr>
  <tr>
    <td> Employee job </td>
    <td> <frm:input type="text" path="job"/><frm:errors cssStyle="color:red" path="job"/></td>
  </tr>
  <tr>
    <td> Employee salary  </td>
    <td> <frm:input type="text" path="sal"/><frm:errors cssStyle="color:red" path="sal"/></td>
  </tr>
  <tr>
    <td>  <input type="submit"  value="update Employee"></td>
    <td> <input  type="reset"  value="cancel"/> </td>
  </tr>
</table>


</frm:form>