'use strict'

angular.module('userRecord.services', []).factory('UserRecordService',
		[ "$http", "CONSTANTS", function($http, CONSTANTS) {
			var service = {};
			service.saveUserDetails = function(userRecord) {
				return $http({url: CONSTANTS.saveUserDetails, method: "POST", data : userRecord });
			}
			return service;
		} ]);