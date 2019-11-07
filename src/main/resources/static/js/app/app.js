'use strict'

var userRecordApp = angular.module('userRecord', [ 'ui.bootstrap', 'userRecord.controllers', 'showUserRecord.controllers',
		'userRecord.services', 'showUserRecord.services']);
userRecordApp.constant("CONSTANTS", {
	getUserDetails : "/userRecord/getUserRecord",
	saveUserDetails : "/userRecord/saveUserRecord"
});