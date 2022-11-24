<%-- 
    Document   : MainPageUser
    Created on : Dec 14, 2018, 12:18:22 AM
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
                                        <li><a href="GuestProfile.jsp">Welcome Again, ${sessionScope.userprofile.getUsername()}</a></li>
					<li><a href="#home">Home</a></li>
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
		<div class="home-wrapper">
			<div class="container">
				<div class="row">
					<!-- home content -->
					<div class="col-md-7 col-md-push-5">
						<div class="home-content">
							<section id="banner">
                                                                <div style=" background:#ffffff; background-color: rgba(255,255,255,0.5); width:650px; height: 500px; margin:0 auto;">
                                                                    <h2 style="padding-top:10px; text-align: center;font-size: 1em;margin-bottom: 10px;text-transform: uppercase;font-weight: bold; color: #333;">HELLO ${sessionScope.userprofile.getFullName()}</h2>
                                                                    <hr>
                                                                    <br>
                                                                        <img src ="./img/${sessionScope.userprofile.getImage()}" width ="250" height ="230" style="border:1px solid black">
                                                                        <br><br>
                                                                        <h3> Name : ${sessionScope.userprofile.getFullName()} </h3>
                                                                        <h3><font color="black">Now EveryOne can Go to Holiday!</font></h3>

                                                                </div>
                                                        </section>
						</div>
					</div>
					<!-- /home content -->
                                    <div class="col-md-4 col-md-pull-7">
						<div class="booking-form">
                                                    <form method="post" action="UserBooking1">
								<div class="form-group">
									<span class="form-label">Full Name</span>
									<input class="form-control" type="text" name="name" id="name" placeholder="Enter Your name" required>
								</div>
                                                            
                                                                <div class="form-group">
									<span class="form-label">Phone Number</span>
									<input class="form-control" name="phone" id="phone" type="text" placeholder="Enter Your Phone Number" required>
								</div>
                                                            
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<span class="form-label">Check In</span>
											<input class="form-control" name="checkin" id="checkin" type="date" required>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group">
											<span class="form-label">Check out</span>
											<input class="form-control" name="checkout" id="checkout" type="date" required>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-sm-4">
										<div class="form-group">
											<span class="form-label">Rooms</span>
											<select class="form-control" name="roomtype" id="roomtype" required>
												<option>1</option>
												<option>2</option>
												<option>3</option>
											</select>
											<span class="select-arrow"></span>
										</div>
									</div>
									<div class="col-sm-4">
										<div class="form-group">
											<span class="form-label">Adults</span>
											<select class="form-control" name="adult" id="adult" required>
												<option>1</option>
												<option>2</option>
												<option>3</option>
											</select>
											<span class="select-arrow"></span>
										</div>
									</div>
									<div class="col-sm-4">
										<div class="form-group">
											<span class="form-label">Children</span>
											<select class="form-control" name="children" id="children">
												<option>0</option>
												<option>1</option>
												<option>2</option>
											</select>
											<span class="select-arrow"></span>
										</div>
									</div>
								</div>
                                                                 <input type="hidden" id="username" name="username" value="${sessionScope.userprofile.getUsername()}">
                                                                 <input type="hidden" id="status" name="status" value="pending">
								<div class="form-btn">
									<button class="submit-btn">Booking Now</button>
								</div>
							</form>
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
