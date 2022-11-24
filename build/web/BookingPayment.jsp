<%-- 
    Document   : BookingPayment
    Created on : Dec 14, 2018, 5:02:13 PM
    Author     : FIQMANAN
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hotel Hilton</title>
        <!-- Google font -->
	<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700%7CVarela+Round" rel="stylesheet">

	<!-- Bootstrap -->
	<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css" />

	<!-- Owl Carousel -->
	<link type="text/css" rel="stylesheet" href="css/owl.carousel.css" />
	<link type="text/css" rel="stylesheet" href="css/owl.theme.default.css" />

	<!-- Magnific Popup -->
	<link type="text/css" rel="stylesheet" href="css/magnific-popup.css" />

	<!-- Font Awesome Icon -->
	<link rel="stylesheet" href="css/font-awesome.min.css">

	<!-- Custom stlylesheet -->
	<link type="text/css" rel="stylesheet" href="css/style.css" />
        <script>
		$( function() {
		$( "#datepicker" ).datepicker();
		} );
        </script>
        
    </head>
    <body>
        <c:if test="${sessionScope.userprofile == null}">
             <% response.sendRedirect(request.getContextPath() + "/sessionterminate.jsp"); %>
        </c:if>
        
        <header id="home">
		<!-- Background Image -->
		<div class="bg-img" style="background-image: url('./img/back6.jpg');">
			<div class="overlay"></div>
		</div>
		<!-- /Background Image -->

		<!-- Nav -->
		<nav id="nav" class="navbar nav-transparent">
			<div class="container">

				<div class="navbar-header">
					<!-- Logo -->
					<div class="navbar-brand">
                                            <h2 class="white-text"><a href="#home">Hotel Hilton</a></h2>
					</div>
					<!-- /Logo -->

					<!-- Collapse nav button -->
					<div class="nav-collapse">
						<span></span>
					</div>
					<!-- /Collapse nav button -->
				</div>

				<!--  Main navigation  -->
				<ul class="main-nav nav navbar-nav navbar-right">
                                        <li><a>Welcome Again, ${sessionScope.userprofile.getUsername()}</a></li>
					<li><a href="MainPageUser.jsp">Home</a></li>
                                        <li><a href="#about">Our Room</a></li>
					<li class="has-dropdown"><a href="#home">Manage Booking</a>
						<ul class="dropdown">
							<li><a href="RetrieveBooking">Booking History</a></li>
                                                        <li><a href="RetrieveBooking2">Customize Booking</a></li>
						</ul>
					</li>
					<li><a href="logout.jsp">Log Out</a></li>
				</ul>
				<!-- /Main navigation -->

			</div>
		</nav>
		<!-- /Nav -->

		<!-- home wrapper -->
		<div class="home-wrapper" style="padding: 50px;">
                    <div class="container " >
				<div class="row">
					<!-- home content -->
					<div class="col-md-7 col-md-push-5">
						<div class="home-content">
                                                        
                                                            <div class="booking-form">
                                                            <form method="post" action="userpay">
                                                                <div>
                                                                    <h3>Please Enter your Payment Detail</h3>
                                                                    <hr>
                                                                    
                                                                        <div class="form-group">
                                                                            <span class="form-label">Card No:</span>
                                                                            <input style="margin:10px; width:50%;" type="text" placeholder="Card No" name="cardno" id="cardno" required>
                                                                        </div>
                                                                        
                                                                        <div class="row"> 
                                                                            <div class="col-sm-10" style="align-content: center">
                                                                        <div class="form-group" style="align-content: center; padding-left: 90px;">
                                                                        <span style="align-content: center" class="form-label">Bank Name:</span>
                                                                            <select class="form-control"  name="BankName" id="BankName" required>
												<option>Bank Islam</option>
												<option>CIMB Bank</option>
												<option>RHB Bank</option>
                                                                                                <option>Public Bank</option>
                                                                                                <option>Hong Leong Bank</option>
											</select>
                                                                        <span class="select-arrow"></span>
                                                                        </div>
                                                                        </div>
                                                                        </div>
                                                                    
                                                                        <div class="form-group">
                                                                        <span class="form-label">Expired Date:</span>
                                                                        <input style="margin:10px; width:50%;" type="text" placeholder="mm/yy" name="ExpiredDate" id="ExpiredDate" required>
                                                                        </div>
                                                                        
                                                                        <div class="form-group">
                                                                        <span class="form-label">CVV:</span>
                                                                        <input style="margin:10px; width:50%;" type="password" placeholder="CVV" name="CVV" id="CVV" required>
                                                                        </div>
                                                                         <input type="hidden" id="username" name="username" value="${sessionScope.userprofile.getUsername()}">
                                                                         <input type="hidden" id="price" name="price" value="${sessionScope.userbooking.getPrice()}">
                                                                        
                                                                        <div class="form-btn">
									<button class="submit-btn">Pay Now</button>
                                                                        </div>
                                                                    
                                                                </div>
                                                            </form>
                                                            </div>
                                                    </div>							        
                                        </div>
					
					<!-- /home content -->
                                    <div class="col-md-4 col-md-pull-7">
						<div class="booking-form">
                                                    
                                                    <h3 style="color: #5bc0de">Booking Detail</h3>
                                                    <hr>
                                                    <h4>Your BookingID: <a> ${sessionScope.userbooking.getBookingID()}</a> </h4>
                                                    <h5>Full Name:<a> ${sessionScope.userbooking.getName()}</a> </h5>
                                                    <h5>Phone No: <a> ${sessionScope.userbooking.getPhone()}</a></h5>
                                                    <h5>Room Type: <a>${sessionScope.userbooking.getRoomtype()}</a></h5>
                                                    <h5>Check-In Date: <a>${sessionScope.userbooking.getCheckin()}</a></h5>
                                                    <h5>Check-Out Date:<a> ${sessionScope.userbooking.getCheckout()}</a></h5>
                                                    <h5>Total Adult: <a> ${sessionScope.userbooking.getAdult()} people(s)</a></h5>
                                                    <h5>Total Children: <a> ${sessionScope.userbooking.getChildren()} children</a></h5>
                                                    <h5>Price: RM<a> ${sessionScope.userbooking.getPrice()}</a></h5>
                                                    <hr>
                                                    <h6> Please check All your information first before proceed to the payment</h6>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- /home wrapper -->
	</header>
	<!-- /Header -->
        
        <div id="about" class="section md-padding">

		<!-- Container -->
		<div class="container">

			<!-- Row -->
			<div class="row">

				<!-- Section header -->
				<div class="section-header text-center">
					<h2 class="title">Welcome to Our Hotel</h2>
				</div>
				<!-- /Section header -->

				<!-- about -->
				<div class="col-md-4">
					<div class="about" style="background-image: url('./img/room1.jpg'); background-size: cover; opacity: .7;">
						<i class="fa fa-cogs"></i>
						<h3>Room1</h3>
						<p>Queen Bed, With the breathtaking view outside the windows and luxury night with your love</p>
					</div>
				</div>
				<!-- /about -->

				<!-- about -->
				<div class="col-md-4">
					<div class="about" style="background-image: url('./img/room2.jpg'); background-size: cover; opacity: .7;">
						<i class="fa fa-magic"></i>
						<h3>Room2</h3>
						<p>Maecenas tempus tellus eget condimentum rhoncus sem quam semper libero sit amet.</p>
					</div>
				</div>
				<!-- /about -->

				<!-- about -->
				<div class="col-md-4">
					<div class="about" style="background-image: url('./img/room3.jpg'); background-size: cover; opacity: .7;">
						<i class="fa fa-mobile"></i>
						<h3>Room3</h3>
						<p>Maecenas tempus tellus eget condimentum rhoncus sem quam semper libero sit amet.</p>
					</div>
				</div>
				<!-- /about -->

			</div>
			<!-- /Row -->

		</div>
		<!-- /Container -->

	</div>
	<!-- /About -->

	<!-- Footer -->
	<footer id="footer" class="sm-padding bg-dark">

		<!-- Container -->
		<div class="container">

			<!-- Row -->
			<div class="row">

				<div class="col-md-12">

					<!-- footer logo -->
					<div class="footer-logo">
						<a href="index.html"><img src="img/logo-alt.png" alt="logo"></a>
					</div>
					<!-- /footer logo -->

					<!-- footer follow -->
					<ul class="footer-follow">
						<li><a href="#"><i class="fa fa-facebook"></i></a></li>
						<li><a href="#"><i class="fa fa-twitter"></i></a></li>
						<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
						<li><a href="#"><i class="fa fa-instagram"></i></a></li>
						<li><a href="#"><i class="fa fa-linkedin"></i></a></li>
						<li><a href="#"><i class="fa fa-youtube"></i></a></li>
					</ul>
					<!-- /footer follow -->

					<!-- footer copyright -->
					<div class="footer-copyright">
						<p>Copyright © 2018. All Rights Reserved. Designed by <a href="#home"> Half Blood Prince</a></p>
					</div>
					<!-- /footer copyright -->

				</div>

			</div>
			<!-- /Row -->

		</div>
		<!-- /Container -->

	</footer>
	<!-- /Footer -->

	<!-- Back to top -->
	<div id="back-to-top"></div>
	<!-- /Back to top -->

	<!-- Preloader -->
	<div id="preloader">
		<div class="preloader">
			<span></span>
			<span></span>
			<span></span>
			<span></span>
		</div>
	</div>
	<!-- /Preloader -->

	<!-- jQuery Plugins -->
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/owl.carousel.min.js"></script>
	<script type="text/javascript" src="js/jquery.magnific-popup.js"></script>
	<script type="text/javascript" src="js/main.js"></script>
    </body>
</html>
