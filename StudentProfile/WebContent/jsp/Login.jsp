<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form:form method="get" modelAttribute="loginForm" action="loginsave.html">
  <table>
    <tr>
      <td>
        Username:
      
      </td>
      <td> <input type="text" value="${loginForm.username}" name="username"/> </td> 
      
      
    </tr>
   <tr>
     <td>
      Password:
     </td>
     
     <td> <input type="password" value = "${loginForm.password}" name="password"/>
   </tr>
  
  <tr>
    <td>
    
   ${errorMessage}
    
    </td>
  </tr>
  
  </table>

 
 <input type="Submit" value="Login"/>
 
</form:form>
 </center>
</body>
</html>