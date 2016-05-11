var app = angular.module('GgApp', ['ngMaterial'])

.controller('AppCtrl', function($scope) {

})

.controller('ToolbarCtrl', function($scope) {
    var iconData = [
          {name: 'icon-user-plus'   , color: "rgb(89, 226, 168)" },
          {name: 'icon-settings'    , color:"#A00", theme:"md-warn md-hue-5"}
        ];
    $scope.sizes = [
      {size:48,padding:10},
      {size:36,padding:6},
      {size:24,padding:2},
      {size:12,padding:0}
    ];
    $scope.fonts = [].concat(iconData);
});