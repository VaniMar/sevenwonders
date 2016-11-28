/*
 * Copyright (c) Fundacion Jala. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */
package org.fundacionjala.sevenwonders.core.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

/**
 * Created by Juan Manuel Barahona on 05/08/2016.
 */
public class PlayerModel {

    private int id;
    private String userName;
    private String token;
    private WonderModel wonderModel;
    private boolean isReady = false;
    private DeckModel deck;
    private CityModel cityModel;

    public DeckModel getDeck() {
        return deck;
    }

    public void setDeck(DeckModel deck) {
        this.deck = deck;
    }

    public boolean getIsReady(){ return isReady; }

    public void setIsReady(boolean isReady){ this.isReady = isReady; }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public WonderModel getWonderModel() {
        return wonderModel;
    }

    public void setWonderModel(WonderModel wonderModel) {
        this.wonderModel = wonderModel;
    }

    public CityModel getCity() { return cityModel; }

    public void setCity(CityModel cityModel) { this.cityModel = cityModel; }

    @Override
    public String toString() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return super.toString();
    }
}
