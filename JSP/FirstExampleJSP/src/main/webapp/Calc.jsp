<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import= "java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
<input type="text" name="txtNum">
<input type="submit" value="submit">
</form>

<%! 
	int cube(int num){
	return( num*num*num);
	
}
%>

<%
	String num=request.getParameter("txtNum");
	if(num!=null){
		
		out.println("cube="+cube(Integer.parseInt(num)));
				
	}

%>
<%=new Date() %>
</body>
</html>