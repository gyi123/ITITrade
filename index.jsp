<!DOCTYPE html>
<html>
<head>

<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="resources/css/ititrade.css" />
<link rel="stylesheet" href="resources/bootstrap-3.3.5/css/bootstrap.css" />
<link rel="stylesheet"
	href="resources/bootstrap-3.3.5/css/bootstrap-theme.min.css" />
<link rel="stylesheet"
	href="resources/ui-grid/ui-grid.css" />

<script src="resources/angularjs/angular.js"></script>
<script src="resources/angularjs/angular-route.min.js"></script>

<script src="resources/angularjs/ui-bootstrap-tpls-0.14.3.min.js"></script>
<script src="resources/angularutils/dirPagination.js"></script>
<script src="resources/ui-grid/ui-grid.js"></script>

<script src="resources/javascript/mainApp.js"></script>

</head>

<body ng-app="mainApp" ng-controller="mainCtrl" ng-init="">
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
    <<button type="button" class="navbar-toggle" ng-init="navCollapsed = true" ng-click="navCollapsed = !navCollapsed">
      <!-- button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar"-->
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                  
      </button>
      <img src="resources/images/logo.gif"/>
    </div>
    <div class="collapse navbar-collapse" uib-collapse="navCollapsed" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <li class="active"><a href="#/">Home</a></li>
        <li><a href="#/introduction">About</a></li>
        <li><a href="#/brand">Our Brands</a></li>
        <li><a href="#/product">Our Products</a></li>
        <li><a href="#/contact">Contact</a></li>
      </ul>
    </div>
  </div>
</nav>
<div class="panel panel-default">
  <div class="panel-body container" ng-view></div>
  <div class="panel-footer end_left">Copyright &copy; 2007-2016 Intradin (Shanghai) Machinery Co., Ltd. All rights reserved.<br>
ADD: 118 Duhui Road, Minhang District, Shanghai, 201109 China Zip code：201109 Tel: 86-21-64908190 Fax: 86-21-64856185
  </div>
</div>

</body>
</html>