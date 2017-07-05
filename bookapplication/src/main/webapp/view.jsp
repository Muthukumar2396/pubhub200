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
	<%@ include file="../../header.jsp"%><br>
<section class="content">
        <div class="container">
	<b>Item Details</b>

	<c:if test="${empty LOGGED_IN_USER}">
		<div class="alert alert-danger" role="alert">
			Please <strong>Login</strong> to add items to cart.
		</div>
	</c:if>

	<form action="../orderItems/addToCart" method="post">
		<input type="hidden" name="book_id" value="${SELECTED_BOOK.id}" />
		<table class="table">
			<tr>
				<th>Book Name</th>
				<th>Price</th>
				<th>Quantity</th>
			</tr>
			<tr>

				<td>${SELECTED_BOOK.name}</td>

				<td>Rs. ${SELECTED_BOOK.price}</td>
				<td><input type="number" name="qty" min="1" value="1" required /></td>

				<c:if test="${!empty LOGGED_IN_USER}">
					<td><button type="submit" class="btn btn-primary btn-sg">Add
							To Cart</button></td>
				</c:if>
				<c:if test="${empty LOGGED_IN_USER}">
					<td><button type="submit" class="btn btn-primary btn-sg"
							disabled>Add To Cart</button></td>
				</c:if>

			</tr>
		</table>
	</form>
	</div>
	</section>
</body>
</html>