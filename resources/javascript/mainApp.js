var app = angular.module('mainApp', ['ngRoute', 'ui.bootstrap', 'ui.grid', 'angularUtils.directives.dirPagination']);

app.config(function($routeProvider, paginationTemplateProvider) {
		$routeProvider
			.when('/', {
				templateUrl: 'resources/pages/home.html',
				controller  : 'homeCtrl'
			})
			.when('/parent', {
				templateUrl: 'resources/pages/parent.html'
			})
			.when('/brand', {
				templateUrl: 'resources/pages/brand.html'
			})
			.when('/contact', {
				templateUrl: 'resources/pages/contact.html'
			})
			.when('/product', {
				templateUrl: 'resources/pages/product.html'
			})
			.when('/category/:catId', {
				templateUrl: 'resources/pages/category.html',
				controller  : 'categoryCtrl'
			})
			.when('/rnd', {
				templateUrl: 'resources/pages/rnd.html',
				controller  : 'rndCtrl'
			})
			.otherwise({
				redirectTo: '/'
			});
		
		paginationTemplateProvider.setPath('resources/angularutils/dirPagination.tpl.html');
	});
app.controller('mainCtrl', ['$scope', '$http', '$filter', '$location', function ($scope, $http, $filter, $location) {

}]);

app.controller('homeCtrl', ['$scope', '$http', '$filter', '$location', function ($scope, $http, $filter, $location) {
	  $scope.myInterval = 5000;
	  $scope.noWrapSlides = false;
	  var slides = $scope.slides = [ {
		  image: 'resources/images/20150708gihatg.jpg',
		  test: 'Our Position',
		  id: 0
	  },{
		  image: 'resources/images/20150708tclnnl.jpg',
		  test: 'Our Values',
		  id: 1
	  },{
		  image: 'resources/images/20150708vryvew.jpg',
		  test: 'Our Target',
		  id: 2
	  }];
}]);

app.controller('rndCtrl', ['$scope', '$http', '$filter', '$location', function ($scope, $http, $filter, $location) {
	  $scope.myInterval = 1000;
	  $scope.noWrapSlides = false;
	  var slides = $scope.slides = [ {
		  image: 'resources/images/ys1.jpg',
		  id: 0
	  },{
		  image: 'resources/images/ys2.jpg',
		  id: 1
	  },{
		  image: 'resources/images/ys3.jpg',
		  id: 2
	  },{
		  image: 'resources/images/ys4.jpg',
		  id: 3
	  },{
		  image: 'resources/images/ys5.jpg',
		  id: 4
	  }];
}]);

app.controller('categoryCtrl', ['$scope', '$http', '$routeParams', '$filter', '$location', function ($scope, $http, $routeParams, $filter, $location) {
	$scope.catId = $routeParams.catId;	
	$http.get("rest/categoryItems/" +$routeParams.catId)
    .success(function(response) {
    	var rows = [];
    	var row = [];
    	for (var i = 0; i < response.length; i++) {
    	    if( i % 4 == 0 && row.length > 0) {
    	    	rows.push(row);
    	    	row = [];
    	    }
    	    var item = {
    	    		"id": response[i].id,
    	    		"name": response[i].name,
    	    		"description": response[i].description,
    	    		"imageUrl": "resources/images/"+$scope.catId+"/"+response[i].fileName+".jpg"
    	    };
    	    row.push(item);
    	}
    	rows.push(row);
    	$scope.rows = rows;
    });
	
}]);







