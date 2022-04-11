<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="GetInfo.jsp">
<input type="text" name="sname">
<input type="submit" value="submit">
<%
	session.setAttribute("email","abc@gmail.com");
	Cookie cookie=new Cookie("browser","chrome");
	response.addCookie(cookie);

%>
</form>
</body>
</html>