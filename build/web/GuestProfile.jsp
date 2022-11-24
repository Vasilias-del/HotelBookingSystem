<%-- 
    Document   : AdminProfile
    Created on : Dec 23, 2018, 9:56:27 PM
    Author     : Imran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="bean.User" %>
<%@ page import="bean.SetBook" %>
<%@ page import="java.util.ArrayList" %>

<c:if test="${sessionScope.userprofile== null}">
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
                                        <li><a href="GuestProfile.jsp">Welcome Again, ${sessionScope.userprofile.getUsername()}</a></li>
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
                <section id="banner">
					 <center><h2>My Profile</h2> </center>
					<hr>
                                        <center><img src ="./img/${sessionScope.userprofile.getImage()}" width ="350" ></center>
                                                <form method="post" action="UserUpdateProfile" style=" width: 100%;">
						<table style=" background:white; background-color:transparent; width:650px; height: 205px; margin:0 auto; color: #black;" >
							<tr>
							<td><b><p>My Full Name</p>
							<td><b><input type="text" name="fullname" id="fullname" value="${sessionScope.userprofile.getFullName()}" />
							</tr>
							
							<tr>
							<td><b><p>Username</p>
							<td><b><input type="text" name="username" id="username" value="${sessionScope.userprofile.getUsername()}" readonly />
							</tr>
						
							<tr>
							<td><b><p>Password</p>
							<td><b><input type="text" name="password" id="password" value="${sessionScope.userprofile.getPassword()}"/>
							</tr>
						</table>
                                                        <br>
                                                        <input type="hidden" name="image" id="image" value="${sessionScope.userprofile.getImage()}"/>
                                                        <center>   <input class="button alt icon fa-check" style ="background-color: white;color: black; border: 2px solid #4CAF50; " type="submit" class="button" value="Update"/></centre>
                                                </form>
						<br>
                                                
					<hr>
	
				</section>
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

