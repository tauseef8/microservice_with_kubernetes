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
	<title>Deal of the day</title>
</head>

<body>

	<div class="page-out">
		<div class="page-in">
			<div class="page">
				<div class="main">
					<div class="header">
						<div class="header-top">
							<h1>Deal Of The Day</h1>
						</div>
						<div class="header-bottom">
							<h2>We Make Your Dream come Alive!</h2>
						</div>
						<div class="topmenu">
							<ul>
								<li
									style="background: transparent none repeat scroll 0% 50%; padding-left: 0px;"><a
									href="/"><span>Home</span></a></li>
								<li><a href="/dealOfDayList"><span>Deal Of the Day</span></a></li>
							</ul>
						</div>
					</div>
					
					
					
					
					<div class="content" style="min-height: 350px">
					
					 <c:forEach items="${dealOfDays}" var="dealOfDay">
					
					<div class="product-wrapper">
						<div class="img-wrapper">
							<img src="resources/images/${dealOfDay.imgAdd}" height="180px" width="180px"/>
						</div>
								<div class="container-fluid">
									<div class="row">
										<div class="col-sm-3">Name:</div>
										<div class="col-sm-9">${dealOfDay.name}</div>
									</div>
									<div class="row">
										<div class="col-sm-3">Price:</div>
										<div class="col-sm-9">${dealOfDay.price}</div>
									</div>
									<div class="row">
										<div class="col-sm-3">Sale:</div>
										<div class="col-sm-9">${dealOfDay.discount}</div>
									</div>
									<div class="row">
										<div class="col-sm-3">SKU:</div>
										<div class="col-sm-9">${dealOfDay.minSku}</div>
									</div>
									<div class="row">
										<div class="col-sm-3">Value:</div>
										<div class="col-sm-9">${dealOfDay.totalPrice}</div>
									</div>

								</div>

								<div class="btn">Place Order</div>
					</div>
					
			</c:forEach> 
			</div>		
					<div class="footer">

					</div>
				</div>
			</div>
		</div>
	</div>

</body>

</html>