'use strict'

angular.module('showUserRecord.services', []).factory('ShowUserRecordService',
		[ "$http", "CONSTANTS", function($http, CONSTANTS) {
			var service = {};
			service.getUserDetails = function(userId) {
				return $http({ url: CONSTANTS.getUserDetails,
								method: "GET",
								params: {"id":userId}});
				}
			return service;
		} ]);