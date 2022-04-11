<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.println("ImplictObject of Expression Language: pageScope, requestScope, sessionScope,applicationScope"
		+"param,cookie, initParam, pageContext");

//String sname=request.getParameter("sname");

%>
<br>
Welcome ${param.sname} <br>
Email is ${sessionScope.email}<br>
Browser ${cookie.browser.value}
</body>
</html>