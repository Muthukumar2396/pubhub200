<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
	<%@ include file="../../header.jsp"%>
	<section class="content">
	<div class="container">
		<div class="container center_div">
			<form action="../users/save" method="post" class="form-horizontal">

				<div class="form-group">
					<label for="first_name" class="col-xs-3 control-label">Username</label>
					<div class="col-xs-3">
						<input type="text" class="form-control" placeholder="username"
							id="name" name="name">
					</div>
				</div>
				<div class="form-group">
					<label for="email" class="col-xs-3 control-label">Email</label>
					<div class="col-xs-3">
						<input type="email" placeholder="emailid" class="form-control"
							id="email" name="email">
					</div>
				</div>
				<div class="form-group">
					<label for="password" class="col-xs-3 control-label">Password</label>
					<div class="col-xs-3">
						<input type="password" class="form-control" id="passwword"
							placeholder="password" name="password">
					</div>
				</div>
				<div class="form-inline">
					<div class="col-xs-offset-3 col-xs-5">
						<button type="submit" class="btn btn-primary btn-sg">Sign
							up</button>
						<a href="../login.jsp"><span class="btn btn-primary btn-sg">Sign
								In</span></a>
					</div>
				</div>
			</form>
		</div>
		</div>
		</section>
</body>
</html>