	
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
            
            	<li class="active"><a href="/api/dashboard">Home</a></li>
<!--                 <li><a href="#">Profile</a></li> -->
                <li><a href="/api/patient">Patient</a></li>
                <li><a href="/api/result">Results</a></li>
                <li><a href="/api/admin">Admin</a></li>
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

  <div class="container">
        <div class="jumbotron">
            <h1>Maintain your health reports here</h1>
            <p>Clinik-o helps one to maintain any health related test result. Its structured,
            safe easy to maintain. A Patient, doctor or health pro will be potential user of it. This would be the master history of a patients health all the way from his/her birth.
            Going forward this would be integrated with some AI machine (e.g. Watson health) to get more organised and accurate advice from it.</p>
            <p><a href="#" target="_blank" class="btn btn-success btn-lg">Sign up</a></p>
        </div>
        <div class="row">
            <div class="col-xs-4">
                <h2>Patient</h2>
                <p>Patient module helps doctors, health profetionals to create a patients profile.</p>
                <p><a href="/api/patient" target="_blank" class="btn btn-success">Lets go</a></p>
            </div>
            <div class="col-xs-4">
                <h2>Result</h2>
                <p>Result module helps one to record a patients test result.</p>
                <p><a href="/api/result" target="_blank" class="btn btn-success">Lets go</a></p>
            </div>
            <div class="col-xs-4">
                <h2>Admin</h2>
                <p>Admin module helps technical administrators to monitor your application and rectify any errors.</p>
                <p><a href="/api/admin" target="_blank" class="btn btn-success">Lets go</a></p>
            </div>
        </div>
        <hr>
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