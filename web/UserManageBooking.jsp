<%-- 
    Document   : MainPageUser
    Created on : Dec 14, 2018, 12:18:22 AM
    Author     : FIQMANAN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="bean.UserBook" %>
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
        <style>
            .table-wrapper-scroll-y {
                display: block;
                max-height: 425px;
                overflow-y: auto;
                -ms-overflow-style: -ms-autohiding-scrollbar;
            }
        </style>
        
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
		<div class="home-wrapper">
			<div class="container">
				<div class="row">
					
                                    <div class="well col-xs-10 col-sm-10 col-md-6 col-xs-offset-1 col-sm-offset-1 col-md-offset-3" style="padding-left: 35px; margin-left: 110px; margin-top: 50px; width: 1000px;">
						<div class="booking-form">
                                                    <h1>List of Booking</h1>
                                                     <table class="table-wrapper-scroll-y" style="align-content: center;">
                                                         <tr>
                                                             <th style="text-align: center; padding:10px; border: 1px solid black; background-color: lightcyan; color: #000;">Booking ID</th>
                                                             <th style="text-align: center; padding-left:50px; border: 1px solid black; background-color: lightcyan; color: #000;">Name</th>
                                                             <th style="text-align: center; padding:10px; border: 1px solid black; background-color: lightcyan; color: #000;">Roomtype</th>
                                                             <th style="text-align: center; padding:10px; border: 1px solid black; background-color: lightcyan; color: #000;">Check-in Date</th>
                                                             <th style="text-align: center; padding:10px; border: 1px solid black; background-color: lightcyan; color: #000;">Check-out Date</th>
                                                             <th style="text-align: center; padding:10px; border: 1px solid black; background-color: lightcyan; color: #000;">Adult</th>
                                                             <th style="text-align: center; padding:10px; border: 1px solid black; background-color: lightcyan; color: #000;">Children</th>
                                                             <th style="text-align: center; padding:10px; border: 1px solid black; background-color: lightcyan; color: #000;">Phone</th>
                                                             <th style="text-align: center; padding:10px; border: 1px solid black; background-color: lightcyan; color: #000;">Status</th>
                                                         </tr>
                                                          <c:forEach items="${sessionScope.userbook}" var="book" varStatus="loop">

                                                         <tr>
                                                            <td style="color:black; border: 1px solid black;"><c:out value="${book.bookingID}"/></td>
                                                            <td style="color:black; border: 1px solid black;"><c:out value="${book.name}"/></td>        
                                                            <td style="color:black; border: 1px solid black;"><c:out value="${book.roomtype}"/></td>
                                                            <td style="color:black; border: 1px solid black;"><c:out value="${book.checkin}"/></td>
                                                            <td style="color:black; border: 1px solid black;"><c:out value="${book.checkout}"/></td>
                                                            <td style="color:black; border: 1px solid black;"><c:out value="${book.adult}"/></td>
                                                            <td style="color:black; border: 1px solid black;"><c:out value="${book.children}"/></td>
                                                            <td style="color:black; border: 1px solid black;"><c:out value="${book.phone}"/></td>
                                                            <td style="color:black; border: 1px solid black;"><c:out value="${book.status}"/></td>
                                                        </tr>

                                                    </c:forEach>
                                                     </table>
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