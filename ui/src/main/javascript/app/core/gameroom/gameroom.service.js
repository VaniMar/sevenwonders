'use strict';

angular.
    module('sevenWonders.core.gameroom').
    factory('GameRoom', ['$cookies', '$websocket','Game', 'Restangular',  '$q', '$location',
        function ($cookies, $websocket, Game, Restangular, $q, $location) {
            return {
                getGameRoom: function () {
                    return Game.getCurrentGame();
                },
                getPlayers: function () {
                    var defer = $q.defer();
                    Restangular.one('games', Game.getCurrentGame().id).getList('players')
                        .then(function (data) {
                            defer.resolve(data);
                        }).catch(function () {
                            defer.reject();
                        });
                    return defer.promise;
                },
                connectWebsocket: function (game) {
                    var dataStream = $websocket('ws://localhost:9295/game');
                    dataStream.onOpen(function () {
                        console.log('connection open');
                        var dataGame = {
                            id: Game.getCurrentGame().id,
                            player: Game.getCurrentGame().player
                        };
                        dataStream.send(JSON.stringify(dataGame));
                    });

                    dataStream.onMessage(function (message) {
                        game.addPlayer(JSON.parse(message.data));
                        console.log('joined');
                    });
                },

                connectRoomWebsocket: function(game) {
                    var dataRoom = $websocket('ws://localhost:9298/choosewonder');
                    dataRoom.onOpen(function () {
                        console.log('open connection at choosewonder');
                        var dataGameModel = {
                            id: Game.getCurrentGame().id
                        };
                        dataRoom.send(JSON.stringify(dataGameModel));
                    });

                   dataRoom.onMessage(function (message) {
                        var room = JSON.parse(message.data);
                        if(room){
                            $location.path('/choosewonder');
                            console.log('room is complete');
                        }
                   });

                }
            }
        }
    ]);