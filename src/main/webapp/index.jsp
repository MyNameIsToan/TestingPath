<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./servlet" method="post" enctype="multipart/form-data">
		<input type="submit"/>
	</form>
	<%=request.getAttribute("path")%>
</body>
</html>