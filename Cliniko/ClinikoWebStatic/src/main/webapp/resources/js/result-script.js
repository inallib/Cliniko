(function(angular) {
angular.module('resultApp', [])
  .controller('resultController', ['$scope', '$http', function($scope, $http) {
    $scope.searchResult = function(searchString) {
        $http.get('/searchresultweb/' + searchString)
        .then(function success(response, status, headers, config) {
                    $scope.searchResuls = response.data;

                    if (!$scope.searchResuls.patient){
                            $scope.searchResulsNotFound = true;
                        }
                    else {
                            $scope.searchResulsNotFound = false;
                        }

                }, function error(response, status, headers, config) {
                    alert('No record found');
                });
    };

    $scope.updateResult = function(result, patient) {
        result.patient=patient;
          var res = $http.post('/saveresultweb', result);

          $http.get('/loadresultweb/'+ $scope.searchResuls.patient.phone)
          .then(function success(response, status, headers, config) {
                              $scope.searchResuls = response.data;

                          }, function error(response, status, headers, config) {
                              alert('No record found');
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