myApp.controller("RestaurantController", ["$scope","$http",
    function($scope,$http) {
 
	$scope.filename = "Restaurant List";
	
	var data={
				"name":""
		};
		
	$http({method : "POST",
            url : "http://localhost:8888/restaurant-list",
            data : angular.toJson(data),
            headers : {
                'Content-Type' : 'application/json'
            }
        }).then(
	function(response) {
		console.log(response.data);
		$scope.restaurantlist = response.data.restaurantlist;
	});
	
	 $scope.propertyName = 'name';
	  $scope.reverse = true;
	
	 $scope.sortBy = function(propertyName) {
		    $scope.reverse = ($scope.propertyName === propertyName) ? !$scope.reverse : false;
		    $scope.propertyName = propertyName;
		  };
		  
		  
	/*$scope.editRestaurant = function(id){
		location.href = location.protocol + '//' + location.host +"/restaurant/details/"+id;
	}*/
		/*  $scope.loginRestaurant = function(){
				location.href = location.protocol + '//' + location.host +"/restaurant-login/";
			}
			*/
		  
		  
		  
		  
	$scope.select_product_image = function(id){
		$("#product_image").trigger("click");
		$scope.productid = id;
	}
	
	$scope.uploadPhotoId = function() {
		
		console.log("Selected Product's Id is " + $scope.productid);
		var profile = "";
		if($("#product_image")[0].files[0] != ""
			&& $("#product_image")[0].files[0] != undefined){
			
			var tempFile = $("#product_image")[0].files[0];
			var tempType = tempFile.type;
			var checktype = tempType.split("/")[0];
			
			var formData = new FormData();
			formData.append("productimage",$("#product_image")[0].files[0]);
			formData.append("userid",+$scope.productid);
			jQuery.ajax({
				url : location.protocol + '//' + location.host + '/upload-product-image',
				method : "POST",
				processData : false,
				cache : false,
				contentType: false,
				dataType : 'json',
				data : formData,
				async : false,
				success : function(response) {
					console.log("response",response)
					location.reload();
				}
			});
			
		}
		else{
			alert("Choose a Valid Image");
		}
		
	}
	
	$scope.deleteRestaurant = function(id){
					
					var data={
							"id":id
					};
					
					$http({method : "POST",
				            url : location.protocol + '//' + location.host +"/restaurant-delete",
				            data : angular.toJson(data),
				            headers : {
				                'Content-Type' : 'application/json'
				            }
				        }).then(
					function(response) {
						console.log(response);
						if(response){}
						var str = "";
				        if(window.location.hostname){
				        	str = window.location.protocol + "//" + window.location.hostname + ":" + window.location.port + "/restaurant-list";
				        	window.location.assign(str);	
				        }
				        else{
				        	str = window.location.protocol + "//" + window.location.hostname + "/restaurant-list";
				        	window.location.assign(str);
				        }

					});
	}
				    	/*if(response){
							
							var str = "";
					        if(window.location.hostname){
					        	str = window.location.protocol + "//" + window.location.hostname + ":" + window.location.port + "/restaurant/list";
					        	window.location.assign(str);	
					        }
					        else{
					        	str = window.location.protocol + "//" + window.location.hostname + "/restaurant/list";
					        	window.location.assign(str);
					        }
						}*/
	$scope.searchFilter = function(){
		var name=$("#productname").val();
		
		var accomodationData = {
				"productname":name
				}
		$http.post(
				location.protocol + '//' + location.host + contextPath
						+ '/productlist',accomodationData)
				.then(function(response) {
				$scope.inviteeGuestList = response.data.productslist;
					console.log(response.data);
				});
	}
	
	'use strict';
	
    function UserController(PagerService) {
        var vm = this;

        vm.dummyItems = _.range(1, 151); // dummy array of items to be paged
        vm.pager = {};
        vm.setPage = setPage;

        initController();

        function initController() {
            // initialize to page 1
            vm.setPage(1);
        }

        function setPage(page) {
            if (page < 1 || page > vm.pager.totalPages) {
                return;
            }

            // get pager object from service
            vm.pager = PagerService.GetPager(vm.dummyItems.length, page);

            // get current page of items
            vm.items = vm.dummyItems.slice(vm.pager.startIndex, vm.pager.endIndex + 1);
        }
    }

    function PagerService() {
        // service definition
        var service = {};

        service.GetPager = GetPager;

        return service;

        // service implementation
        function GetPager(totalItems, currentPage, pageSize) {
            // default to first page
            currentPage = currentPage || 1;

            // default page size is 10
            pageSize = pageSize || 10;

            // calculate total pages
            var totalPages = Math.ceil(totalItems / pageSize);

            var startPage, endPage;
            if (totalPages <= 10) {
                // less than 10 total pages so show all
                startPage = 1;
                endPage = totalPages;
            } else {
                // more than 10 total pages so calculate start and end pages
                if (currentPage <= 6) {
                    startPage = 1;
                    endPage = 10;
                } else if (currentPage + 4 >= totalPages) {
                    startPage = totalPages - 9;
                    endPage = totalPages;
                } else {
                    startPage = currentPage - 5;
                    endPage = currentPage + 4;
                }
            }

            // calculate start and end item indexes
            var startIndex = (currentPage - 1) * pageSize;
            var endIndex = Math.min(startIndex + pageSize - 1, totalItems - 1);

            // create an array of pages to ng-repeat in the pager control
            var pages = _.range(startPage, endPage + 1);

            // return object with all pager properties required by the view
            return {
                totalItems: totalItems,
                currentPage: currentPage,
                pageSize: pageSize,
                totalPages: totalPages,
                startPage: startPage,
                endPage: endPage,
                startIndex: startIndex,
                endIndex: endIndex,
                pages: pages
            };
        }
    }
}]);	
/*$(document).ready(function () {
		console.log("Hi Working");
        $("#addUser").submit(function (event) {

        	console.log("Hi Working inside submit");
            //stop submit the form, we will post it manually.
            event.preventDefault();

            fire_ajax_submit();

        });

    });
    
    function fire_ajax_submit() {
    	
    	console.log("Hi Working inside ajax");

        var search = {}
        search["name"] = $("#name").val();
        search["email"] = $("#email").val();
        search["password"] = $("#password").val();

        $("#btn-search").prop("disabled", true);

        $.ajax({
            type: "POST",
            contentType: "application/json",
            url: "http://localhost:8081/user/create",
            data: JSON.stringify(search),
            dataType: 'json',
            cache: false,
            timeout: 600000,
            success: function (data) {

                var json = "<h4>Ajax Response</h4><pre>"
                    + JSON.stringify(data, null, 4) + "</pre>";
                $('#feedback').html(json);

                console.log("SUCCESS : ", data);
                $("#btn-search").prop("disabled", false);

            },
            error: function (e) {

                var json = "<h4>Ajax Response</h4><pre>"
                    + e.responseText + "</pre>";
                $('#feedback').html(json);

                console.log("ERROR : ", e);
                $("#btn-search").prop("disabled", false);

            }
        });

    }*/