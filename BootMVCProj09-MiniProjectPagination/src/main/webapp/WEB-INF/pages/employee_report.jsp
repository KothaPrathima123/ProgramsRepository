<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<link rel="stylesheet"
href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
<div class="container">
<c:choose>
  <c:when  test="${!empty empsData.getContent()}">
      <table border="1" bgcolor="cyan" align="Center" class="table">
         <tr class="table-danger">
           <th>empno</th> <th>emp name</th><th>emp job</th><th>emp salary</th> <th>status</th><th>operations </th> 
         </tr>
      <c:forEach var="emp" items="${empsData.getContent()}">
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
      <p style="text-align:center">
      <c:if test="${!empsData.hasPrevious()}">
      <a href="report?page="${empsData.getPageable().getPageNumber()-1}">previous</a>&nbsp;&nbsp;
      </c:if>
      <c:if test="${!empsData.isFirst()}">
      <a href="report?page=0">first</a> &nbsp;&nbsp;
      </c:if>
      <c:forEach var="i" begin="1" end="${empsData.getTotalPages()}" step="1">
      <a href="report?page="${i-1}">${i}</a> &nbsp;&nbsp;
      </c:forEach>
      <c:if test="${!empsData.isLast()}">
      <a href="report?page=${empsData.getTotalPages()-1}">Last</a> &nbsp;&nbsp;
      </c:if>
      <c:if test="${!empsData.hasNext()}">
      <a href="report?page=${empData.getPageable().getPageNumber()-1}">next</a> &nbsp;&nbsp;
      </c:if>
      </p>
      
      
      
      
      
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
    
    