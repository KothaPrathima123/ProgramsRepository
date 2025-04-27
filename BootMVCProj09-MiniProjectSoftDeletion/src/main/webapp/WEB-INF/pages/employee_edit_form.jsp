<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<style media="all">
body{
bgcolor-color:pink;
}
span{
color:red;
}
</style>
<script language="JavaScript" src="js/client.js">
</script>
<noscript>
<h1 style="color:red;text-align:center">Please enable java script</h1>
</noscript>
<h1  style="color:red;text-align:center">Edit Employee</h1>

<frm:form  modelAttribute="emp" onsubmit="return validation(this)">
<table align="center"  border="0" bgcolor="cyan">
<frm:hidden path="vflag"/>
  <tr>
    <td> Employee No  </td>
    <td> <frm:input type="text" path="empno" readonly="true"  cssStyle="color:grey"/> </td>
  </tr>
  <tr>
    <td> Employee name  </td>
    <td> <frm:input type="text" path="ename"/><frm:errors cssStyle="color:red" path="ename"/><span id="enameErr"></span></td>
  </tr>
  <tr>
    <td> Employee job </td>
    <td> <frm:input type="text" path="job"/><frm:errors cssStyle="color:red" path="job"/><span id="jobErr"></span></td>
  </tr>
  <tr>
    <td> Employee salary  </td>
    <td> <frm:input type="text" path="sal"/><frm:errors cssStyle="color:red" path="sal"/><span id="salErr"></span></td>
  </tr>
  <tr>
    <td>  <input type="submit"  value="update Employee"></td>
    <td> <input  type="reset"  value="cancel"/> </td>
  </tr>
</table>


</frm:form>