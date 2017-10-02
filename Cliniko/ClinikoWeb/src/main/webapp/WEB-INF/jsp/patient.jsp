	
<!-- <link rel="stylesheet" href="/resources/css/style.css"></link> -->


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Clinik-o</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet" integrity="sha256-MfvZlkHCEqatNoGiOXveE8FIwMzZg4W85qfrfIFBfYc= sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
	.navbar{
		margin-top: 20px;
	}
</style>

<script src="//code.angularjs.org/snapshot/angular.min.js"></script>
<script src="/resources/js/patient-script.js"></script>

</head> 
<body ng-app="patient-app">

<div class="container">
    <nav class="navbar navbar-inverse">
        <div class="navbar-header">
            <button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a href="#" class="navbar-brand">Clinik-o</a>
        </div>
        <!-- Collection of nav links, forms, and other content for toggling -->
        <div id="navbarCollapse" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                
                
            </ul>
            
            <ul class="nav navbar-nav navbar-right">
            
            	<li><a href="/dashboard">Home</a></li>
                <li  class="active"><a href="/api/patient">Patient</a></li>
                <li><a href="/result">Results</a></li>
                <li><a href="/admin">Admin</a></li>
            	<form class="navbar-form navbar-left">
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="Search patient details">
                    <span class="input-group-btn">
                        <button type="button" class="btn btn-default"><span class="glyphicon glyphicon-search"></span></button>
                    </span>
                </div>
            	</form>
            	<li class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">Yours <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Messages</a></li>
                        <li><a href="#">Profile</a></li>
                        <li class="divider"></li>
                        <li><a href="#">Logout</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </nav>
</div>

  <div class="container" ng-controller="patient-controller">
        <form class = "form-horizontal" role = "form">
   
			   <div class = "form-group">
			      <label for = "firstname" class = "col-sm-2 control-label">Name</label>
					
			      <div class = "col-sm-10">
			         <input type = "text" class = "form-control" name="name" ng-model="patient.name" placeholder = "Enter name">
			      </div>
			   </div>
			   
			   <div class = "form-group">
			      <label for = "lastname" class = "col-sm-2 control-label">Email</label>
					
			      <div class = "col-sm-10">
			         <input type = "text" class = "form-control" name="email" ng-model="patient.email" placeholder = "Enter email">
			      </div>
			   </div>
			   
			   <div class = "form-group">
			      <label for = "lastname" class = "col-sm-2 control-label">ISD Code</label>
					
			      <div class = "col-sm-10">
			         <input type = "text" class = "form-control" name="isdCode" ng-model="patient.isdCode" placeholder = "Enter ISD code">
			      </div>
			   </div>
			   
			   <div class = "form-group">
			      <label for = "lastname" class = "col-sm-2 control-label">Phone</label>
					
			      <div class = "col-sm-10">
			         <input type = "text" class = "form-control" name="phone" ng-model="patient.phone"  placeholder = "Enter phone">
			      </div>
			   </div>
			   
			   <div class = "form-group">
			      <label for = "lastname" class = "col-sm-2 control-label">DOB</label>
					
			      <div class = "col-sm-10">
			         <input type = "text" class = "form-control" name="dob" ng-model="patient.dob" placeholder = "Enter DOB">
			      </div>
			   </div>
			   
			   <div class = "form-group">
			      <label for = "lastname" class = "col-sm-2 control-label">Age</label>
					
			      <div class = "col-sm-10">
			         <input type = "text" class = "form-control" name="age" ng-model="patient.age" placeholder = "Enter age">
			      </div>
			   </div>
			   
			   <div class = "form-group">
			      <label for = "lastname" class = "col-sm-2 control-label">Special ID</label>
					
			      <div class = "col-sm-10">
			         <input type = "text" class = "form-control" name="specialId" ng-model="patient.specialId" placeholder = "Enter special Id">
			      </div>
			   </div>
			   
			   <div class = "form-group">
			      <div class = "col-sm-offset-2 col-sm-10">
			         <button type = "submit" class = "btn btn-success" ng-click="update-patient(patient)"><i class="fa fa-floppy-o" aria-hidden="true"></i> &nbsp;&nbsp;&nbsp;
			         Save</button>
			   	  </div>
   </div>
	</form>
	<div class="row">
            <div class="col-xs-12">
                <footer>
                	<div class="text-center center-block">
					            <br />
					                <a href="#"><i id="social-fb" class="fa fa-facebook-square fa-3x social"></i></a>
						            <a href="#"><i id="social-tw" class="fa fa-twitter-square fa-3x social"></i></a>
						            <a href="#"><i id="social-gp" class="fa fa-google-plus-square fa-3x social"></i></a>
						            <a href="#"><i id="social-em" class="fa fa-envelope-square fa-3x social"></i></a>
					<p>&copy; Saurav</p>
					</div>
                </footer>
            </div>
        </div>
    </div>
</body>
</html>
</body>
</html>                            