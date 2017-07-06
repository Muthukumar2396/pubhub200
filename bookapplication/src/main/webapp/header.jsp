<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="../css/bootstrap.min.css" rel="stylesheet">
<link href="../css/custom.css" rel="stylesheet">

<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800'
	rel='stylesheet' type='text/css'>
	<!-- jQuery -->
<script src="../js/jquery-1.11.3.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="../js/bootstrap.min.js"></script>

<!-- Plugin JavaScript -->
<script src="../js/jquery.easing.min.js"></script>

<!-- Custom Javascript -->
<script src="../js/custom.js"></script>

<nav id="siteNav" class="navbar navbar-default navbar-fixed-top"
	role="navigation">
	<div class="container">
		<!-- Logo and responsive toggle -->
		<div class="navbar-header">
			<a class="navbar-brand" href="/"> <span
				class="glyphicon glyphicon-fire"></span> Book Application
			</a>
		</div>
		<!-- Navbar links -->
		<div class="collapse navbar-collapse" id="navbar">
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="/">Home</a></li>
				<c:if test="${!empty LOGGED_IN_USER}">
					<li class="nav-item"><a class="nav-link"> Welcome
							${LOGGED_IN_USER.name} </a></li>
					<li class="nav-item"><a class="nav-link" href="/books">List
							Books</a></li>
							<li class="nav-item"><a class="nav-link"
						href="../../orders/myorders">Myorders</a></li>
							<li class="nav-item"><a class="nav-link"
						href="../../orders/cart">Cart</a></li>
					<li class="nav-item"><a class="nav-link"
						href="../../author/logout">Logout</a></li>
				</c:if>
				<c:if test="${empty LOGGED_IN_USER}">
					<li><a href="../users/register">Signup</a></li>
					<li><a href="../users/login">Signin</a></li>
				</c:if>
				<li><a href="#">Contact</a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container -->
</nav>
