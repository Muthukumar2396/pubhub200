<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/custom.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="../../header.jsp"%>
	<section class="content">
        <div class="container">
	<span> <b> Sort by : </b>
	</span> Price :
	<a href="../books?price=asc"> <span class="btn btn-primary btn-sg">Low
			to High</span>
	</a>
	<a href="../books?price=desc"><span class="btn btn-primary btn-sg">High
			to Low</span></a>
	<a href="../books?released_date=desc"><span
		class="btn btn-primary btn-sg">Newest First</span></a>
	<a href="../books/sales"><span class="btn btn-primary btn-sg">Top
			Books</span></a>
	<table class="table">
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
					<td><a href="../books/${book.id}"
						class="btn btn-primary btn-sg">View</a></td>

				</tr>

			</c:forEach>
		</tbody>
	</table>
</div>
</section>
</body>
</html>