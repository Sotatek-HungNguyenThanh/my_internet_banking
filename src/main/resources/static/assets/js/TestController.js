var TestController = BaseClass.extend({
    socketListen: 'deposit',
    initialize: function (service, $scope, $rootScope, socket) {
        this.$rootScope = $rootScope;
        this.socket = socket;
        this.service = service;
        // var data = {
        //     email: 'test@test.com',
        //     password: 'haiduong123',
        //     account_name: 'longbb'
        // }
        // this.service.test(data)
        //     .success(function(data){
        //         console.log(data);
        //     })
        //     .error(function(err){
        //         console.log(err);
        //     });
        socket.on(this.socketListen, function (data) {
            console.log(data);
        });
    },

},  ['Service',  '$scope', '$rootScope', 'socket']);
adminApp.controller('TestController', TestController);