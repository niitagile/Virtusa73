<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL Demo</title>
</head>
<body>

	<sql:setDataSource 
driver="com.mysql.cj.jdbc.Driver" 
url="jdbc:mysql://localhost:3306/Mphasis" 
user="root"
password="Comnet@123" var="conn"/>
	
	<sql:query dataSource="${conn}" var="res">
		select * from LoginInfo
	</sql:query>
	
	<table border="1">
		<tr>
			<th>User Name</th>
			<th>Password </th>
			
		</tr>
		<c:forEach items="${res.rows}" var="row">
			<tr><!--  Column names of table -->
				<td><c:out value="${row.userid}"/></td>
				<td><c:out value="${row.password}"/></td>
				
			</tr>
		</c:forEach>
		
	</table>

</body>
</html>