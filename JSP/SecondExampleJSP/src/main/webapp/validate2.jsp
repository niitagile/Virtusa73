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
//out.println("Welcome="+request.getParameter("txtUser"));

out.println("Welcome="+session.getAttribute("username"));

%>

<a href="Logout.jsp"> Logout</a>
</body>
</html>