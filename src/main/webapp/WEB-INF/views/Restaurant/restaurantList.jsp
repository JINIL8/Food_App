<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="../welcome/htmlhead.jsp"></jsp:include>

<title>Products List</title>
<!--  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script> -->
<style type="text/css">
.center {
 text-align: center;
}

.pagination a {
 color: black;
 float: left;
 padding: 8px 16px;
 text-decoration: none;
 transition: background-color .3s;
 border: 1px solid #ddd;
 margin: 0 4px;
}

.pagination a.active {
 background-color: #4CAF50;
 color: white;
 border: 1px solid #4CAF50;
}</style>
</head>
<body ng-app="myApp" ng-controller="RestaurantController">

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
                        <h3 class="text-themecolor">{{filename}}</h3>
                    </div>
                    <div class="col-md-7 align-self-center">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="javascript:void(0)">Home</a></li>
                            <li class="breadcrumb-item">Restaurant</li>
                            <li class="breadcrumb-item active">Restaurant List</li>
                        </ol>
                    </div>
                    <div class="">
                        <button class="right-side-toggle waves-effect waves-light btn-inverse btn btn-circle btn-sm pull-right m-l-10">
			<i class="ti-user text-white"></i></button>
                    </div>
</div>
            <!-- ============================================================== -->
            <!-- End Bread crumb and right sidebar toggle -->
            <!-- ============================================================== -->
            	<%
					String restaurantcreated=(String)session.getAttribute( "Restaurant-created" );
					if (restaurantcreated != null){
						if (restaurantcreated.equals("success"))
						  {%>
						    <!-- Start Notification -->
				            	<div id="notification-bar" class="alert alert-success"> 
						           	<i class="ti-user"></i> 
						           <%	
							           String message=(String)session.getAttribute( "success-message" );
							           if (message != null && !message.equalsIgnoreCase("completed")){
						        	   %>
						        	   <%=message%>
						           	<%}%>
						           	<button onclick="sessionclear()" type="button" class="close" data-dismiss="alert" aria-label="Close"> <span aria-hidden="true">×</span> </button>
				               	</div>
			               	<!-- End Notification -->
				                
					<%}session.setAttribute("restaurant-created","completed");
						session.setAttribute("success-message","completed");}  
				%>
            	<!-- ============================================================== -->
                <!-- Start Page Content -->
                <!-- ============================================================== -->
                
                <div class="col-12">
                <div class="input-group">
        <div class="input-group-addon"><!-- <i class="fa fa-search"></i> --></div>
        <label>Search: <input ng-model="searchText"></label>
      </div>      
                        <div class="card">
                            <div class="card-body">
                                <!-- <h4 class="card-title">Responsive Table </h4>
                                <h6 class="card-subtitle">Create responsive tables by wrapping any <code>.table</code> in <code>.table-responsive </code></h6> -->
     					
                   <button type="button"class="btn btn-info btn-rounded m-t-10 float-right" data-toggle="modal" data-target="#myModal">Restaurant Login</button>
	 
  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
         <h4>Restaurant Login</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        <div class="modal-body">
          <div class="form-group">
          <label class="control-label">Username</label>
          <input type="text" class="form-control" id="restaurantname">
          </div>
          <div class="form-group">
          <label class="control-label">Password</label>
          <input type="password" class="form-control" id="password">
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" onclick="loginRestaurant()">Login</button>
        </div>
      </div>
      </div>
    </div>
  </div>

      
                                <div class="table-responsive">
                                    <table class="table">
                                        <thead>
                                            <tr><th>
                                            <label ng-click="sortBy('name')">Restaurant Name</label>
     										   			<span class="sortorder" ng-show="propertyName === 'name'" 
     										   			ng-class="{reverse: reverse}">
     										   			</span>
                                                </th>
                                                <th>
                                            	<label ng-click="sortBy('name')">Email-ID</label>
     										   			<span class="sortorder" ng-show="propertyName === 'email_id'" 
     										   			ng-class="{reverse: reverse}">
     										   			</span>
                                                </th>
                                                <th>
                                            	<label ng-click="sortBy('name')">Contact</label>
     										   			<span class="sortorder" ng-show="propertyName === 'mobileno'" 
     										   			ng-class="{reverse: reverse}">
     										   			</span>
                                                </th>
                                                <th>
                                            	<label ng-click="sortBy('address')">Address</label>
     										   			<span class="sortorder" ng-show="propertyName === 'address'" 
     										   			ng-class="{reverse: reverse}">
     										   			</span>
                                                </th>
                                                <th>
                                            	<label ng-click="sortBy('isveg')">Restaurant Type</label>
     										   			<span class="sortorder" ng-show="propertyName === 'isveg'" 
     										   			ng-class="{reverse: reverse}">
     										   			</span>
                                                </th>
                                                <th>
                                            	<label ng-click="sortBy('opentiming')">OpenTiming</label>
     										   			<span class="sortorder" ng-show="propertyName === 'opentiming'" 
     										   			ng-class="{reverse: reverse}">
     										   			</span>
                                                </th><th>
                                            	<label ng-click="sortBy('closetiming')">CloseTiming</label>
     										   			<span class="sortorder" ng-show="propertyName === 'closetiming'" 
     										   			ng-class="{reverse: reverse}">
     										   			</span>
                                                </th><th>
                                            	<label ng-click="sortBy('homedelivery_charges')">HomeDelivery Charges</label>
     										   			<span class="sortorder" ng-show="propertyName === 'homedelivery_charges'" 
     										   			ng-class="{reverse: reverse}">
     										   			</span>
                                                </th>
                                                <th>
                                                	<label ng-click="sortBy('packing_charges')">Packing Charges</label>
     										   			<span class="sortorder" ng-show="propertyName === 'packing_charges'"
     										   			 ng-class="{reverse: reverse}">
     										  		 </span>
     										   </th>
                                                <th>
                                                <label ng-click="sortBy('cusines')">Cusines</label>
     										   			<span class="sortorder" ng-show="propertyName === 'cusines'"
     										   			 ng-class="{reverse: reverse}">
     										  		 </span>
                                            </tr>
                                        </thead>
                                        <tbody>
                                         
                                            <tr dir-paginate="restaurant in restaurantlist | filter:searchText | orderBy:propertyName:reverse | itemsPerPage: 2">
                                                <td>{{restaurant.name}}</td>
                                                <td>{{restaurant.email_id}}</td>
                                                <td>{{restaurant.mobileno}}</td>
                                                 <td>{{restaurant.address}}</td>
                                                <td>{{restaurant.isveg}}</td>
                                                <td>{{restaurant.opentiming}}</td>
                                                <td>{{restaurant.closetiming}}</td>
                                                <td>{{restaurant.homedelivery_charges}}</td>
                                                <td>{{restaurant.packing_charges}}</td>
                                                <td>{{restaurant.cusines}}</td>
                                                <td class="jsgrid-cell jsgrid-control-field jsgrid-align-center" style="width: 50px;">
	                                                <div class="btn-group" role="group" aria-label="Basic example">
	                                                	<!-- <input onchange="angular.element(this).scope().uploadPhotoId()" ngf-select ng-model="file" ngf-multiple="false" type="file" id="product_image" style="display:none;"  accept=".pdf .png, .jpg, .jpeg .doc .docx"/> -->
			                                            <!-- <button type="button" ng-click="select_product_image(product.id)" class="btn btn-primary" title="Upload Product's Image"><i class="fa fa-upload"></i></button> -->
			                                            <!-- <button type="button" ng-click="editRestaurant(restaurant.id)" class="btn btn-info"><i class="fa fa-edit"></i></button> -->
			                                            <button type="button" ng-click="deleteRestaurant(restaurant.id)" class="btn btn-danger"><i class="fas fa-trash"></i></button>
			                                        </div>
                                                </td>
                                            </tr>
                                         
                                        </tbody>
                                    </table>
                                    <dir-pagination-controls
                                            max-size="5"
                                            direction-links="true"
                                            boundary-links="true" style="float:right;">
                                    </dir-pagination-controls>
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

 
		
		 </script>

<script src="${pageContext.request.contextPath }/resources/custom/Restaurant/listRestaurant.js"></script>
</body>
</html>