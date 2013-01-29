<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <link rel="stylesheet" href="css/table_new.css">
<link rel="stylesheet" href="css/mystyle.css"> -->
<script language="javascript" type="text/javascript">
	function refresh() {
		document.getElementById("myform").action = "getSub.html";
		document.getElementById("myform").method="post";
		document.getElementById("myform").submit();
	}
</script>

</head>
<body>
<form:form method="post" action="gradeSearch.html" modelAttribute="gradeForm" id="myform">

<table class="norm">
 <tr >
 <td>
   Semester
 </td>
   <td>
   
   <form:select path="selectedSem" onchange="javascript:refresh();">
   
   <form:options items="${gradeForm.semList}" />
  </form:select>   
   
</td>
<td>
  Subject
</td>
<td>  <form:select path="selectedSub">
   <form:option value="NONE" label="--- Select Subject ---"/>
   <form:options items="${gradeForm.subList}" itemLabel="subName" itemValue="subId" />
  </form:select>     </td>
   

 </tr>
 
 <tr>
   <td><input type="submit" value="Search"/></td>   
 
 </tr>

</table>
  <table class="imagetable" align="center">
			<tr>
				<th colspan="2">
					<h1>Student Grades</h1>
				</th>
			</tr>
			<tr>

				<th width="170"><h2>Subject</h2></th>
				<th width="170"><h2>Subject Code</h2></th>
				<th width="170"><h2>Grade</h2></th>
				<th width="170"><h2>Result</h2></th>
				
			</tr>


		<c:forEach items="${gradeForm.gradeList}" var="grade" varStatus="status">
		<tr>
				
			
			<td>${grade.subject}</td>
			<td>${grade.subCode}</td>
			<td>${grade.grade}</td>
			<td>${grade.result}</td>
		</tr>
	</c:forEach>
		</table>
</form:form>
</body>
</html>