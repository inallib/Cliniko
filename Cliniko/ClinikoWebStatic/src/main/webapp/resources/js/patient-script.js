(function(angular) {
angular.module('patientApp', [])
  .controller('patientController', ['$scope', '$http', function($scope, $http) {
    $scope.master = {};

    $scope.updatePatient = function(patient) {
      $http.post('/savepatientweb', patient).then (function success(response) {
                                                              $scope.message = 'Patient added!';
                                                              $scope.errorMessage = null;
                                                          },
                                                          function error(response) {
                                                              if (response.status == 400) {
                                                                $scope.errorMessage = response.data[0];
                                                              }
                                                              else {
                                                                $scope.errorMessage = 'Error adding user!';
                                                              }
                                                              $scope.message = '';
                                                        });
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