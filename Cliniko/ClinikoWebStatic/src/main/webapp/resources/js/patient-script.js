(function(angular) {
  'use strict';
angular.module('patient-app', [])
  .controller('patient-controller', ['$scope', function($scope) {
    $scope.master = {};

    $scope.update = function(patient) {
      $scope.master = angular.copy(user);
      alert('ok');
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