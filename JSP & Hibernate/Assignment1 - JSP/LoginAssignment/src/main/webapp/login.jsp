<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
	String emailVal="abc@gmail.com";
	String pass="password";
%>

<%
	String email=request.getParameter("email");
	String password=request.getParameter("password");
	if(email.equals("") || password.equals(""))throw new Exception("Email or Password is empty");
	if(email.equals(emailVal) && password.equals(pass))
		out.println("Login successful ");
	else
		out.println("invalid email or password ");
%>



</body>
</html>