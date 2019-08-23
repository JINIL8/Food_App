<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="../welcome/htmlhead.jsp"></jsp:include>
<title>Add Restaurant</title>
<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/timepicker/1.3.5/jquery.timepicker.min.css">
<script src="//cdnjs.cloudflare.com/ajax/libs/timepicker/1.3.5/jquery.timepicker.min.js"></script>

</head>
<body>
	<jsp:include page="../welcome/preloader.jsp"></jsp:include>

	<div id="main-wrapper">

		<jsp:include page="../welcome/header.jsp"></jsp:include>

		<jsp:include page="../welcome/left-sidebar.jsp"></jsp:include>

		<div class="page-wrapper" style="padding-top: 70px;">

			<!-- ============================================================== -->
			<!-- Container fluid  -->
			<!-- ============================================================== -->
			<div class="container-fluid">
				<!-- ============================================================== -->
				<!-- Bread crumb and right sidebar toggle -->
				<!-- ============================================================== -->
				<div class="row page-titles">
					<div class="col-md-5 align-self-center">
						<h3 class="text-themecolor">Add Restaurant</h3>
					</div>
					<div class="col-md-7 align-self-center">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="javascript:void(0)">Home</a></li>
							<li class="breadcrumb-item">Restaurants</li>
							<li class="breadcrumb-item active">Add Restaurant</li>
						</ol>
					</div>
					<div class="">
						<button
							class="right-side-toggle waves-effect waves-light btn-inverse btn btn-circle btn-sm pull-right m-l-10">
							<i class="ti-user text-white"></i>
						</button>
					</div>
				</div>
				<!-- ============================================================== -->
				<!-- End Bread crumb and right sidebar toggle -->
				<!-- ============================================================== -->
				<%
					String usercreated = (String) session.getAttribute("user-created");
					if (usercreated != null) {
						if (usercreated.equals("success")) {
				%>
				<!-- Start Notification -->
				<div id="notification-bar" class="alert alert-success">
					<i class="ti-user"></i> User Added Successfully
					<button onclick="sessionclear()" type="button" class="close"
						data-dismiss="alert" aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<!-- End Notification -->

				<%
					}
						session.setAttribute("user-created", "completed");
					}
				%>
				<!-- ============================================================== -->
				<!-- Start Page Content -->
				<!-- ============================================================== -->
				<div class="row">
					<div class="col-lg-12">
						<div class="card">
							<div class="card-header bg-info">
								<h4 class="m-b-0 text-white">Add form</h4>
							</div>
							<div class="card-body">
								<form action="#">
									<div class="form-body">
										<h3 class="card-title">Restaurant Info</h3>
										<hr>
										<div class="row p-t-20">
											<div class="col-md-6">
												<div class="form-group">
													<label class="control-label">Restaurant Name</label> <input
														required type="text" id="name"
														class="form-control" placeholder="Enter Restaurant Name">
													<!-- <small class="form-control-feedback"> This is inline help </small> -->
												</div>
											</div>
											<!--/span-->
											<div class="col-md-6">
												<div class="form-group">
													<label class="control-label">Restaurant EmailId</label> <input
														required type="email" id="email_id" class="form-control"
														placeholder="Enter Restaurant EmailId">

													<!-- <small class="form-control-feedback"> This field has error. </small>  -->
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<label class="control-label">Restaurant ContactNo</label> <input
														required type="text" id="mobileno"
														class="form-control form-control-danger"
														placeholder="Enter Restaurant ContactNo">
													<!-- <small class="form-control-feedback"> This field has error. </small>  -->
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<label class="control-label">Restaurant Address</label> <input
														required type="text" id="address" class="form-control"
														placeholder="Enter Restaurant Address">
													<!-- <small class="form-control-feedback"> This is inline help </small> -->
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<label class="control-label">Restaurant Password</label> <input
														required type="password" id="password" class="form-control"
														placeholder="Enter Restaurant Password">
													<!-- <small class="form-control-feedback"> This is inline help </small> -->
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<label class="control-label">Resaturant Type</label>
													<div class="m-b-10">
														<label class="custom-control custom-radio"> <input
															id="isveg" name="veg" type="radio"
															class="custom-control-input"> <span
															class="custom-control-label">Veg</span>
														</label> 
														<label class="custom-control custom-radio"> 
														<input id="isnonveg" name="nonveg" type="radio"
															class="custom-control-input"> <span
															class="custom-control-label">Non-Veg</span>
														</label>
													</div>
												</div>
											</div>
											<!--/span-->
										</div>
										<!--/row-->
										<div class="row">
											<!--/span-->
											<div class="col-md-6">
												<div class="form-group">
													<label class="control-label">Opening Time</label> <input
														required type="text" id="opentiming" class="form-control"
														placeholder="Enter Restaurant Opening Time">
													<!-- <small class="form-control-feedback"> This is inline help </small> -->
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<label class="control-label">Closing Time</label> <input
														required type="text" id="closetiming" class="form-control"
														placeholder="Enter Restaurant Closing Time">
													<!-- <small class="form-control-feedback"> This is inline help </small> -->
												</div>
											</div>

											<div class="row p-t-20"></div>

											<div class="col-md-6">
												<div class="form-group">
													<label class="control-label">Home Delivery Charges</label>
													<input required type="text" id="homedelivery_charges"
														class="form-control"
														placeholder="Enter Restaurant HomeDeliveryCharges">
												</div>
											</div>
											<!--/span-->
											<div class="col-md-6">
												<div class="form-group">
													<label class="control-label">Packing Charges</label> <input
														required type="text" id="packing_charges"
														class="form-control"
														placeholder="Enter Restaurant PackingCharges">
												</div>
											</div>
											<!--/span-->

											<!--/row-->

											<div class="col-md-6">
												<div class="form-group">
													<label class="control-label">Cusines</label> <input
														required type="text" id="cusines" class="form-control"
														placeholder="Enter Cusines">
												</div>
											</div>
											<!--/span-->

											<!--/span-->
										</div>
										<div class="form-actions">
											<button type="button" onclick="saveRestaurant()"
												class="btn btn-success">
												<i class="fa fa-check"></i> Save
											</button>
											<button type="button" class="btn btn-inverse">Cancel</button>
										</div>
								</form>
							</div>
						</div>
					</div>
				</div>
				<!-- ============================================================== -->
				<!-- End PAge Content -->
				<!-- ============================================================== -->
			</div>
			<!-- ============================================================== -->
			<!-- End Container fluid  -->
			<jsp:include page="../welcome/footer.jsp"></jsp:include>

		</div>

	</div>

	<jsp:include page="../welcome/script.jsp"></jsp:include>
	<script type="text/javascript">
		function saveRestaurant() {
			
			$.ajax({
						type : "POST",
						url : "restaurant/save",
						data : JSON.stringify({
							id : 0,
							name : $("#name").val(),
							email_id : $("#email_id").val(),
							mobileno : $("#mobileno").val(),
							isveg: $("#isveg").is(":checked"),			
							opentiming : $("#opentiming").val(),
							address : $("#address").val(),
							closetiming : $("#closetiming").val(), 
							homedelivery_charges : $("#homedelivery_charges").val(),
							packing_charges : $("#packing_charges").val(),
							cusines : $("#cusines").val(),
							password:$("#password").val(),
						}),
						contentType : "application/json; charset=utf-8",
						dataType : "json",
						success : function(data) {
							console.log(data);

							 var str = "";
							if (window.location.hostname) {
								str = window.location.protocol + "//"
										+ window.location.hostname + ":"
										+ window.location.port
										+ "/restaurant-list";
								window.location.assign(str);
							} else {
								str = window.location.protocol + "//"
										+ window.location.hostname
										+ "/restaurant-list";
								window.location.assign(str);
							}
						},
						error : function(err) {
							console.log(err);
						} 
					});

		}
	</script>


</body>
</html>