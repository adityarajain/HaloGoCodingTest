'use strict'

var module1 = angular.module('showUserRecord.controllers', []);
module1.controller("ShowUserRecordController", [ "$scope", "ShowUserRecordService", "$rootScope",
		function($scope, ShowUserRecordService, $rootScope) {
	$scope.message="We are here to see the details of User added on the Add User Screen. The Number will be shown in string representation.";
	var userId = $rootScope.userId;
	$scope.getUserDetails = function(userId) {
		ShowUserRecordService.getUserDetails(userId).then(function(value) {
				$scope.userDto= value.data;
			}, function(reason) {
				console.log("error occured while fetching data");
			}, function(value) {
				console.log("Invocaton of endpoint failed");
			});
	}
	if($rootScope.checkUser){
		$scope.getUserDetails($rootScope.userId);
	}
		} ]);