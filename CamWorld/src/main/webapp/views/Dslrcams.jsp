

  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <meta http-equiv="refresh" content="0; URL=./SomeController" /> -->
<title>Shopping Cart</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style>
  .jumbotron {
      background-color: #f4511e;
      color: #fff;
      padding: 100px 25px;
  }
  .container-fluid {
      padding: 60px 50px;
  }
  .bg-grey {
      background-color: #f6f6f6;
  }
  .logo-small {
      color: #f4511e;
      font-size: 50px;
  }
  .logo {
      color: #f4511e;
      font-size: 200px;
  }
  @media screen and (max-width: 768px) {
    .col-sm-4 {
      text-align: center;
      margin: 25px 0;
    }
  }
  </style>
</head>
<body>
<a href="view">HOME</a>
<!-- Container (Portfolio Section) -->
<div class="container-fluid text-center bg-grey">
  <h2>Categories</h2><br>
  <h4></h4>
  <div class="row text-center">
    <div class="col-sm-4">
      <div class="thumbnail">
        <img src="<c:url value="/resources/images/dslr2.PNG"/>" class="img-responsive" alt="dslr2"/></a>
        
        <p><strong></strong></p>
        <p></p>
      </div>
    </div>
    <div class="col-sm-4">
      <div class="thumbnail">
       <img src="<c:url value="/resources/images/dslr3.PNG"/>" class="img-responsive" alt="dslr3"/></a>
        <p><strong></strong></p>
        <p></p>
      </div>
    </div>
   
  </div>
</div>





</body>
</html>
	