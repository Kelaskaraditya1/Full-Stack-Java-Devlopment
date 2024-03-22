<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%!int k=0; %>
<%
int i=Integer.parseInt(request.getParameter("num1"));
int j=Integer.parseInt(request.getParameter("num2"));
out.println("The value of k is"+(i+j));
%>
<%= k%>
</head>
<body bgcolor="red">

</body>
</html>