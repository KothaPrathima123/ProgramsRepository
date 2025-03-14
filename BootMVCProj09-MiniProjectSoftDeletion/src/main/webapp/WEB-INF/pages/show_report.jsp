<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<link rel="stylesheet"
href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
<div class="container">
<c:choose>
  <c:when  test="${!empty empsData}">
      <table border="1" bgcolor="cyan" align="Center" class="table">
         <tr classr="table-danger">
           <th>empno</th> <th>emp name</th><th>emp job</th><th>emp salary</th> <th>status</th><th>operations </th> 
         </tr>
      <c:forEach var="emp" items="${empsData}">
         <tr class="table-success">
            <td>${emp.empno}</td>
            <td>${emp.ename}</td>
            <td>${emp.job}</td>
            <td>${emp.sal}</td>
            <td>${emp.status}</td>
            <td><a href="edit?no=${emp.empno}"><img src="images/edit.jpg" width="30px" height="35px"/></a>  
                     &nbsp;&nbsp;&nbsp;
                     <a href="delete?no=${emp.empno}" onclick="return confirm('Do u want to Delete')"><img src="images/delete.jpg" width="30px" height="35px"/></a>
                     </td>
         </tr>
      </c:forEach>
      </table>
  </c:when>
   <c:otherwise>
              <h1  style="color:red;text-align:Center">Records  not Found  </h1>
   </c:otherwise>
</c:choose>
 <center>
                    <h1  style="color:green">${resultMsg} </h1>
                   <a  href="./">home <img src="images/home.jpg" width="50px" height="70px"/></a>
                   <br><br>
                   <a  href="register">register employee <img src="images/add.jpg" width="50px" height="70px"/></a>
                   
    </center>
    </div>
    
    