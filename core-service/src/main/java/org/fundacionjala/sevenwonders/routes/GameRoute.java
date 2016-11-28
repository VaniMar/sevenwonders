/*
 * Copyright (c) Fundacion Jala. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */
package org.fundacionjala.sevenwonders.routes;

import org.apache.camel.spring.SpringRouteBuilder;
import org.fundacionjala.sevenwonders.core.rest.PlayerModel;
import org.fundacionjala.sevenwonders.core.rest.PrincipalGameModel;
import org.fundacionjala.sevenwonders.core.rest.ResourceModel;
import org.springframework.stereotype.Component;

/**
 * This registry the principal routes(GET, SET, PUT, DELETE) of game rooms
 *
 * @author Juan Barahona
 */

@Component
public class GameRoute extends SpringRouteBuilder {

    @Override
    public void configure() throws Exception {

        rest("/game").description("Gameboard rest service")
                .consumes("application/json").produces("application/json")

                .get("last").description("Get last game ").outTypeList(PrincipalGameModel.class)
                .to("bean:gameService?method=getLastCreated()")

                .get("{id}/players").description("Get list of players").typeList(PlayerModel.class)
                .to("bean:gameService?method=getPlayers(${header.id})")

                .get("{id}/players/{idPlayer}/storage").description("Get list of the resources").typeList(ResourceModel.class)
                .to("bean:gameService?method=getStorage(${header.id}, ${header.idPlayer})")

                .verb("options")
                .route()

                .setHeader("Access-Control-Allow-Origin", constant("*"))
                .setHeader("Access-Control-Allow-Methods", constant("GET, HEAD, POST, PUT, DELETE, OPTIONS"))
                .setHeader("Access-Control-Allow-Headers", constant("Origin, Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers"))
                .setHeader("Allow", constant("GET, HEAD, POST, PUT, DELETE, OPTIONS"));
    }
}

