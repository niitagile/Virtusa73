<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String uname=request.getParameter("txtUname");
out.println(uname+"<br>");
 String email=config.getInitParameter("email");
out.println("Your email id is "+email);
%>
</body>
</html>