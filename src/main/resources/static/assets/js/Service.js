angular.module('Service', [])

    .factory('Service', function ($http) {
        // var host = "http://a67cf036.ngrok.io";
        // return {
        //     test: function (data) {
        //         return $http({
        //             method: 'POST',
        //             url: host + '/api/v1/login',
        //             headers: {'Content-Type': 'application/x-www-form-urlencoded'},
        //             data: $.param(data)
        //         });
        //     },
        //
        // }
        return {

        }
    })
    .factory('socket', function ($rootScope) {
        var socket = io.connect('http://localhost:8089');
        return {
            on: function (eventName, callback) {
                socket.on(eventName, function () {
                    var args = arguments;
                    $rootScope.$apply(function () {
                        callback.apply(socket, args);
                    });
                });
            },
            emit: function (eventName, data, callback) {
                socket.emit(eventName, data, function () {
                    var args = arguments;
                    $rootScope.$apply(function () {
                        if (callback) {
                            callback.apply(socket, args);
                        }
                    });
                })
            }
        };
    })
;