<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="banking_app.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
OpenAccountBean acb=(OpenAccountBean)request.getAttribute("bean");

if(acb==null)
{
	out.println("Insufficient balnce");
}
else
{
out.println(acb.getAmount());
}
%>
</body>
</html>