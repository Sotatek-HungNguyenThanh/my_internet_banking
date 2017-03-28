
var app = require('express')();
var server = require('http').Server(app);
var io = require('socket.io')(server);
var redis = require('redis');

server.listen(8089);
io.on('connection', function (socket) {

    console.log("new client connected");
    var redisClient = redis.createClient();
    redisClient.subscribe('chat');
    // redisClient.subscribe('widthraw');

    redisClient.on("message", function(channel, message) {
        console.log("mew message in queue "+ message + " channel:" + channel);
        socket.emit(channel, message);
    });

    socket.on('disconnect', function() {
        console.log("new client disconnected");
        redisClient.quit();
    });
});