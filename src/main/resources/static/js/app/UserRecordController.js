'use strict'

var module = angular.module('userRecord.controllers', []);
module.controller("UserRecordController", [ "$scope", "UserRecordService", "$rootScope",
		function($scope, UserRecordService, $rootScope) {
	$scope.message="This screen captures the details of the User.";
	
	$rootScope.checkUser=false;
	$scope.saveUserDetails = function(userRecord) {
		if(userRecord.name != "" && userRecord.numberValue != ""){
			UserRecordService.saveUserDetails(userRecord).then(function(value) {
				if(value.data!=""){
					console.log("get api works");
					$rootScope.userId= value.data;
					$rootScope.checkUser=true;
				}
				else{
					$rootScope.checkUser=false;
				}
				}, function(reason) {
					console.log("error occured while fetching data");
					$rootScope.checkUser=false;
				}, function(value) {
				console.log("Invocaton of endpoint failed");
				$rootScope.checkUser=false;
			});
		}
		}
		$scope.reset = function() {
			$rootScope.checkUser=false;
			$scope.userRecord={};
			$rootScope.userId="";
		}
	
		} ]);