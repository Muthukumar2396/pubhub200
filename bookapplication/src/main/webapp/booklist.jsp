<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Book Name</th>
				<th>Price</th>
				<th>Release Date</th>
			</tr>
		</thead>
		<tbody>
	      <c:forEach items="${books}" var="book">
	       <tr>
				<td>${book.id}</td>
				<td>${book.name}</td>
				<td>${book.price}</td>
				<td>${book.releasedDate}</td>
				<td><a href="/books/view/${book.id}">View</a></td>
				
			  </tr>
				
			</c:forEach>
		</tbody>
	</table>
</body>
</html>