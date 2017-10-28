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

	.panelWidth{
	    margin: auto;
            width: 75%;
            padding: 10px;
	}
</style>

<script src="//code.angularjs.org/snapshot/angular.min.js"></script>
<script src="//localhost:9099/resources/js/result-script.js"></script>

</head> 
<body>

<div class="container">
    <nav class="navbar navbar-inverse">
        <!-- Brand and toggle get grouped for better mobile display -->
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
<!--                 <li><a href="#">Profile</a></li> -->
                <li ><a href="/patient">Patient</a></li>
                <li class="active"><a href="/result">Results</a></li>
                <li><a href="/admin">Admin</a></li>
            	<form class="navbar-form navbar-left">
                </form>
            	<li class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">Yours <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Messages</a></li>
                        <li><a href="#">Profile</a></li>
<!--                         <li><a href="#"></a></li> -->
                        <li class="divider"></li>
                        <li><a href="#">Logout</a></li>
                    </ul>
                </li>
<!--                 <li><a href="#">Logout</a></li> -->
            </ul>
        </div>
    </nav>
</div>

  <div class="container" ng-app="resultApp" ng-controller="resultController">
  <div class="input-group">
         <input type="text" class="form-control" ng-model="searchString" placeholder="Search phone number">
         <span class="input-group-btn">
               <button type="button" class="btn btn-default" ng-click="searchResult(searchString)"><span class="glyphicon glyphicon-search"></span></button>
         </span>
   </div>
   <div class="row center-block">
        <label ng-show= "searchResulsNotFound" class="label-danger">No patient found.</label>
   </div>
   <div class="row center-block">
    <div class="panel-group panelWidth"  ng-show="searchResuls">
        <div class="panel panel-info">
          <div class="panel-heading">
            <h4 class="panel-title">
              <a data-toggle="collapse" href="#collapse1">
              <div class="row">
                <div class="col-sm-6">Name: {{searchResuls.patient.name}}</div>
              </div>
              <div class="row">
                 <div class="col-sm-6">DOB: {{searchResuls.patient.dob}}</div>
              </div>
              </a>
            </h4>
          </div>
          <div id="collapse1" class="panel-collapse collapse">
            <div class="panel-body">
    			<div class="row">
    			  	<div class="col-sm-6">
    			  	    <div class="panel panel-warning">
    			  	        <div class="panel-body">
                                    <label>Age: {{searchResuls.patient.age}}</label><br>

                                    <label>E-mail: {{searchResuls.patient.email}}</label><br>

                                    <label>Phone: {{searchResuls.patient.isdCode}} - {{searchResuls.patient.phone}}</label><br>

                                    <label>Special Id: {{searchResuls.patient.specialId}}</label>
                            </div>
    			  	    </div>
    			  	</div>
    			  	<div class="col-sm-6">
    			  		<form>
    					  <div class="form-group">
    					    <label for="testname">Test name</label>
    					    <input class="form-control" id="testname" ng-model="result.testName">
    					  </div>
    					  <div class="form-group">
    					    <label for="normalrange">Normal range</label>
    					    <input class="form-control" id="normalrange" ng-model="result.normalRange">
    					  </div>
    					  <div class="form-group">
    					    <label for="result">Result</label>
    					    <input class="form-control" id="result" ng-model="result.result">
    					  </div>
    					  <div class="form-group">
    					    <label for="remarks">Remarks</label>
    					    <input class="form-control" id="remarks" ng-model="result.remarks">
    					  </div>
    					  <button type="submit" class="btn btn-default" ng-click="updateResult(result, searchResuls.patient)">Submit</button>
    					</form>
    			  	</div>
    			  	<br>
    			  	<div class="col-sm-12">
    			  	       <table class="table table-hover">
                               <thead>
                                 <tr>
                                   <th>Date</th>
                                   <th>Test name</th>
                                   <th>Normal range</th>
                                   <th>Result</th>
                                   <th>Remarks</th>
                                 </tr>
                               </thead>
                               <tbody ng-repeat="result in searchResuls.resultsList">
                                 <tr>
                                   <td>{{result.toDate | date : short}}</td>
                                   <td>{{result.testName}}</td>
                                   <td>{{result.normalRange}}</td>
                                   <td>{{result.result}}</td>
                                   <td>{{result.remarks}}</td>
                                 </tr>
                               </tbody>
                             </table>
    			  	</div>
    			</div>
    		</div>
            <div class="panel-footer">Panel Footer</div>
          </div>
        </div>
      </div>

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
    </div>
</body>
</html>
</body>
</html>                            