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
		OpenAccountBean opa=(OpenAccountBean)request.getAttribute("bean");
		out.println("Account Closed");
	%>
</body>
</html>