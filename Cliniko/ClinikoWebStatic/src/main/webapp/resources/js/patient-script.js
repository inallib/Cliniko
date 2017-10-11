(function(angular) {
angular.module('patientApp', [])
  .controller('patientController', ['$scope', '$http', function($scope, $http) {
    $scope.master = {};

    $scope.updatePatient = function(patient) {
      var res = $http.post('/savepatientweb', patient);
//      res.success(function(data, status, headers, config) {
//      			$scope.message = data;
//      		});
//      		res.error(function(data, status, headers, config) {
//      			alert( "failure message: " + JSON.stringify({data: data}));
//      		});
    };

    $scope.reset = function(form) {
      if (form) {
        form.$setPristine();
        form.$setUntouched();
      }
      $scope.user = angular.copy($scope.master);
    };

    $scope.reset();
  }]);
})(window.angular);