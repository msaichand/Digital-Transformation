<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>

<title>Shopping chart</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<div class="jumbotron">
<h1 align="center"> Welcome to Shopping Cart</h1>
<h2 align="center"></h2>
</div>
</div>
<nav class="navbar navbar-default">
<a class="navbar-brand"href="index.jsp"> Home</a>
 <a class="navbar-brand"href="home.html">About</a>
 <a class="navbar-brand"href="index.jsp">logout</a>

</nav>

Please login with your credentials  <br>

	${message}
	<form:form action="isValidUser" method="post">
		<table>
			<tr>
				<td>User Name:</td>
				<td><input type="text" name="name"></td>
			</tr>

			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login"></td>
			</tr>

		</table>



	</form:form>


</body>
</html>