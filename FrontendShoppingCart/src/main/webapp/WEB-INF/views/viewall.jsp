<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	

				<table>
				
				<c:forEach items="${cList}" var="cl">
				<tr>
				
				
				<td>${cl.categoryId}</td>
				  <td>${cl.categoryName}</td>
				  <td>${cl.categoryDescription}</td>
				
				
				
				
				<td><a href="update/${cl.categoryId}">update</a></td>  
				<td><a href="delete/${cl.categoryId}">delete</a></td>
				</tr>
				</c:forEach>
				
				</table>
				
	<a href="${pageContext.request.contextPath}/">homePage</a>
			
</body>

</html>