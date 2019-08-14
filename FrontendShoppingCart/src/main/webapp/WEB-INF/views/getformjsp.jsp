<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<form:form action="${pageContext.request.contextPath}/addcategory" modelAttribute="cObj" method="post">
			
			<tr>
			<td>Enter category name</td>
			<td><form:input path="categoryName"/></td>
			</tr>
			<tr>
			<td>Enter categoryDescription</td>
			<td><form:input path="categoryDescription"/></td>
			</tr>
			<td><input type="submit" value="submit">
		</form:form>
		
		</tr>
	
	</table>
</body>
<a href="viewcategory">click here to see category</a>
</html>