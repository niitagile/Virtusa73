<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SQL Insert JSTL Tag</title>
</head>
<body>
	<sql:setDataSource 
driver="com.mysql.cj.jdbc.Driver" 
url="jdbc:mysql://localhost:3306/Mphasis" 
user="root"
password="Comnet@123" var="conn"/>
	
	<sql:update dataSource="${conn}" var="i">
		delete from LoginInfo where userid=? 
		<sql:param value="${param.t1}"/>
	
	</sql:update>
	
	<c:choose>
		<c:when test="${i eq 1}">
			Data deleted Succesfully..
		</c:when>
		<c:otherwise>
			Problem in Deleting..
		</c:otherwise>
	</c:choose>	
</body>
</html>