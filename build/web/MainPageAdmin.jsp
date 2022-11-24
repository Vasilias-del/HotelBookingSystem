<%-- 
    Document   : MainPageAdmin
    Created on : Dec 13, 2018, 10:10:03 PM
    Author     : FIQMANAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="bean.User" %>
<%@ page import="bean.SetBook" %>
<%@ page import="java.util.ArrayList" %>

<c:if test="${sessionScope.memberprofile == null}">
    <% response.sendRedirect(request.getContextPath() + "/sessionterminate.jsp"); %>
</c:if>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hilton Hotel</title>
        <meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

	<title>Hilton Hotel</title>

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
       <header id="home">
		<!-- Background Image -->
		<div class="bg-img" style="background-image: url('./img/blog1.jpg');">
			<div class="overlay"></div>
		</div>
		<!-- /Background Image -->

		<!-- Nav -->
		<nav id="nav" class="navbar nav-transparent">
			<div class="container">

				<div class="navbar-header">
					<!-- Logo -->
					<div class="navbar-brand">
                                            <h2 class="white-text"><a href="#home">Hilton Hotel</a></h2>
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
                                        <li><a>Welcome Again, ${sessionScope.memberprofile.getFullName()}</a></li>
					<li><a href="MainPageAdmin.jsp">Home</a></li>
                                        <li><a href="AdminProfile.jsp">Profile</a></li>
					<li class="has-dropdown"><a href="#home">Manage Booking</a>
						<ul class="dropdown">
							<li><a href="ViewBooking">View Booking</a></li>
                                                        <li><a href="ViewStatusBooking">Edit Booking</a></li>
                                                       
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
                                                                <div style=" background:#ffffff; background-color: rgba(255,255,255,0.5); width:650px; height: 520px; margin:0 auto;">
                                                                    <h2>HELLO ${sessionScope.memberprofile.getFullName()}</h2>
                                                                    <hr>
                                                                    <br>
                                                                        <img src ="./img/${sessionScope.memberprofile.getImage()}" width ="250" height ="230" style="border:1px solid black" >
                                                                        <br><br>
                                                                        <h3><font color="black">You are looking fine today !</font></h3>
                                                                        
                                                                        <hr>
                                                                        <h2> Booking Status </h2>
                                                                   
                                                                        <h3>Accept: [${sessionScope.report.getAccept()}]    Reject: [${sessionScope.report.getReject()}]     Pending: [${sessionScope.report.getPending()}]</h3>   
                                                                        
                                                                </div>
                                                        </section>
						</div>
					</div>
					<!-- /home content -->
                                     <div class="col-md-4 col-md-pull-7">
						<div class="booking-form">
                                                    <form method="post" action="AdminBooking">
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
                                                                <input type="hidden" id="username" name="username" value="Admin">
                                                                 <input type="hidden" id="status" name="status" value="approved">
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
