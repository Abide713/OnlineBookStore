// app.js
angular.module('bookStoreApp', [])
  .controller('BookController', function($scope, $http) {
	
    // Make an API call to get the books
    $http.get('/api/books') // This should match the endpoint exposed by your backend
      .then(function(response) {
        $scope.books = response.data; // Assign the fetched books to the $scope variable
      }, function(error) {
        console.error('Error fetching books:', error);
      });	
	  
	    
  });

  
  /*	  for future expanssion 

  	//Make an API call to get all users
  	$http.get('/api/users') // This should match the endpoint exposed by your backend for users
  	     .then(function(response) {
  	       $scope.users = response.data; // Assign the fetched users to the $scope variable
  	     }, function(error) {
  	       console.error('Error fetching users:', error);
  	     });  */
  	 