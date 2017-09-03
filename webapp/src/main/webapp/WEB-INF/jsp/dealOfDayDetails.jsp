<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html 
     PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
     "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<link rel="stylesheet" href="<c:url value="resources/styles/bootstrap/3.3.5/css/bootstrap.min.css" />" />
    <link rel="stylesheet" href="<c:url value="resources/styles/bootstrap/3.3.5/css/bootstrap-theme.min.css" />" />
    <link rel="stylesheet" href="<c:url value="resources/styles/pivotal.css" />" />
	<title>spring-microservices: Deal of day Product Details</title>
</head>

<body>

	<div class="container">
		<div class="row">
			<nav class="navbar navbar-inverse">
				<div class="container-fluid">
					<div class="navbar-header">
						<a title="Spring IO" href="http://www.spring.io"> 
							<img src="<c:url value="resources/images/spring-trans-dark.png"/>" height="50"/>
						</a>
					</div>
					<div>
						<ul class="nav navbar-nav navbar-right">
							<li>
								<a href="http://www.pivotal.io">
									<img alt="Pivotal" title="Pivotal" height="20" src="<c:url value="resources/images/pivotal-logo-600.png" />" />
								</a>
							</li>
						</ul>
					</div>
				</div>
			</nav>
			<div style="text-align: right">[ <a href="<c:url value='/'/>">Home</a>
              | <a href="dealOfDayList">Deal of day Products</a> ]</div>
		</div>
		
		<div class="row">
			
			<h1>Deal of day Product Details and condition</h1>
			
			<div class="container-fluid">
				<div class="row">
					<div class="col-sm-3">
						Product Name:
					</div>
					<div class="col-sm-9">
						${dealOfDay.name}
					</div>
				</div>
				<div class="row">
					<div class="col-sm-3">
						Price:
					</div>
					<div class="col-sm-9">
						${dealOfDay.price}
					</div>
				</div>
				<div class="row">
					<div class="col-sm-3">
						Discount:
					</div>
					<div class="col-sm-9">
						${dealOfDay.discount}
					</div>
				</div>
				<div class="row">
					<div class="col-sm-3">
						Minimum Quantity:
					</div>
					<div class="col-sm-9">
						${dealOfDay.minSku}
					</div>
				</div>
				<div class="row">
					<div class="col-sm-3">
						Total order price:
					</div>
					<div class="col-sm-9">
						${dealOfDay.totalPrice}
					</div>
				</div>
 		</div>
								
		</div>

	</div>

</body>

</html>