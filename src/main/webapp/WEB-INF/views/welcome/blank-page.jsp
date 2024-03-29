<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<!-- Tell the browser to be responsive to screen width -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<!-- Favicon icon -->
<link rel="icon" type="image/png" sizes="16x16"
	href="https://wrappixel.com/demos/admin-templates/admin-pro/assets/images/favicon.png">
<title>Admin Pro Admin Template - The Ultimate Bootstrap 4 Admin
	Template</title>
<!-- Bootstrap Core CSS -->
<link
	href="https://wrappixel.com/demos/admin-templates/admin-pro/assets/plugins/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Custom CSS -->
<link
	href="${pageContext.request.contextPath }/resources/assets/css/style.css"
	rel="stylesheet">
<!-- You can change the theme colors from here -->
<%-- <link href="${pageContext.request.contextPath }/resources/assets/css/colors/default-dark.css" id="theme" rel="stylesheet"> --%>
<title>Blank Page</title>
</head>
<body class="fix-header card-no-border fix-sidebar">
	<!-- ============================================================== -->
	<!-- Preloader - style you can find in spinners.css -->
	<!-- ============================================================== -->
	<div class="preloader">
		<div class="loader">
			<div class="loader__figure"></div>
			<p class="loader__label">Admin Pro</p>
		</div>
	</div>
	<!-- ============================================================== -->
	<!-- Main wrapper - style you can find in pages.scss -->
	<!-- ============================================================== -->
	<div id="main-wrapper">
		<!-- ============================================================== -->
		<!-- Topbar header - style you can find in pages.scss -->
		<!-- ============================================================== -->
		<header class="topbar"> <nav
			class="navbar top-navbar navbar-expand-md navbar-light"> <!-- ============================================================== -->
		<!-- Logo --> <!-- ============================================================== -->
		<div class="navbar-header">
			<a class="navbar-brand" href="index.html"> <!-- Logo icon -->
				<b> <!--You can put here icon as well // <i class="wi wi-sunset"></i> //-->
					<!-- Dark Logo icon --> <img
					src="https://wrappixel.com/demos/admin-templates/admin-pro/assets/images/logo-icon.png"
					alt="homepage" class="dark-logo" /> <!-- Light Logo icon --> <img
					src="https://wrappixel.com/demos/admin-templates/admin-pro/assets/images/logo-light-icon.png"
					alt="homepage" class="light-logo" />
			</b> <!--End Logo icon --> <!-- Logo text -->
				<span> <!-- dark Logo text --> <img
					src="resources/static/assets/image/FoodBuff-logo (2).png"
					alt="homepage" class="dark-logo" /> <!-- Light Logo text --> <img
					src="https://wrappixel.com/demos/admin-templates/admin-pro/assets/images/logo-light-text.png"
					class="light-logo" alt="homepage" /></span>
			</a>
		</div>
		<!-- ============================================================== -->
		<!-- End Logo --> <!-- ============================================================== -->
		<div class="navbar-collapse">
			<!-- ============================================================== -->
			<!-- toggle and nav items -->
			<!-- ============================================================== -->
			<ul class="navbar-nav mr-auto">
				<!-- This is  -->
				<li class="nav-item"><a
					class="nav-link nav-toggler hidden-md-up waves-effect waves-dark"
					href="javascript:void(0)"><i class="ti-menu"></i></a></li>
				<li class="nav-item"><a
					class="nav-link sidebartoggler hidden-sm-down waves-effect waves-dark"
					href="javascript:void(0)"><i class="ti-menu"></i></a></li>
				<li class="nav-item hidden-sm-down"></li>
			</ul>
			<!-- ============================================================== -->
			<!-- User profile and search -->
			<!-- ============================================================== -->
			<ul class="navbar-nav my-lg-0">
				<!-- ============================================================== -->
				<!-- Search -->
				<!-- ============================================================== -->
				<li class="nav-item hidden-xs-down search-box"><a
					class="nav-link hidden-sm-down waves-effect waves-dark"
					href="javascript:void(0)"><i class="ti-search"></i></a>
					<form class="app-search">
						<input type="text" class="form-control"
							placeholder="Search & enter"> <a class="srh-btn"><i
							class="ti-close"></i></a>
					</form></li>
				<!-- ============================================================== -->
				<!-- Comment -->
				<!-- ============================================================== -->
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle waves-effect waves-dark" href="#"
					data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
						<i class="mdi mdi-message"></i>
						<div class="notify">
							<span class="heartbit"></span> <span class="point"></span>
						</div>
				</a>
					<div
						class="dropdown-menu dropdown-menu-right mailbox animated bounceInDown">
						<ul>
							<li>
								<div class="drop-title">Notifications</div>
							</li>
							<li>
								<div class="message-center">
									<!-- Message -->
									<a href="#">
										<div class="btn btn-danger btn-circle">
											<i class="fa fa-link"></i>
										</div>
										<div class="mail-contnet">
											<h5>Luanch Admin</h5>
											<span class="mail-desc">Just see the my new admin!</span> <span
												class="time">9:30 AM</span>
										</div>
									</a>
									<!-- Message -->
									<a href="#">
										<div class="btn btn-success btn-circle">
											<i class="ti-calendar"></i>
										</div>
										<div class="mail-contnet">
											<h5>Event today</h5>
											<span class="mail-desc">Just a reminder that you have
												event</span> <span class="time">9:10 AM</span>
										</div>
									</a>
									<!-- Message -->
									<a href="#">
										<div class="btn btn-info btn-circle">
											<i class="ti-settings"></i>
										</div>
										<div class="mail-contnet">
											<h5>Settings</h5>
											<span class="mail-desc">You can customize this
												template as you want</span> <span class="time">9:08 AM</span>
										</div>
									</a>
									<!-- Message -->
									<a href="#">
										<div class="btn btn-primary btn-circle">
											<i class="ti-user"></i>
										</div>
										<div class="mail-contnet">
											<h5>Pavan kumar</h5>
											<span class="mail-desc">Just see the my admin!</span> <span
												class="time">9:02 AM</span>
										</div>
									</a>
								</div>
							</li>
							<li><a class="nav-link text-center"
								href="javascript:void(0);"> <strong>Check all
										notifications</strong> <i class="fa fa-angle-right"></i>
							</a></li>
						</ul>
					</div></li>
				<!-- ============================================================== -->
				<!-- End Comment -->
				<!-- ============================================================== -->
				<!-- ============================================================== -->
				<!-- Messages -->
				<!-- ============================================================== -->
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle waves-effect waves-dark" href="#"
					id="2" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <i class="mdi mdi-email"></i>
						<div class="notify">
							<span class="heartbit"></span> <span class="point"></span>
						</div>
				</a>
					<div
						class="dropdown-menu mailbox dropdown-menu-right animated bounceInDown"
						aria-labelledby="2">
						<ul>
							<li>
								<div class="drop-title">You have 4 new messages</div>
							</li>
							<li>
								<div class="message-center">
									<!-- Message -->
									<a href="#">
										<div class="user-img">
											<img
												src="https://wrappixel.com/demos/admin-templates/admin-pro/assets/images/users/1.jpg"
												alt="user" class="img-circle"> <span
												class="profile-status online pull-right"></span>
										</div>
										<div class="mail-contnet">
											<h5>Pavan kumar</h5>
											<span class="mail-desc">Just see the my admin!</span> <span
												class="time">9:30 AM</span>
										</div>
									</a>
									<!-- Message -->
									<a href="#">
										<div class="user-img">
											<img
												src="https://wrappixel.com/demos/admin-templates/admin-pro/assets/images/users/2.jpg"
												alt="user" class="img-circle"> <span
												class="profile-status busy pull-right"></span>
										</div>
										<div class="mail-contnet">
											<h5>Sonu Nigam</h5>
											<span class="mail-desc">I've sung a song! See you at</span> <span
												class="time">9:10 AM</span>
										</div>
									</a>
									<!-- Message -->
									<a href="#">
										<div class="user-img">
											<img
												src="https://wrappixel.com/demos/admin-templates/admin-pro/assets/images/users/3.jpg"
												alt="user" class="img-circle"> <span
												class="profile-status away pull-right"></span>
										</div>
										<div class="mail-contnet">
											<h5>Arijit Sinh</h5>
											<span class="mail-desc">I am a singer!</span> <span
												class="time">9:08 AM</span>
										</div>
									</a>
									<!-- Message -->
									<a href="#">
										<div class="user-img">
											<img
												src="https://wrappixel.com/demos/admin-templates/admin-pro/assets/images/users/4.jpg"
												alt="user" class="img-circle"> <span
												class="profile-status offline pull-right"></span>
										</div>
										<div class="mail-contnet">
											<h5>Pavan kumar</h5>
											<span class="mail-desc">Just see the my admin!</span> <span
												class="time">9:02 AM</span>
										</div>
									</a>
								</div>
							</li>
							<li><a class="nav-link text-center"
								href="javascript:void(0);"> <strong>See all e-Mails</strong>
									<i class="fa fa-angle-right"></i>
							</a></li>
						</ul>
					</div></li>
				<!-- ============================================================== -->
				<!-- End Messages -->
				<!-- ============================================================== -->
				<!-- ============================================================== -->
				<!-- mega menu -->
				<!-- ============================================================== -->
				<li class="nav-item dropdown mega-dropdown"><a
					class="nav-link dropdown-toggle waves-effect waves-dark" href="#"
					data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i
						class="mdi mdi-view-grid"></i></a>
					<div class="dropdown-menu animated bounceInDown">
						<ul class="mega-dropdown-menu row">
							<li class="col-lg-3 col-xlg-2 m-b-30">
								<h4 class="m-b-20">CAROUSEL</h4> <!-- CAROUSEL -->
								<div id="carouselExampleControls" class="carousel slide"
									data-ride="carousel">
									<div class="carousel-inner" role="listbox">
										<div class="carousel-item active">
											<div class="container">
												<img class="d-block img-fluid"
													src="https://wrappixel.com/demos/admin-templates/admin-pro/assets/images/big/img1.jpg"
													alt="First slide">
											</div>
										</div>
										<div class="carousel-item">
											<div class="container">
												<img class="d-block img-fluid"
													src="https://wrappixel.com/demos/admin-templates/admin-pro/assets/images/big/img2.jpg"
													alt="Second slide">
											</div>
										</div>
										<div class="carousel-item">
											<div class="container">
												<img class="d-block img-fluid"
													src="https://wrappixel.com/demos/admin-templates/admin-pro/assets/images/big/img3.jpg"
													alt="Third slide">
											</div>
										</div>
									</div>
									<a class="carousel-control-prev"
										href="#carouselExampleControls" role="button"
										data-slide="prev"> <span
										class="carousel-control-prev-icon" aria-hidden="true"></span>
										<span class="sr-only">Previous</span>
									</a> <a class="carousel-control-next"
										href="#carouselExampleControls" role="button"
										data-slide="next"> <span
										class="carousel-control-next-icon" aria-hidden="true"></span>
										<span class="sr-only">Next</span>
									</a>
								</div> <!-- End CAROUSEL -->
							</li>
							<li class="col-lg-3 m-b-30">
								<h4 class="m-b-20">ACCORDION</h4> <!-- Accordian -->
								<div id="accordion" class="nav-accordion" role="tablist"
									aria-multiselectable="true">
									<div class="card">
										<div class="card-header" role="tab" id="headingOne">
											<h5 class="mb-0">
												<a data-toggle="collapse" data-parent="#accordion"
													href="#collapseOne" aria-expanded="true"
													aria-controls="collapseOne"> Collapsible Group Item #1
												</a>
											</h5>
										</div>
										<div id="collapseOne" class="collapse show" role="tabpanel"
											aria-labelledby="headingOne">
											<div class="card-body">Anim pariatur cliche
												reprehenderit, enim eiusmod high.</div>
										</div>
									</div>
									<div class="card">
										<div class="card-header" role="tab" id="headingTwo">
											<h5 class="mb-0">
												<a class="collapsed" data-toggle="collapse"
													data-parent="#accordion" href="#collapseTwo"
													aria-expanded="false" aria-controls="collapseTwo">
													Collapsible Group Item #2 </a>
											</h5>
										</div>
										<div id="collapseTwo" class="collapse" role="tabpanel"
											aria-labelledby="headingTwo">
											<div class="card-body">Anim pariatur cliche
												reprehenderit, enim eiusmod high life accusamus terry
												richardson ad squid.</div>
										</div>
									</div>
									<div class="card">
										<div class="card-header" role="tab" id="headingThree">
											<h5 class="mb-0">
												<a class="collapsed" data-toggle="collapse"
													data-parent="#accordion" href="#collapseThree"
													aria-expanded="false" aria-controls="collapseThree">
													Collapsible Group Item #3 </a>
											</h5>
										</div>
										<div id="collapseThree" class="collapse" role="tabpanel"
											aria-labelledby="headingThree">
											<div class="card-body">Anim pariatur cliche
												reprehenderit, enim eiusmod high life accusamus terry
												richardson ad squid.</div>
										</div>
									</div>
								</div>
							</li>
							<li class="col-lg-3  m-b-30">
								<h4 class="m-b-20">CONTACT US</h4> <!-- Contact -->
								<form>
									<div class="form-group">
										<input type="text" class="form-control" id="exampleInputname1"
											placeholder="Enter Name">
									</div>
									<div class="form-group">
										<input type="email" class="form-control"
											placeholder="Enter email">
									</div>
									<div class="form-group">
										<textarea class="form-control" id="exampleTextarea" rows="3"
											placeholder="Message"></textarea>
									</div>
									<button type="submit" class="btn btn-info">Submit</button>
								</form>
							</li>
							<li class="col-lg-3 col-xlg-4 m-b-30">
								<h4 class="m-b-20">List style</h4> <!-- List style -->
								<ul class="list-style-none">
									<li><a href="javascript:void(0)"><i
											class="fa fa-check text-success"></i> You can give link</a></li>
									<li><a href="javascript:void(0)"><i
											class="fa fa-check text-success"></i> Give link</a></li>
									<li><a href="javascript:void(0)"><i
											class="fa fa-check text-success"></i> Another Give link</a></li>
									<li><a href="javascript:void(0)"><i
											class="fa fa-check text-success"></i> Forth link</a></li>
									<li><a href="javascript:void(0)"><i
											class="fa fa-check text-success"></i> Another fifth link</a></li>
								</ul>
							</li>
						</ul>
					</div></li>
				<!-- ============================================================== -->
				<!-- End mega menu -->
				<!-- ============================================================== -->
				<!-- ============================================================== -->
				<!-- Language -->
				<!-- ============================================================== -->
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle waves-effect waves-dark" href="#"
					data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
						<i class="flag-icon flag-icon-us"></i>
				</a>
					<div
						class="dropdown-menu dropdown-menu-right animated bounceInDown">
						<a class="dropdown-item" href="#"><i
							class="flag-icon flag-icon-in"></i> India</a> <a
							class="dropdown-item" href="#"><i
							class="flag-icon flag-icon-fr"></i> French</a> <a
							class="dropdown-item" href="#"><i
							class="flag-icon flag-icon-cn"></i> China</a> <a
							class="dropdown-item" href="#"><i
							class="flag-icon flag-icon-de"></i> Dutch</a>
					</div></li>
				<!-- ============================================================== -->
				<!-- Profile -->
				<!-- ============================================================== -->
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle waves-effect waves-dark" href="#"
					data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><img
						src="https://wrappixel.com/demos/admin-templates/admin-pro/assets/images/users/1.jpg"
						alt="user" class="profile-pic" /></a>
					<div class="dropdown-menu dropdown-menu-right animated flipInY">
						<ul class="dropdown-user">
							<li>
								<div class="dw-user-box">
									<div class="u-img">
										<img
											src="https://wrappixel.com/demos/admin-templates/admin-pro/assets/images/users/1.jpg"
											alt="user">
									</div>
									<div class="u-text">
										<h4>Steave Jobs</h4>
										<p class="text-muted">varun@gmail.com</p>
										<a href="pages-profile.html"
											class="btn btn-rounded btn-danger btn-sm">View Profile</a>
									</div>
								</div>
							</li>
							<li role="separator" class="divider"></li>
							<li><a href="#"><i class="ti-user"></i> My Profile</a></li>
							<li><a href="#"><i class="ti-wallet"></i> My Balance</a></li>
							<li><a href="#"><i class="ti-email"></i> Inbox</a></li>
							<li role="separator" class="divider"></li>
							<li><a href="#"><i class="ti-settings"></i> Account
									Setting</a></li>
							<li role="separator" class="divider"></li>
							<li><a href="#"><i class="fa fa-power-off"></i> Logout</a></li>
						</ul>
					</div></li>
			</ul>
		</div>
		</nav> </header>
		<!-- ============================================================== -->
		<!-- End Topbar header -->
		<!-- ============================================================== -->
		<!-- ============================================================== -->
		<!-- Left Sidebar - style you can find in sidebar.scss  -->
		<!-- ============================================================== -->
		<aside class="left-sidebar"> <!-- Sidebar scroll-->
		<div class="scroll-sidebar">
			<!-- Sidebar navigation-->
			<nav class="sidebar-nav">
			<ul id="sidebarnav">
				<li class="user-profile"><a
					class="has-arrow waves-effect waves-dark" href="#"
					aria-expanded="false"><img
						src="https://wrappixel.com/demos/admin-templates/admin-pro/assets/images/users/profile.png"
						alt="user" /><span class="hide-menu">Steave Jobs </span></a>
					<ul aria-expanded="false" class="collapse">
						<li><a href="javascript:void()">My Profile </a></li>
						<li><a href="javascript:void()">Logout</a></li>
					</ul></li>
				
				
			</ul>
			</nav>
			<!-- End Sidebar navigation -->
		</div>
		<!-- End Sidebar scroll--> </aside>
		<!-- ============================================================== -->
		<!-- End Left Sidebar - style you can find in sidebar.scss  -->
		<!-- ============================================================== -->
		<!-- ============================================================== -->
		<!-- Page wrapper  -->
		<!-- ============================================================== -->
		<div class="page-wrapper">

			<!-- ============================================================== -->
			<!-- Container fluid  -->
			<!-- ============================================================== -->
			<div class="container-fluid">
				<!-- ============================================================== -->
				<!-- Bread crumb and right sidebar toggle -->
				<!-- ============================================================== -->
				<div class="row page-titles">
					<div class="col-md-5 align-self-center">
						<h3 class="text-themecolor">Blank Page</h3>
					</div>
					<div class="col-md-7 align-self-center">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="javascript:void(0)">Home</a></li>
							<li class="breadcrumb-item">pages</li>
							<li class="breadcrumb-item active">Blank Page</li>
						</ol>
					</div>
					<div>
						<button
							class="right-side-toggle waves-effect waves-light btn-inverse btn btn-circle btn-sm pull-right m-l-10">
							<i class="ti-settings text-white"></i>
						</button>
					</div>
				</div>
				<!-- ============================================================== -->
				<!-- End Bread crumb and right sidebar toggle -->
				<!-- ============================================================== -->

				<!-- ============================================================== -->
				<!-- Start Page Content -->
				<!-- ============================================================== -->
				<div class="row">
					<div class="col-12">
						<div class="card">
							<div class="card-body">This is some text within a card
								block.</div>
						</div>
					</div>
				</div>
				<!-- ============================================================== -->
				<!-- End PAge Content -->
				<!-- ============================================================== -->
				<!-- ============================================================== -->
				<!-- Right sidebar -->
				<!-- ============================================================== -->
				<!-- .right-sidebar -->
				<div class="right-sidebar">
					<div class="slimscrollright">
						<div class="rpanel-title">
							Service Panel <span><i class="ti-close right-side-toggle"></i></span>
						</div>
						<div class="r-panel-body">
							<ul id="themecolors" class="m-t-20">
								<li><b>With Light sidebar</b></li>
								<li><a href="javascript:void(0)" data-theme="default"
									class="default-theme">1</a></li>
								<li><a href="javascript:void(0)" data-theme="green"
									class="green-theme">2</a></li>
								<li><a href="javascript:void(0)" data-theme="red"
									class="red-theme">3</a></li>
								<li><a href="javascript:void(0)" data-theme="blue"
									class="blue-theme">4</a></li>
								<li><a href="javascript:void(0)" data-theme="purple"
									class="purple-theme">5</a></li>
								<li><a href="javascript:void(0)" data-theme="megna"
									class="megna-theme">6</a></li>
								<li class="d-block m-t-30"><b>With Dark sidebar</b></li>
								<li><a href="javascript:void(0)" data-theme="default-dark"
									class="default-dark-theme working">7</a></li>
								<li><a href="javascript:void(0)" data-theme="green-dark"
									class="green-dark-theme">8</a></li>
								<li><a href="javascript:void(0)" data-theme="red-dark"
									class="red-dark-theme">9</a></li>
								<li><a href="javascript:void(0)" data-theme="blue-dark"
									class="blue-dark-theme">10</a></li>
								<li><a href="javascript:void(0)" data-theme="purple-dark"
									class="purple-dark-theme">11</a></li>
								<li><a href="javascript:void(0)" data-theme="megna-dark"
									class="megna-dark-theme ">12</a></li>
							</ul>
							<ul class="m-t-20 chatonline">
								<li><b>Chat option</b></li>
								<li><a href="javascript:void(0)"><img
										src="https://wrappixel.com/demos/admin-templates/admin-pro/assets/images/users/1.jpg"
										alt="user-img" class="img-circle"> <span>Varun
											Dhavan <small class="text-success">online</small>
									</span></a></li>
								<li><a href="javascript:void(0)"><img
										src="https://wrappixel.com/demos/admin-templates/admin-pro/assets/images/users/2.jpg"
										alt="user-img" class="img-circle"> <span>Genelia
											Deshmukh <small class="text-warning">Away</small>
									</span></a></li>
								<li><a href="javascript:void(0)"><img
										src="https://wrappixel.com/demos/admin-templates/admin-pro/assets/images/users/3.jpg"
										alt="user-img" class="img-circle"> <span>Ritesh
											Deshmukh <small class="text-danger">Busy</small>
									</span></a></li>
								<li><a href="javascript:void(0)"><img
										src="https://wrappixel.com/demos/admin-templates/admin-pro/assets/images/users/4.jpg"
										alt="user-img" class="img-circle"> <span>Arijit
											Sinh <small class="text-muted">Offline</small>
									</span></a></li>
								<li><a href="javascript:void(0)"><img
										src="https://wrappixel.com/demos/admin-templates/admin-pro/assets/images/users/5.jpg"
										alt="user-img" class="img-circle"> <span>Govinda
											Star <small class="text-success">online</small>
									</span></a></li>
								<li><a href="javascript:void(0)"><img
										src="https://wrappixel.com/demos/admin-templates/admin-pro/assets/images/users/6.jpg"
										alt="user-img" class="img-circle"> <span>John
											Abraham<small class="text-success">online</small>
									</span></a></li>
								<li><a href="javascript:void(0)"><img
										src="https://wrappixel.com/demos/admin-templates/admin-pro/assets/images/users/7.jpg"
										alt="user-img" class="img-circle"> <span>Hritik
											Roshan<small class="text-success">online</small>
									</span></a></li>
								<li><a href="javascript:void(0)"><img
										src="https://wrappixel.com/demos/admin-templates/admin-pro/assets/images/users/8.jpg"
										alt="user-img" class="img-circle"> <span>Pwandeep
											rajan <small class="text-success">online</small>
									</span></a></li>
							</ul>
						</div>
					</div>
				</div>
				<!-- ============================================================== -->
				<!-- End Right sidebar -->
				<!-- ============================================================== -->
			</div>
			<!-- ============================================================== -->
			<!-- End Container fluid  -->
			<!-- ============================================================== -->
			<!-- ============================================================== -->
			<!-- footer -->
			<!-- ============================================================== -->
			<footer class="footer"> © 2019 Jinil Soni </footer>
			<!-- ============================================================== -->
			<!-- End footer -->
			<!-- ============================================================== -->
		</div>
		<!-- ============================================================== -->
		<!-- End Page wrapper  -->
		<!-- ============================================================== -->
	</div>
	<!-- ============================================================== -->
	<!-- End Wrapper -->
	<!-- ============================================================== -->
	<!-- ============================================================== -->
	<!-- All Jquery -->
	<!-- ============================================================== -->
	<script
		src="https://wrappixel.com/demos/admin-templates/admin-pro/assets/plugins/jquery/jquery.min.js"></script>
	<!-- Bootstrap tether Core JavaScript -->
	<script
		src="https://wrappixel.com/demos/admin-templates/admin-pro/assets/plugins/bootstrap/js/popper.min.js"></script>
	<script
		src="https://wrappixel.com/demos/admin-templates/admin-pro/assets/plugins/bootstrap/js/bootstrap.min.js"></script>
	<!-- slimscrollbar scrollbar JavaScript -->
	<script
		src="${pageContext.request.contextPath }/resources/assets/js/perfect-scrollbar.jquery.min.js"></script>
	<!--Wave Effects -->
	<script
		src="${pageContext.request.contextPath }/resources/assets/js/waves.js"></script>
	<!--Menu sidebar -->
	<script
		src="${pageContext.request.contextPath }/resources/assets/js/sidebarmenu.js"></script>
	<!--stickey kit -->
	<script
		src="https://wrappixel.com/demos/admin-templates/admin-pro/assets/plugins/sticky-kit-master/dist/sticky-kit.min.js"></script>
	<script
		src="https://wrappixel.com/demos/admin-templates/admin-pro/assets/plugins/sparkline/jquery.sparkline.min.js"></script>
	<!--Custom JavaScript -->
	<script
		src="${pageContext.request.contextPath }/resources/assets/js/custom.min.js"></script>
	<!-- ============================================================== -->
	<!-- Style switcher -->
	<!-- ============================================================== -->
	<script
		src="https://wrappixel.com/demos/admin-templates/admin-pro/assets/plugins/styleswitcher/jQuery.style.switcher.js"></script>
</body>
</html>