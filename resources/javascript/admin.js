/**
 * 
 */

var app = angular.module('adminApp', ['ui.bootstrap']);
app.controller('AdminCtrl', ['$scope', '$http', '$filter', function ($scope, $http, $filter) {
	$scope.tabs = [
			{
				"title" : "User Management",
				"class" : "first",
				"id" : 1,
				"active": true
			},
			{
				"title" : "Product Management",
				"id" : 2,
				"active": true
			}
	];
	$scope.selectedTab = {
			"title" : "Company Profile",
			"class" : "first",
			"id" : 1,
			"active": true,
			"items": [ {
				"id": 1,
				"name": "Company Overview",
				"url": "resources/partials/overview.html"
			}, {
				"id": 2,
				"name": "Group Structure",
				"url": "resources/partials/structure.html"
			}
			]
		};
	$scope.navigate = function( tabId) {
		$scope.selectedTab = $filter('filter')($scope.tabs, {id: tabId})[0];
		$scope.selectedItem = $scope.selectedTab.items[0];
	};
	
	$scope.clickHeaderMenu = function(tabId, itemId) {
		$scope.selectedTab = $filter('filter')($scope.tabs, {id: tabId})[0];
		$scope.selectedItem = $filter('filter')($scope.selectedTab.items, {id: itemId})[0];	
		//alert( tabId +': ' +itemId);
	};
	
}]);